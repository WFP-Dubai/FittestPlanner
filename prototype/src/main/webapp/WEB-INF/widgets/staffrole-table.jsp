<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="box-header well">
	<h2>Staff Roles</h2>
	<div class="box-icon">
		<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
		<a href="#" class="btn btn-minimize btn-round"><i
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
				<th>Confirm Type</th>
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
							<c:forEach var="activityRole" items="${staffRole.activityRoles}">
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