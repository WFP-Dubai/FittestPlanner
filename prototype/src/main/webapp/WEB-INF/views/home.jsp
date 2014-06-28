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
	<div id="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

			<div id="content" class="span10">
				<div class="sortable row-fluid">
					<a class="span4 well top-block "
						href="<c:url value="/activitytype/${activityTypesWithId['Leave']}"/>"
						data-placement="bottom" title="Staff on leave/BIS"
						data-rel="tooltip"> <span class="icon32 icon-red icon-user"></span>
						<span class="notification">4</span>
						<h3>Leave</h3> <span class="badge">${staffByActivityType['Leave'].size()}</span>
					</a> <a
						href="<c:url value="/activitytype/${activityTypesWithId['Field mission']}"/>"
						class="span4 well top-block" data-placement="bottom"
						title="Staff not assigned to any mission and not on leave/BIS"
						data-rel="tooltip"> <span class="icon32 icon-red icon-user"></span>
						<h3>Field Mission</h3> <span class="notification">0</span> <span
						class="badge">${staffByActivityType['Field mission'].size()}</span>
					</a> <a
						href="<c:url value="/activitytype/${activityTypesWithId['Other']}"/>"
						class="span4 well top-block" data-placement="bottom"
						title="Staff currently assigned to a mission" data-rel="tooltip">
						<span class="icon32 icon-red icon-user"></span>
						<h3>Other</h3> <span class="notification">5</span> <span
						class="badge">${staffByActivityType['Other'].size()}</span>
					</a>
				</div>
				<div class="sortable row-fluid">
					<div class="box span4">
						<div class="box-header well">
							<h2>Break In Service</h2>
							<div class="box-icon">
								<a href="#" class="btn btn-setting btn-round"><i
									class="icon-cog"></i></a> <a href="#"
									class="btn btn-minimize btn-round"><i
									class="icon-chevron-up"></i></a> <a href="#"
									class="btn btn-close btn-round"><i class="icon-remove"></i></a>
							</div>
						</div>
						<div class="box-content">
							<table
								class="table table-striped table-bordered bootstrap-datatable datatable">
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
											<td></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${breakInService.size()}</button>
								<button type="button" class="btn btn-default">View</button>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>

					<div class="box span4">
						<div class="box-header well">
							<h2>Available</h2>
							<div class="box-icon">
								<a href="#" class="btn btn-setting btn-round"><i
									class="icon-cog"></i></a> <a href="#"
									class="btn btn-minimize btn-round"><i
									class="icon-chevron-up"></i></a> <a href="#"
									class="btn btn-close btn-round"><i class="icon-remove"></i></a>
							</div>
						</div>
						<div class="box-content info-panel">
							<table
								class="table table-striped table-bordered bootstrap-datatable datatable">
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

							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${availableStaff.size()}</button>
								<button type="button" class="btn btn-default">View</button>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>

					<div class="box span4">
						<div class="box-header well">
							<h2>Not Available</h2>
							<div class="box-icon">
								<a href="#" class="btn btn-setting btn-round"><i
									class="icon-cog"></i></a> <a href="#"
									class="btn btn-minimize btn-round"><i
									class="icon-chevron-up"></i></a> <a href="#"
									class="btn btn-close btn-round"><i class="icon-remove"></i></a>
							</div>
						</div>
						<div class="box-content">
							<table
								class="table table-striped table-bordered bootstrap-datatable datatable">
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
											<td></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${notAvailableStaff.size()}</button>
								<button type="button" class="btn btn-default">View</button>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>

				<div class="row-fluid">
					<div class="box span12">
						<div class="box-header well">
							<h2>Staff Roles</h2>
							<div class="box-icon">
								<a href="#" class="btn btn-setting btn-round"><i
									class="icon-cog"></i></a> <a href="#"
									class="btn btn-minimize btn-round"><i
									class="icon-chevron-up"></i></a> <a href="#"
									class="btn btn-close btn-round"><i class="icon-remove"></i></a>
							</div>
						</div>
						<div class="box-content">
							<table
								class="table table-striped table-bordered bootstrap-datatable datatable">
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
							<div class="btn-group btn-group-sm pull-right">
								<button type="button" class="btn btn-primary">${staffRoles.size()}</button>
								<button type="button" class="btn btn-default">View</button>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>