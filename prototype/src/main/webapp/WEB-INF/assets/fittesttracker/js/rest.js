
var ftRest = (function (global, $) {
  "use strict";
  var _restURI = "/fittesttracker/rest/";
  var _URI = {};
  var _entityURI = {
    activities     : 'activities',
    activityTypes  : 'activityTypes',
    activityRoles  : 'activityRoles',
    confirmedTypes : 'confirmedTypes',
    profileTypes   : 'profileTypes',
    staff          : 'staff',
    staffTypes     : 'staffTypes',
    staffRoles     : 'staffRoles',
    countries      : 'countries',
    languages      : 'languages'
  };
  $.each(_entityURI, function(k, v) {
    _URI[k] = _restURI + v;
  });

  function _getEntityUri(entity, id) {
    return _URI[entity] + '/' + id;
  };

  function _findAll(entity, sortColumn, pageSize) {
    sortColumn = (typeof(sortColumn)==='undefined') ? '' : 'sort=' + sortColumn;
    pageSize = 'size=' + ((typeof(pageSize)==='undefined') ? '400' : pageSize);
    var uri = _URI[entity] + '?' + pageSize + '&' + sortColumn;
    return $.getJSON(uri).then(function(data) {
      return data._embedded[entity];
    });
  }

  function _findAllFunc(entity, sort) {
    return function () { return _findAll(entity, sort); };
  }
  
  function _findById(entity, id) {
    var uri = _URI[entity] + '/search/findById?id=' + id;
    return $.getJSON(uri).then(function(data) {
      return data._embedded[entity][0];
    });
  }
  
  function _findByIdFunc(entity) {
    return function (id) { return _findById(entity, id); };
  }
  
  function _findByIds(entity, ids) {
    if (ids.length == 0)
      return [];
    var strIds = _.reduce(ids, function(x, y) { return x + ',' + y; });
    var uri = _URI[entity] + '/search/findByIds?ids=' + strIds;
    return $.getJSON(uri).then(function(data) {
      return data._embedded[entity];
    });
  }

  function _findByIdsFunc(entity) {
    return function (ids) { return _findByIds(entity, ids); };
  }

  function _getActivitiesByConfirmedTypeId(confirmedTypeId) {
    var uri = _URI.activities + '/search/findByConfirmedType_Id?confirmedTypeId=' + confirmedTypeId;
    uri += '&sort=description&size=400';
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? [] : data._embedded['activities'];
    });
  }

  function _getActivityTypeByActivityId(activityId) {
    var uri = _URI.activityTypes + '/search/findByActivities_Id?activityId=' + activityId;
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? [] : data._embedded['activityTypes'][0];
    });
  }

  function _getActivityRolesByActivityId(activityId, sortColumn) {
    var uri = _URI.activityRoles
          + '/search/findByActivity_Id?activityId=' + activityId;
    uri += '&sort=' + sortColumn;
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? [] : data._embedded['activityRoles'];
    });
  }

  function _getProfileTypeByActivityRoleId(activityRoleId) {
    var uri = _URI.profileTypes + '/search/findByActivityRole_Id?activityRoleId=' + activityRoleId;  
  }

  function _saveOrUpdateActivityRole(activityRole) {
    var uri = _URI['activityRoles'];
    if (activityRole.id != null) {
      var srUri = uri + '/' + activityRole.id;
      return $.ajax({
        type: 'PUT',
        url: srUri,
        contentType: 'application/json',
        data: JSON.stringify(activityRole),
        success: function(data, status, xhr) {
          var entityUri = srUri;
          var activityUri = _getEntityUri('activities', activityRole.activityId);
          var profileTypeUri = activityRole.profileTypeId == null
                ? null : _getEntityUri('profileTypes', activityRole.profileTypeId);

          return $.ajax({
            type: 'PUT',
            url: entityUri + '/activity',
            contentType: 'text/uri-list',
            data: activityUri
          }).then(function() {
            if (profileTypeUri != null) {
              $.ajax({
                type: 'PUT',
                url: entityUri + '/profileType',
                contentType: 'text/uri-list',
                data: profileTypeUri
              });
            }
          });
        }
      });
    }
    else {
      activityRole.activity = _getEntityUri('activities', activityRole.activityId);
      activityRole.profileType = _getEntityUri('profileTypes', activityRole.profileTypeId);
      return $.ajax({
        type: 'POST',
        url: uri,
        contentType: 'application/json',
        data: JSON.stringify(activityRole)
      });
    }
  }

  function _saveStaffRoleWithActivityRole(staffRole, activityRole) {
    if (activityRole.id == null
        || ((activityRole.profileTypeId != staffRole.profileTypeId) && (activityRole.id != null))) {
      activityRole.id = null;
      activityRole.location = staffRole.location;
      activityRole.startDate = staffRole.startDate;
      activityRole.endDate = staffRole.endDate;
      return _saveOrUpdateActivityRole(activityRole).then(function(data, status, xhr) {
        staffRole.activityRoleId = xhr.getResponseHeader('Location').split('/').slice(-1)[0];
        return _saveOrUpdateStaffRole(staffRole);
      });
    }
    else {
      if (activityRole.startDate.length != 0) {
        var arstart = ftUtil.ISODateToDate(activityRole.startDate).valueOf();
        var srstart = ftUtil.ISODateToDate(staffRole.startDate).valueOf();
        if (srstart < arstart) {
          activityRole.startDate = staffRole.startDate;
        }
      }

      if (activityRole.endDate.length != 0) {
        var arend = ftUtil.ISODateToDate(activityRole.endDate).valueOf();
        var srend = ftUtil.ISODateToDate(staffRole.endDate).valueOf();
        if (srend > arend) {
          activityRole.endDate = staffRole.endDate;
        }
      }

      activityRole.profileTypeId = null;
      return _saveOrUpdateActivityRole(activityRole).then(function() {
        return _saveOrUpdateStaffRole(staffRole);
      });
    }
  }

  function _saveOrUpdateStaffRole(staffRole) {
    var uri = _URI['staffRoles'];

    if (staffRole.id != null) {
      var srUri = uri + '/' + staffRole.id;
      return $.ajax({
        type: 'PUT',
        url: srUri,
        contentType: 'application/json',
        data: JSON.stringify(staffRole),
        success: function(data, status, xhr) {
          var entityUri = srUri;
          var staffUri = _getEntityUri('staff', staffRole.staffId);
          var activityUri = _getEntityUri('activities', staffRole.activityId);
          var confirmedTypeUri = _getEntityUri(
            'confirmedTypes', staffRole.confirmedTypeId);
          var activityRoleUri = _getEntityUri(
            'activityRoles', staffRole.activityRoleId);

          return $.ajax({
            type: 'PUT',
            url: entityUri + '/staff',
            contentType: 'text/uri-list',
            data: staffUri
          }).then(function() {
            $.ajax({
              type: 'PUT',
              url: entityUri + '/confirmedType',
              contentType: 'text/uri-list',
              data: confirmedTypeUri
            });
          }).then(function() {
            $.ajax({
              type: 'PUT',
              url: entityUri + '/activityRole',
              contentType: 'text/uri-list',
              data: activityRoleUri
            });
          });
        }
      });
    }
    else {
      staffRole.staff = _getEntityUri('staff', staffRole.staffId);
      staffRole.confirmedType = _getEntityUri(
        'confirmedTypes', staffRole.confirmedTypeId);
      staffRole.activityRole = _getEntityUri(
        'activityRoles', staffRole.activityRoleId);
      return $.ajax({
        type: 'POST',
        url: uri,
        contentType: 'application/json',
        data: JSON.stringify(staffRole)
      });
    }
  };

  function _getStaffRolesByActivityRoleId(activityRoleId) {
    var uri = _URI.activityRoles + '/' + activityRoleId + '/staffRoles';
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? [] : data._embedded['staffRoles'];
    });
  }

  function _getStaffByStaffRoleId(staffRoleId) {
    var uri = _URI.staff + '/search/findByStaffRoles_Id?staffRoleId=' + staffRoleId;
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? null : data._embedded['staff'][0];
    });
  }

  function _getCountriesByActivityId(activityId) {
    var uri = _URI.activities + '/' + activityId + '/countries';
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? [] : data._embedded['countries'];
    });
  }

  function _getConfirmedTypeByActivityId(activityId) {
    var uri = _URI.confirmedTypes + '/search/findByActivities_Id?activityId=' + activityId;
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? null : data._embedded['confirmedTypes'][0];
    });
  }

  function _getConfirmedTypeByStaffRoleId(staffRoleId) {
    var uri = _URI.confirmedTypes + '/search/findByStaffRoles_Id?staffRoleId=' + staffRoleId;
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? null : data._embedded['confirmedTypes'][0];
    });
  }

  function _getDeploymentsUri(
    startDate, endDate, staffTypeIds, activityIds, confirmedOnly) {
    var dep_uri = '/search/findDeployments'
          + (confirmedOnly ? 'Confirmed' : '') + '?';
    var uri = _URI.staffRoles + dep_uri;
    uri += 'startDate=' + ftUtil.ISODate(startDate);
    uri += '&endDate=' + ftUtil.ISODate(endDate);
    var _staffTypeIds = ftUtil.arrayToCSV(staffTypeIds);
    var _activityIds = ftUtil.arrayToCSV(activityIds);
    uri += '&staffTypeIds=' + _staffTypeIds;
    uri += '&activityIds=' + _activityIds;
    return uri;
  }

  function _getDeployments(
    startDate, endDate, staffTypeIds, activityIds, confirmedOnly) {
    var uri = _getDeploymentsUri(
      startDate, endDate, staffTypeIds, activityIds, confirmedOnly);
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? [] : data._embedded['staffRoles'];
    });
  }

  function _getRequirementsUri(startDate, endDate, activityIds) {
    var uri = _URI.activityRoles + '/search/findRequirements?';
    uri += 'startDate=' + ftUtil.ISODate(startDate);
    uri += '&endDate=' + ftUtil.ISODate(endDate);
    var _activityIds = ftUtil.arrayToCSV(activityIds);
    uri += '&activityIds=' + _activityIds;
    return uri;
  }
  
  function _getRequirements(startDate, endDate, activityIds) {
    var uri = _getRequirementsUri(startDate, endDate, activityIds);
    return $.getJSON(uri).then(function(data) {
      return $.isEmptyObject(data) ? [] : data._embedded['activityRoles'];
    });
  }
  
  return {
    getConfirmedTypes: _findAllFunc('confirmedTypes', 'confirmedType'),
    getConfirmedTypeById: _findByIdFunc('confirmedTypes'),
    getConfirmedTypeByActivityId: _getConfirmedTypeByActivityId,
    getConfirmedTypeByStaffRoleId: _getConfirmedTypeByStaffRoleId,
    
    getActivities: _findAllFunc('activities', 'description'),
    getActivityById: _findByIdFunc('activities'),
    getActivitiesByConfirmedTypeId: _getActivitiesByConfirmedTypeId,

    getActivityRoles: _findAllFunc('activityRoles'),
    getActivityRoleById: _findByIdFunc('activityRoles'),
    getActivityRolesByActivityId: _getActivityRolesByActivityId,
    
    getActivityTypes: _findAllFunc('activityTypes'),
    getActivityTypeById: _findByIdFunc('activityTypes'),
    getActivityTypeByActivityId: _getActivityTypeByActivityId,

    getProfileTypes: _findAllFunc('profileTypes', 'profileType'),
    getProfileTypeById: _findByIdFunc('profileTypes'),
    getProfileTypeByActivityRoleId: _getProfileTypeByActivityRoleId,

    getStaff: _findAllFunc('staff', 'lastName'),
    getStaffById: _findByIdFunc('staff'),
    getStaffByIds: _findByIdsFunc('staff'),
    getStaffByStaffRoleId: _getStaffByStaffRoleId,

    getStaffTypes: _findAllFunc('staffTypes'),
    getStaffTypeById: _findByIdFunc('staffTypes'),
    
    getStaffRoles: _findAllFunc('staffRoles'),
    getStaffRoleById: _findByIdFunc('staffRoles'),
    getStaffRolesByIds: _findByIdsFunc('staffRoles'),
    getStaffRolesByActivityRoleId: _getStaffRolesByActivityRoleId,
    saveOrUpdateStaffRole: _saveOrUpdateStaffRole,
    saveStaffRoleWithActivityRole: _saveStaffRoleWithActivityRole,
    
    getCountries: _findAllFunc('countries'),
    getCountryById: _findByIdFunc('countries'),
    getCountriesByActivityId: _getCountriesByActivityId,

    getDeployments: _getDeployments,
    getRequirements: _getRequirements
  };
}(window || this, jQuery));
