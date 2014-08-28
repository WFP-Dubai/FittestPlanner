$(document).ready(function() {
  var confirmedTypesSelect = $('#confirmedTypes');
  var activitiesSelect = $('#activities');
  var countriesList = $("#countries");
  var activityTypeLabel = $("#activityType");
  var activityClearButton = $('#planning-activity-clear-button');
  var operationTypeLabel = $('#operation-type');
  operationTypeLabel.text('Create New Staff Role');

  var planningPanelBody = $('#planning-panel-body');
  var planningPanelCollapseButton = $('#collapse-planning-panel');
  var planningTablePanelBody = $('#planning-table-panel-body');
  var planningTablePanelCollapseButton = $('#collapse-planning-table-panel');
  var planningTableBody = $('#planning-table-body');

  var staffRoleForm = $('#staff-role-form');
  var staffRoleStaffRoleId = $('#staff-role-id');
  var staffRoleActivityRoleId = $('#activity-role-id');
  var staffRoleActivityRoleLocation = $('#activity-role-start-date');
  var staffRoleActivityRoleStartDate = $('#activity-role-end-date');
  var staffRoleActivityRoleEndDate = $('#activity-role-location');
  var staffRoleActivityRoleProfileType = $('#activity-role-profile-type');
  
  var staffRoleStaff = $('#staff-role-staff');
  var staffRoleLocation = $('#staff-role-location');
  var staffRoleComments = $('#staff-role-comments');
  var staffRoleStartDate = $('#staff-role-startDate');
  var staffRoleEndDate = $('#staff-role-endDate');
  var staffRoleProfileTypes = $('#staff-role-profileTypes');
  
  var staffRoleConfirmedTypes = $('#staff-role-confirmedTypes');
  var staffRoleSaveButton = $('#staff-role-save');
  var staffRoleClearButton = $('#staff-role-clear');

  ftRest.getConfirmedTypes().then(function(confirmedTypes) {
    $.each(confirmedTypes, function (idx, ct) {
      confirmedTypesSelect.append(
        new Option(ct.confirmedType, ct.id));
      staffRoleConfirmedTypes.append(
        new Option(ct.confirmedType, ct.id));
    });
    confirmedTypesSelect.append(new Option('All', 'All'));
  });

  ftRest.getStaff().then(function(staff) {
    $.each(staff, function(idx, s) {
      var opt = new Option(s.name, s.id);
      staffRoleStaff.append(opt);
    });
  });

  ftRest.getProfileTypes().then(function(profileTypes) {
    $.each(profileTypes, function(idx, pt) {
      var opt = new Option(pt.profileType, pt.id);
      staffRoleProfileTypes.append(opt);
    });
  });
  
  confirmedTypesSelect.change(function() {
    var activities;
    var confirmedTypeId = $(this).val();
    activitiesSelect.select2('data', null);
    
    if (confirmedTypeId === 'All') {
      activities = ftRest.getActivities();
    }
    else {
      activities = ftRest.getActivitiesByConfirmedTypeId(confirmedTypeId);
    }

    activities.then(function(acts) {
      if (acts.length == 0) {
        activitiesSelect.attr('disabled', true);
        countriesList.empty();
        activityTypeLabel.empty();
      }
      else {
        activitiesSelect.attr('disabled', false);
        $.each(acts, function(idx, act) {
          activitiesSelect.append(
            new Option(act.description, act.id));
        });
      }
    });
  });

  function buildStaffRoleTable(activityRoleId, activityId) {
    return ftRest.getStaffRolesByActivityRoleId(activityRoleId)
      .then(function(staffRoles) {
        var tbl = $('<table>')
              .addClass('simple-dataTable table table-bordered table-responsive' +
                        ' table-hover staff-role-table');

        var headers = [
          'Staff Name', 'Staff Index',
          'Location',
          'Start Date', 'End Date',
          'Comments',
          'Confirmed Type',
          'Actions'
        ];
        var header_widths = [
          20, 10,
          10,
          10, 10,
          20,
          10,
          10
        ];
        var thead = $('<thead>').append(function() {
          var trhd = $('<tr>').addClass("success");
          $.each(headers, function(idx, hdr) {
            trhd.append($('<th>').width(header_widths[idx] + '%').append(hdr));
          });
          return trhd;
        });
        
        var tbody = $('<tbody>');
        var staffRolePromises = _.map(staffRoles, function(sr) {
          return ftRest.getStaffByStaffRoleId(sr.id);
        });
        var confirmedTypePromises = _.map(staffRoles, function(sr) {
          return ftRest.getConfirmedTypeByStaffRoleId(sr.id);
        });
        
        return $.when.apply($, staffRolePromises).then(function() {
          var staffByStaffRoles = arguments;
          return $.when.apply($, confirmedTypePromises).then(function() {
            var confirmedTypes = arguments;
            
            $.each(staffByStaffRoles, function(idx, staff) {
              var ct = confirmedTypes[idx];
              var sr = staffRoles[idx];
              var tr = $('<tr>').attr('id', sr.id);
              tr.append($('<td>').append(staff.name));
              tr.append($('<td>')
                        .addClass('text-center')
                        .append(staff.id));
              tr.append($('<td>').append(sr.location));
              tr.append($('<td>').append(ftUtil.simpleDate(sr.startDate)));
              tr.append($('<td>').append(ftUtil.simpleDate(sr.endDate)));
              tr.append($('<td>').append(sr.comments));
              tr.append($('<td>')
                        .addClass('text-center')
                        .append(
                          ftUtil.colorLabel(ct.confirmedColorCode, ct.confirmedType)));

              var actionButtons = $('<td>');
        	  if (isAdmin) {
        		  actionButtons
                	.append($('<div>').addClass('btn-group btn-group-md')
                		.append($('<button>')
                			.addClass('btn btn-danger')
                			.attr('type', 'button')
                			.click(function(event) {
                				ftUI.deleteEntityDialog('staffRole', sr.id, function() {
                					buildActivityRoleTable(activityId);
                				});
                			})
                			.append($('<span>')
                				.addClass('glyphicon glyphicon-trash'))));
        	  }
        	  
        	  actionButtons
 	  			    .append($('<div>').addClass('btn-group btn-group-md')
 	  		  		.append($('<a>').attr('href', '/fittesttracker/staffRole/' + sr.id + '/view')
	  		  			.append($('<button>')
	  		  				.addClass('btn btn-primary')
	  		  				.attr('type', 'button')
	  		  				.append($('<span>').addClass('glyphicon glyphicon-eye-open')))));

        	  tr.append(actionButtons);
              tbody.append(tr);
            });
            tbl.append(thead);
            tbl.append(tbody);
            return tbl;
            });


          });
        });
  }

  function buildActivityRoleTable(activityId, sortColumn) {
	  if (sortColumn == undefined) {
		  sortColumn = 'profileType.profileType';
	  }
    return ftRest.getActivityRolesByActivityId(activityId, sortColumn).then(function(activityRoles) {
      planningTableBody.empty();
      var staffRoleTablePromises = _.map(activityRoles, function(ar) {
        return buildStaffRoleTable(ar.id, activityId);
      });
      
      return $.when.apply($, staffRoleTablePromises).then(function() {
        var staffRoleTables = arguments;
        $.each(activityRoles, function(idx, ar) {
          var staffRoleTable = staffRoleTables[idx];
          var trinfo = $('<tr>')
                .addClass('info activity-role-header')
                .attr('id', ar.id);
          trinfo.append($('<td>').append(
            $('<button>')
              .addClass('btn btn-sm btn-danger collapse-button')
              .append(
                $('<span>')
                  .addClass('glyphicon glyphicon-arrow-up'))));
          trinfo.append($('<td>').addClass('warning').append(
            $('<b>').text(ar.profileTypeDescription)));
          trinfo.append($('<td>').append(ar.location));
          trinfo.append($('<td>').append(ftUtil.simpleDate(ar.startDate)));
          trinfo.append($('<td>').append(ftUtil.simpleDate(ar.endDate)));        
          
          var trStaffRole = $('<tr>');
          var tdStaffRole = $('<td>').attr('colspan', 5);
          tdStaffRole.append(staffRoleTable);
          trStaffRole.append(tdStaffRole);
          planningTableBody.append(trinfo);
          planningTableBody.append(trStaffRole);
        });
        return planningTableBody;
      }).done(function(activityRoleTable) {
        $('.staff-role-table').dataTable({
          destroy: true,
          searching: true,
          info: false,
          lengthChange: false,
          pageLength: 5
        });
      });
    });
  }

  function removeActiveStaffRoleRow() {
    $('.staff-role-table tr').removeClass('active');
  }

  function removeActiveActivityRoleRow() {
    $('.activity-role-header').removeAttr('style');
  }

  function setOperationType(operationType, classType) {
    operationTypeLabel.text(operationType);
    operationTypeLabel.attr('class', 'btn btn-' + classType + ' form-control');
  }

  function clearStaffRoleForm() {
    staffRoleStaffRoleId.val('');
    staffRoleActivityRoleId.val('');
    staffRoleActivityRoleLocation.val('');
    staffRoleActivityRoleStartDate.val('');
    staffRoleActivityRoleEndDate.val('');
    staffRoleActivityRoleProfileType.val('');
    staffRoleProfileTypes.select2('data', null);
    staffRoleStaff.select2('data', null);
    staffRoleConfirmedTypes.select2('data', null);
  }

  function buildPlanningPage(activityId, sortColumn) {
    ftRest.getCountriesByActivityId(activityId).then(function(cnts) {
      countriesList.empty();
      $.each(cnts, function(idx, cnt) {
        countriesList.append('<li>' + cnt.fullName + '</li>');
      });
    }).then(function() {
      return ftRest.getActivityTypeByActivityId(activityId).then(function(at) {
        activityTypeLabel.text(at.activityType);
      });
    }).then(function() {
      return buildActivityRoleTable(activityId, sortColumn);
    });
  }

  function validatePlanningPage() {
    if (confirmedTypesSelect.val() === null) {
      alertify.alert('Please select a confirmed type');
      return false;
    }
    if (activitiesSelect.val() === null || activitiesSelect.val().length == 0) {
      alertify.alert('Please select an activity');
      return false;
    }
    if (staffRoleStaff.val() === null) {
      alertify.alert('Please select a staff member');
      return false;
    }
    if (staffRoleStartDate.val().length === 0) {
      alertify.alert('Start date is required');
      return false;      
    }
    if (staffRoleEndDate.val().length === 0) {
      alertify.alert('End date is required');
      return false;      
    }

    var startDate = ftUtil.simpleDateToDate(staffRoleStartDate.val());
    var endDate = ftUtil.simpleDateToDate(staffRoleEndDate.val());
    if (startDate.valueOf() > endDate.valueOf()) {
      alertify.alert('Start date must be before end date');
      return false;
    }
    
    if (staffRoleProfileTypes.val() == null) {
        alertify.alert('Please select a staff role profile type');
        return false;
    }
    if (staffRoleConfirmedTypes.val() === null) {
      alertify.alert('Please select a staff role confirmed type');
      return false;
    }
    return true;
  }
  
  activitiesSelect.change(function() {
    var activityId = $(this).val();
    buildPlanningPage(activityId, 'profileType.profileType');
  });

  $('body').on('click', '#planning-table .collapse-button', function(event) {
    var button = $(this);
    var icon = button.children('span');
    var elem = $(this).closest('tr').next('tr');
    if (button.hasClass('btn-danger')) {
      button.switchClass('btn-danger', 'btn-success', 0);
      icon.switchClass('glyphicon-arrow-up', 'glyphicon-arrow-down', 0);
    }
    else {
      button.switchClass('btn-success', 'btn-danger', 0);
      icon.switchClass('glyphicon-arrow-down', 'glyphicon-arrow-up', 0);
    }
    elem.toggle({
      effect: 'highlight',
      duration: 150
    });
  });

  $('#planning-table-collapse-button').click(function() {
    var button = $(this);
    var icon = button.children('span');
    var toggleButtons = $('#planning-table .collapse-button');
    
    if (button.hasClass('btn-warning')) {
      button.switchClass('btn-warning', 'btn-success', 0);
      icon.switchClass('glyphicon-chevron-up', 'glyphicon-chevron-down', 0);
      icon.text(' Expand');
      $.each(toggleButtons, function(i, b) {
        var btn = $(b);
        if (btn.hasClass('btn-danger')) {
          btn.click();
        }
      });
    }
    else {
      button.switchClass('btn-success', 'btn-warning', 0);
      icon.switchClass('glyphicon-chevron-down', 'glyphicon-chevron-up', 0);
      icon.text(' Collapse');
      $.each(toggleButtons, function(i, b) {
        var btn = $(b);
        if (btn.hasClass('btn-success')) {
          btn.click();
        }
      });
    }
  });

  $('body').on('click', '.activity-role-header', function(event) {
    var row = $(this);
    removeActiveActivityRoleRow();
    row.css('border', '3px solid darkred');
    var activityRoleId = row.attr('id');
    ftRest.getActivityRoleById(activityRoleId).then(function(ar) {
      staffRoleActivityRoleId.val(activityRoleId);
      staffRoleActivityRoleLocation.val(ar.location);
      staffRoleActivityRoleStartDate.val(ftUtil.simpleDate(ar.startDate));
      staffRoleActivityRoleEndDate.val(ftUtil.simpleDate(ar.endDate));
      staffRoleActivityRoleProfileType.val(ar.profileTypeId);
      staffRoleProfileTypes.val(ar.profileTypeId);
      staffRoleProfileTypes.select2();
    });
    staffRoleForm.effect('highlight', 1600);
    setOperationType('Edit Activity Role', 'warning');
  });

  $('body').on('click', '.staff-role-table :not(thead) tr', function(event) {
    clearStaffRoleForm();
    removeActiveStaffRoleRow();
    removeActiveActivityRoleRow();
    var row = $(this);
    row.addClass('active');
    var staffRoleId = row.attr('id');
    ftRest.getStaffRoleById(staffRoleId).then(function(sr) {
      staffRoleStaffRoleId.val(staffRoleId);
      staffRoleActivityRoleId.val(sr.activityRoleId);
      
      staffRoleStaff.val(sr.staffId);
      staffRoleStaff.select2();

      staffRoleLocation.val(sr.location);
      staffRoleComments.val(sr.comments);
      staffRoleStartDate.val(ftUtil.simpleDate(sr.startDate));
      staffRoleEndDate.val(ftUtil.simpleDate(sr.endDate));

      staffRoleConfirmedTypes.val(sr.confirmedTypeId);
      staffRoleConfirmedTypes.select2();

      staffRoleActivityRoleProfileType.val(sr.activityRoleProfileTypeId);
      staffRoleProfileTypes.val(sr.activityRoleProfileTypeId);
      staffRoleProfileTypes.select2();
    });
    staffRoleForm.effect('highlight', 1600);
    setOperationType('Edit Staff Role', 'danger');
  });

  activityClearButton.click(function(event) {
    countriesList.empty();
    activityTypeLabel.empty();
    confirmedTypesSelect.select2('data', null);
    activitiesSelect.select2('data', null);
  });
  
  staffRoleClearButton.click(function(event) {
    clearStaffRoleForm();
    removeActiveStaffRoleRow();
    removeActiveActivityRoleRow();
    setOperationType('Create New Staff Role', 'success');
  });

  staffRoleSaveButton.click(function(event) {
    if (validatePlanningPage()) {
      var activityRoleId = parseInt(staffRoleActivityRoleId.val());
      var activityRole = {
        "id": isNaN(activityRoleId) ? null : activityRoleId,
        "location": staffRoleActivityRoleLocation.val(),
        "startDate": ftUtil.ISODate(staffRoleActivityRoleStartDate.val()),
        "endDate": ftUtil.ISODate(staffRoleActivityRoleEndDate.val()),
        "activityId": parseInt(activitiesSelect.val()),
        "profileTypeId": parseInt(staffRoleProfileTypes.val())
      };

      var staffRoleId = parseInt(staffRoleStaffRoleId.val());
      var staffRole = {
        "id": isNaN(staffRoleId) ? null : staffRoleId,
        "startDate": ftUtil.ISODate(staffRoleStartDate.val()),
        "endDate": ftUtil.ISODate(staffRoleEndDate.val()),
        "location": staffRoleLocation.val(),
        "comments": staffRoleComments.val(),
        "profileTypeId": parseInt(staffRoleActivityRoleProfileType.val()),
        "activityRoleId": parseInt(staffRoleActivityRoleId.val()),
        "confirmedTypeId": parseInt(staffRoleConfirmedTypes.val()),
        "staffId": parseInt(staffRoleStaff.val())
      };

      alertify.confirm(operationTypeLabel.text(), function(e) {
        if (e) {
          ftRest.saveStaffRoleWithActivityRole(staffRole, activityRole)
            .done(function() {
              var activityId = activitiesSelect.val();
              alertify.success('Saved Staff Role');
              buildActivityRoleTable(activityId, 'profileType.profileType');
            });
        }
        else {
          alertify.error('Operation cancelled');
        }
      });
    }
  });

  planningPanelCollapseButton.click(function(event) {
    var button = $(this);
    var icon = button.children('span');
    if (button.hasClass('btn-danger')) {
      button.switchClass('btn-danger', 'btn-success', 0);
      icon.switchClass('glyphicon-arrow-up', 'glyphicon-arrow-down', 0);
    }
    else {
      button.switchClass('btn-success', 'btn-danger', 0);
      icon.switchClass('glyphicon-arrow-down', 'glyphicon-arrow-up', 0);
    }
    planningPanelBody.toggle({
      effect: 'highlight',
      duration: 150
    });
  });
  
  planningTablePanelCollapseButton.click(function(event) {
    var button = $(this);
    var icon = button.children('span');
    if (button.hasClass('btn-danger')) {
      button.switchClass('btn-danger', 'btn-success', 0);
      icon.switchClass('glyphicon-arrow-up', 'glyphicon-arrow-down', 0);
    }
    else {
      button.switchClass('btn-success', 'btn-danger', 0);
      icon.switchClass('glyphicon-arrow-down', 'glyphicon-arrow-up', 0);
    }
    planningTablePanelBody.toggle({
      effect: 'highlight',
      duration: 150
    });
  });

  $('#planning-table-profile-col').click(function(event) {
    var activityId = activitiesSelect.val();
    buildActivityRoleTable(activityId, 'profileType.profileType');
    $('#planning-table th').removeClass('active');
    $(this).addClass('active');
  });
  $('#planning-table-location-col').click(function(event) {
    var activityId = activitiesSelect.val();
    buildActivityRoleTable(activityId, 'location');
    $('#planning-table th').removeClass('active');
    $(this).addClass('active');
  });
  $('#planning-table-start-date-col').click(function(event) {
    var activityId = activitiesSelect.val();
    buildActivityRoleTable(activityId, 'startDate');
    $('#planning-table th').removeClass('active');
    $(this).addClass('active');
  });
  $('#planning-table-end-date-col').click(function(event) {
    var activityId = activitiesSelect.val();
    buildActivityRoleTable(activityId, 'endDate');
    $('#planning-table th').removeClass('active');
    $(this).addClass('active');
  });
});
