<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/templates/sidebar-button.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

		<div id="page-content-wrapper">
			<div class="content-header">Test</div>

			<div class="page-content inset">
				<div class="row">
					<div class="col-lg-12">
						<table class="table table-bordered table-responsive">
							<thead>
								<tr>
									<th>Activity</th>
									<th>Staff</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="act" items="${activitySummary}">
									<tr>
										<td>${act.activityType}</td>
										<td>${act.numberOfStaff}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>