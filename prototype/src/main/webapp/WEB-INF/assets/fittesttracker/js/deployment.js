$(document).ready(function() {
  var timelineContainer = $('#timeline').addClass('timeline-print')[0];
  var timelineMarker = $('#timelineMarker')[0];
  var timelineOptions = {
    groupOrder: 'value',
    orientation: 'top',
    showCustomTime: true
  };
  var timeline = new vis.Timeline(timelineContainer);
  timeline.setOptions(timelineOptions);
  
  timeline.on('timechange', function (properties) {
    timelineMarker.innerHTML = ftUtil.simpleDate(properties.time);
  });

  var startDateInput = $('#startDate');
  var endDateInput = $('#endDate');
  var staffTypesSelect = $('#staffTypes');
  var activitiesSelect = $('#activities');
  var showConfirmedOnlyCheckbox = $('#showConfirmedOnly');
  var showEventsCheckbox = $('#showEvents');
  var submitDeploymentButton = $('#submit-deployment');
  var clearDeploymentButton = $('#clear-deployment');
  var selectAllActivities = $('#select-all-activities');
  var selectAllStaffTypes = $('#select-all-staffTypes');
  
  ftRest.getStaffTypes().then(function(staffTypes) {
    $.each(staffTypes, function(idx, st) {
      staffTypesSelect.append(new Option(st.staffType, st.id));
    });
  }).then(function() {
    ftRest.getActivities().then(function(activities) {
      $.each(activities, function(idx, act) {
        activitiesSelect.append(new Option(act.description, act.id));
      });
    });
  });

  function validateDeploymentPage() {
    if (startDateInput.val().length === 0) {
      alertify.alert('Start date is required');
      return false;      
    }
    if (endDateInput.val().length === 0) {
      alertify.alert('End date is required');
      return false;      
    }
    var startDate = ftUtil.simpleDateToDate(startDateInput.val());
    var endDate = ftUtil.simpleDateToDate(endDateInput.val());
    if (startDate.valueOf() > endDate.valueOf()) {
      alertify.alert('Start date must be before end date');
      return false;
    }
    
    if (staffTypesSelect.val() === null) {
      alertify.alert('Please select a staff type');
      return false;
    }
    if (activitiesSelect.val() === null) {
      alertify.alert('Please select an activity');
      return false;
    }
    return true;
  }
  
  submitDeploymentButton.click(function(event) {
    event.preventDefault();
    if (validateDeploymentPage()) {
      var startDate = startDateInput.val();
      var endDate = endDateInput.val();
      var staffTypes = staffTypesSelect.val();
      var activities = activitiesSelect.val();
      var confirmedOnly = showConfirmedOnlyCheckbox.is(':checked');
      
      timeline.setCustomTime(ftUtil.simpleDateToDate(startDate));
      timelineMarker.innerHTML = startDate;
      
      ftRest.getDeployments(startDate, endDate, staffTypes, activities, confirmedOnly)
        .then(function(staffRoles) {
          if (staffRoles.length == 0) {
            alertify.alert('No staff roles found');
            return;
          }

          var staffIds = _.uniq(_.map(staffRoles, function(sr) { return sr.staffId; }));
          ftRest.getStaffByIds(staffIds).then(function(staff) {
            var groups = _.map(staff, function(s) {
              return {id: s.id, content: $('<b>').text(s.name)[0], value: s.lastName};
            });
            return groups;
          }).then(function(groups) {
            var items = _.map(staffRoles, function(sr) {
              var activityName = $('<b>').text(sr.activityRoleDescription)[0];
              var profileType = $('<b>').text('[' + sr.activityRoleProfileTypeDescription + ']')[0];
              var confirmedType = ftUtil.colorLabel(
                sr.confirmedTypeColorCode, sr.confirmedTypeDescription);
              var dates = ftUtil.simpleDate(sr.startDate) +' to ' + ftUtil.simpleDate(sr.endDate);
              var content = $('<span>')
                    .append(activityName)
                    .append('<br/>')
                    .append(profileType)
                    .append('  ')
                    .append(confirmedType)
                    .append('<br/>')
                    .append(dates)[0];
              var className = 'color' + sr.id;
              ftUtil.timelineAppendColorClass(className, sr.activityTypeColorCode);
              
              return {
                id: sr.id,
                group: sr.staffId,
                className: className,
                content: content,
                start: ftUtil.ISODateToDate(sr.startDate),
                end: ftUtil.ISODateToDate(sr.endDate)
              };
            });
            
            timeline.setGroups(new vis.DataSet(groups));
            timeline.setItems(new vis.DataSet(items));
            timeline.redraw();
            timeline.setWindow(ftUtil.simpleDateToDate(startDate),
                               ftUtil.simpleDateToDate(endDate));
          });
        });
    }
  });
  
  clearDeploymentButton.click(function(event) {
    timeline.clear();
    $('select').select2('data', null);
  });
  
  selectAllActivities.click(function() {
    if(selectAllActivities.is(':checked') ){
      activitiesSelect.find('option').prop("selected","selected");
      activitiesSelect.trigger("change");
    }else{
      activitiesSelect.find('option').removeAttr("selected");
      activitiesSelect.trigger("change");
    } 
  });
  
  selectAllStaffTypes.click(function() {
    if(selectAllStaffTypes.is(':checked') ){
      staffTypesSelect.find('option').prop("selected","selected");
      staffTypesSelect.trigger("change");
    }
    else {
      staffTypesSelect.find('option').removeAttr("selected");
      staffTypesSelect.trigger("change");
    } 
  });

});
