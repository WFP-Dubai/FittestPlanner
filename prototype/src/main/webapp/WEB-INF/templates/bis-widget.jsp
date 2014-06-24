<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">
		<h3 class="panel-title">Break In Service</h3>
	</div>
	<div class="panel-body">
		<table class="table table-bordered table-responsive">
			<thead>
				<tr>
					<th>Name</th>
					<th>Break Start</th>
					<th>Break End</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="break" items="${breakInService}">
					<tr>
						<td></td>
						<td></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>