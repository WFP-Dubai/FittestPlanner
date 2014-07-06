$(document).ready(function() {
	$("[rel='datetime']").datetimepicker();

	$(document).on('click', "a[data-toggle='modal']", function() {
		var target = $(this).data('target');
		var data = $(this).data('id');
	    var link = $(target + " .modal-footer form")[0];
	    link.action = link.action.replace('#ID', data);
	});
});