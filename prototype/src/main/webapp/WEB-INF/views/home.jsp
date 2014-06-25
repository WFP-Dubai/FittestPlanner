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
			<div class="content-header"></div>

			<div class="page-content inset">

				<div class="row">

					<div class="col-md-4">
						<a
							href="<c:url value="/activitytype/${activityTypesWithId['Leave']}"/>">
							<button type="button" class="btn btn-primary btn-block">
								<b>Leave</b> <span class="badge">${staffByActivityType['Leave'].size()}</span>
							</button>
						</a>
					</div>
					<div class="col-md-4">
						<a
							href="<c:url value="/activitytype/${activityTypesWithId['Field mission']}"/>">
							<button type="button" class="btn btn-success btn-block text-center">
								<b>Field Mission</b> <span class="badge">${staffByActivityType['Field mission'].size()}</span>
							</button>
						</a>
					</div>
					<div class="col-md-4">
						<a
							href="<c:url value="/activitytype/${activityTypesWithId['Other']}"/>">
							<button type="button"
								class="btn btn-md btn-info btn-block text-center">
								<b>Other</b> <span class="badge">${staffByActivityType['Other'].size()}</span>
							</button>
						</a>
					</div>
				</div>
			</div>



			<div class="row">
				<div class="col-sm-4">
					<div class="panel panel-default">

						<div class="panel-heading clearfix">
							Break In Service
							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${breakInService.size()}</button>
								<button type="button" class="btn btn-default">Edit</button>
							</div>
						</div>
						<div class="info-panel">
							<!--  <div class="panel-body"></div> -->
							<table
								class="table table-bordered table-responsive table-striped table-condensed">
								<thead>
									<tr>
										<th>Name</th>
										<th>Break Start</th>
										<th>Break End</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="staff" items="${breakInService}">
										<tr>
											<td>${staff.name}</td>
											<td></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>


				<div class="col-sm-4">
					<div class="panel panel-default">
						<div class="panel-heading clearfix">
							Available
							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${availableStaff.size()}</button>
								<button type="button" class="btn btn-default">Edit</button>
							</div>
						</div>
						<div class="info-panel">
                            <!--  <div class="panel-body"></div> -->
							<table
								class="table table-bordered table-responsive table-striped table-condensed">
								<thead>
									<tr>
										<th>Name</th>
										<th>Profile Type</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="staff" items="${availableStaff}">
										<tr>
											<td>${staff.name}</td>
											<td>
												<ul class="list-group">
													<c:forEach var="profileType" items="${staff.profileTypes}">
														<li class="list-group-item">${profileType.profileType}</li>
													</c:forEach>
												</ul>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<div class="col-sm-4">
					<div class="panel panel-default">
						<div class="panel-heading clearfix">
							Not Available
							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${notAvailableStaff.size()}</button>
								<button type="button" class="btn btn-default">Edit</button>
							</div>
						</div>
						<div class="info-panel">
                            <!--  <div class="panel-body"></div> -->
							<table
								class="table table-bordered table-responsive table-striped table-condensed">
								<thead>
									<tr>
										<th>Name</th>
										<th>Current Activity</th>
										<th>Activity End Date</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="staff" items="${notAvailableStaff}">
										<tr>
											<td>${staff.name}</td>
											<td></td>
											<td></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-12">
					<div class="panel panel-default">
						<div class="panel-heading clearfix">
							Staff Roles
							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${staffRoles.size()}</button>
								<button type="button" class="btn btn-default">Edit</button>
							</div>
						</div>
						<div class="info-panel">
                            <!--  <div class="panel-body"></div> -->
							<table class="table table-bordered table-striped table-condensed table-fixed-header">
								<thead class="header">
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
														<li class="list-group-item">${staff.firstName}
															${staff.lastName}</li>
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