<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Activity Type By ID</title>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

			<div id="content" class="span10">
				<div class="row-fluid" style="margin-bottom: 25px">
					<div class="btn-toolbar btn-group-md" role="toolbar">
						<button type="button" class="btn btn-success" data-rel="tooltip"
							title="Add a activity type">
							<span class="icon-plus"></span> Country
						</button>
					</div>
				</div>

				<div class="row-fluid">
					<table
						class="table table-striped table-bordered bootstrap-datatable datatable">
						<thead>
							<tr>
								<th>Activity Type</th>
								<th>Color Code</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="activityType" items="${activityTypes}">
								<tr>
									<td>${activityType.activityType}</td>
									<td>${activityType.colorCode}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>