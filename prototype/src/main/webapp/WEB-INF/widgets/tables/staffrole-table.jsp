<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row-fluid" style="margin-bottom: 25px">
	<div class="btn-toolbar btn-group-md" role="toolbar">
		<a href="<c:url value="/staff/role/new"/>">
			<button type="button" class="btn btn-success" data-rel="tooltip"
				title="Add a new staff role">
				<span class="icon-plus"></span> New Staff Role
			</button>
		</a>
	</div>
</div>

<div class="row-fluid">
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
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="staffRole" items="${allStaffRoles}">
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
					<td>
						<p class="label"
							style="<c:out value="background-color: #${staffRole.confirmedType.confirmedColorCode};"/>">
							${staffRole.confirmedType.confirmedType}
						</p>
					</td>
					<td>
						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<a href="#" data-toggle="modal"
								data-target="#deleteStaffRoleModal">
								<button type="button" class="btn btn-danger">
									<span class="icon-remove"></span> Delete
								</button>
							</a> <a href="<c:url value="/staff/role/${staffRole.ID}/edit"/>">
								<button type="button" class="btn btn-primary">
									<span class="icon-edit"></span> Edit
								</button>
							</a> <a href="<c:url value="/staff/role/${staffRole.ID}"/>">
								<button type="button" class="btn btn-success">
									<span class="icon-ok"></span> View
								</button>
							</a>
						</div>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<div class="modal hide" id="deleteStaffRoleModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>Delete Staff Role</h3>
	</div>
	<div class="modal-body">
		<p>Are you sure you want to delete this staff role?</p>
	</div>
	<div class="modal-footer">
		<a href="#" class="btn" data-dismiss="modal">Cancel</a> <a
			href="<c:url value="/staff/role/${staffRole.ID}/delete"/>"
			class="btn btn-danger">Delete</a>
	</div>
</div>