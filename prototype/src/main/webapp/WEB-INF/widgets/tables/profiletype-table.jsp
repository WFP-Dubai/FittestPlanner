<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row-fluid" style="margin-bottom: 25px">
	<div class="span12">
		<div class="btn-toolbar btn-group-md" role="toolbar">
			<button type="button" class="btn btn-success" data-rel="tooltip"
				title="Add a new staff profile type">
				<span class="icon-plus"></span> New Profile Type
			</button>
		</div>
	</div>
</div>

<div class="row-fluid">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th>Profile Type</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="profileType" items="${allProfileTypes}">
				<tr>
					<td>${profileType.profileType}</td>
					<td>
						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<a href="#" data-toggle="modal"
								data-id="<c:out value="${profileType.ID}"/>"
								data-target="#deleteProfileTypeModal">
								<button type="button" class="btn btn-danger">
									<span class="icon-remove"></span> Delete
								</button>
							</a> <a
								href="<c:url value="/staff/profiletype/${profileType.ID}/edit"/>">
								<button type="button" class="btn btn-primary">
									<span class="icon-edit"></span> Edit
								</button>
							</a> <a href="<c:url value="/staff/profiletype/${profileType.ID}"/>">
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

<div class="modal hide" id="deleteProfileTypeModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>Delete Profile Type</h3>
	</div>
	<div class="modal-body">
		<p>Are you sure you want to delete this profile type?</p>
	</div>
	<div class="modal-footer">
		<a href="#" class="btn" data-dismiss="modal">Cancel</a> <a
			id="modalLink" href="<c:url value="/staff/profiletype/#ID/delete"/>"
			class="btn btn-danger">Delete</a>
	</div>
</div>