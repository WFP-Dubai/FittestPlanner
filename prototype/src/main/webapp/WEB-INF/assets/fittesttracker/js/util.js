var ftUtil = (function (global, $) {

  function _colorLabel(color, text) {
    return $('<label>')
      .addClass('label label-default')
      .css('background-color', '#' + color)
      .text(text)[0];
  }

  function _simpleDate(date) {
    if (date === null) { return ''; }
    else { return moment(date).format('DD/MM/YYYY'); }
  }

  function _simpleDateToDate(date) {
    return  moment(date, 'DD/MM/YYYY').toDate();
  }

  function _ISODate(date) {
    if (date === null || date.length === 0) { return ''; }
    else {
      var res = moment(date, 'DD/MM/YYYY').format('YYYY-MM-DDTHH:mm:ss');
      return (res === 'Invalid date' ? '' : (res + 'Z'));
    }
  }

  function _ISODateToDate(date) {
    return moment(date, moment.ISO_8601).toDate();
  }

  function _arrayToCSV(xs) {
    return _.reduce(xs, function(x,y) { return x + ',' + y; });
  }

  function _camelCaseToReadable(str) {
    return str
      .replace(/([A-Z])/g, ' $1')
      .replace(/^./, function(str){ return str.toUpperCase(); });
  }

  function _linkToReadable(link) {
    return _.map(link.split('/'), function(s) {
      return s.charAt(0).toUpperCase() + s.slice(1);
    }).join(' ');
  }

  function _timelineAppendColorClass(className, color) {
    $('<style>')
      .prop('type', 'text/css')
      .html('.vis.timeline .item.'
            + className
            + ' { background-color: #' + color + ';'
            + ' box-shadow: 0 0 5px gray; }')
      .appendTo('head');
  }

  function _getIsAdmin() {
	  return $.get('/fittesttracker/is_admin', function (d){
          return d == 'true';
	  });
  }
  
  return {
    colorLabel: _colorLabel,
    simpleDate: _simpleDate,
    simpleDateToDate: _simpleDateToDate,
    ISODate: _ISODate,
    ISODateToDate: _ISODateToDate,
    arrayToCSV: _arrayToCSV,
    camelCaseToReadable: _camelCaseToReadable,
    linkToReadable: _linkToReadable,
    timelineAppendColorClass: _timelineAppendColorClass,
    getIsAdmin: _getIsAdmin
  };
}(window || this, jQuery));
