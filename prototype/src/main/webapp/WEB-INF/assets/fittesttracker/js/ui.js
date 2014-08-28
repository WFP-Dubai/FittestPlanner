var ftUI = (function (global, $) {
  var _appURI = '/fittesttracker/';
  function _deleteEntityDialog(entity, id, reload) {
    var uri = _appURI + entity + '/' + id + '/delete';
    var name = ftUtil.linkToReadable(entity);
    alertify.confirm('Confirm Deletion of ' + name, function(e) {
      if (e) {
        $.ajax({
          url: uri,
          type: 'POST'
        }).fail(function() {
          console.log('there');
          alertify.alert('Failed to delete ' + name);
        }).success(function() {
          if (reload == undefined) {
        	  window.location.reload();
          }
          else {
        	  reload();
          }
          alertify.success('Deleted ' + name);
        });
      }
      else {
        
      }
    });
  }
  
  return {
    deleteEntityDialog: _deleteEntityDialog
  };
}(window || this, jQuery));
