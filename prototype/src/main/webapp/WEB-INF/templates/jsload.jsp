<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<script src="<c:url value="/js/jquery.min.js" />"></script>
	<script src="<c:url value="/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/js/jquery.datetimepicker.js" />"></script>
	<script src="<c:url value="/js/jquery.dataTables.js" />"></script>
	<script src="<c:url value="/js/fittest.js" />"></script>
	<script type="text/javascript">
		$(function() {
			$("[rel='tooltip']").tooltip();
			$("[rel='datetime']").datetimepicker();
			$("[rel='datatable']").DataTable({
				'pageLength': 5,
				'lengthMenu': [5, 10, 15, 25, 50, 100]
			});
		});
	</script>
</div>