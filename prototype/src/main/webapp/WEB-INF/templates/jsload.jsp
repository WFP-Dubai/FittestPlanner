<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<script src="<c:url value="/js/jquery.min.js" />"></script>
	<script src="<c:url value="/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/js/fittest.js" />"></script>
	<script src="<c:url value="/js/jquery.datetimepicker.js" />"></script>
	<script type="text/javascript">
		$(function() {
			$("[rel='tooltip']").tooltip();
			$("[rel='datetime']").datetimepicker();
		});
	</script>
</div>