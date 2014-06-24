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
					<div class="col-md-4">
						<div class="well">
							<span class="label label-info"> Leave </span> <span
								class="badge pull-right">${staffByActivityType['Leave'].size()}</span>
						</div>
					</div>

					<div class="col-md-4">
						<div class="well">
							<span class="label label-warning">Field Mission</span> <span
								class="badge pull-right">${staffByActivityType['Field mission'].size()}</span>
						</div>
					</div>
					<div class="col-md-4">
						<div class="well">
							<span class="label label-success">Other</span> <span
								class="badge pull-right">${staffByActivityType['Other'].size()}</span>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-4">
						<div class="panel panel-default">
							<div class="panel-heading">Break In Service</div>
							<div class="panel-body">
								<table class="table table-bordered table-responsive">
									<thead>
										<tr>
											<th>First Name</th>
											<th>Last Name</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="staff" items="${breakInService}">
											<tr>
												<td>${staff.firstName}</td>
												<td>${staff.lastName}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-default">
							<div class="panel-heading">Available</div>
							<div class="panel-body">
								<table class="table table-bordered table-responsive">
									<thead>
										<tr>
											<th>Name</th>
											<th>Profile Type</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="staff" items="${breakInService}">
											<tr>
												<td>${staff.firstName}</td>
												<td>${staff.lastName}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-default">
							<div class="panel-heading">Not Available</div>
							<div class="panel-body">
								<table class="table table-bordered table-responsive">
									<thead>
										<tr>
											<th>Name</th>
											<th>Current Activity</th>
											<th>Activity End Date</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="staff" items="${breakInService}">
											<tr>
												<td>${staff.firstName}</td>
												<td>${staff.lastName}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-mid-4">
						<div class="panel panel-default">
							<div class="panel-heading">Staff Roles</div>
							<div class="panel-body" style="height: 400px; overflow: auto">
								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>ID</th>
											<th>Name</th>
											<th>Profile Type</th>
											<th>Location</th>
											<th>Activity</th>
											<th>Start Date</th>
											<th>End Date</th>
											<th>Confirmed Type</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="staffRole" items="${staffRoles}">
											<tr>
												<td>${staffRole.ID}</td>
												<td>
													<ul class="list-group">
														<c:forEach var="staff" items="${staffRole.staff}">
															<li class="list-group-item">${staff.firstName} ${staff.lastName}</li>
														</c:forEach>
													</ul>
												</td>
												<td><c:forEach var="staff" items="${staffRole.staff}">
														<ul class="list-group">
															<c:forEach var="profileType" items="${staff.profileTypes}">
																<li class="list-group-item">${profileType.profileType}</li>
															</c:forEach>
														</ul>
													</c:forEach></td>
												<td>${staffRole.location}</td>
												<td>
													<ul class="list-group">
														<c:forEach var="activityRole"
															items="${staffRole.activityRoles}">
															<li class="list-group-item">${activityRole.activity.description}</li>
														</c:forEach>
													</ul>
												</td>
												<td>${staffRole.startDate}</td>
												<td>${staffRole.endDate}</td>
												<td>${staffRole.staffConfirmedType.staffConfirmedType}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>