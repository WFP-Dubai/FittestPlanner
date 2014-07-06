<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row-fluid" style="margin-bottom: 25px">
	<div class="btn-toolbar btn-group-md" role="toolbar">
		<a href="<c:url value="/activity/role/new"/>">
			<button type="button" class="btn btn-success" data-rel="tooltip"
				title="Add a new activity role">
				<span class="icon-plus"></span> New Activity Role
			</button>
		</a>
	</div>
</div>

<div class="row-fluid">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th>Activity</th>
				<th>Profile Type</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="activityRole" items="${allActivityRoles}">
				<tr>
					<td>${activityRole.activity}</td>
					<td>${activityRole.profileType}</td>
					<td>${activityRole.startDate}</td>
					<td>${activityRole.endDate}</td>
					<td>
						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<a href="#" data-toggle="modal"
								data-id="<c:out value="${activityRole.ID}"/>"
								data-target="#deleteActivityRoleModal">
								<button type="button" class="btn btn-danger">
									<span class="icon-remove"></span> Delete
								</button>
							</a> <a
								href="<c:url value="/activity/role/${activityRole.ID}/edit"/>">
								<button type="button" class="btn btn-primary">
									<span class="icon-edit"></span> Edit
								</button>
							</a> <a href="<c:url value="/activity/role/${activityRole.ID}"/>">
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

<div class="modal hide" id="deleteActivityRoleModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>Delete Activity Role</h3>
	</div>
	<div class="modal-body">
		<p>Are you sure you want to delete this activity role?</p>
	</div>
	<div class="modal-footer">
		<a href="#" class="btn" data-dismiss="modal">Cancel</a> <a
			id="modalLink" href="<c:url value="/activity/role/#ID/delete"/>"
			class="btn btn-danger">Delete</a>
	</div>
</div>