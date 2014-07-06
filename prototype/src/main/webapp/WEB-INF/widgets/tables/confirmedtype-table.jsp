<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row-fluid" style="margin-bottom: 25px">
	<div class="btn-toolbar btn-group-md" role="toolbar">
		<a href="<c:url value="/activity/type/new"/>">
			<button type="button" class="btn btn-success" data-rel="tooltip"
				title="Add a new activity type">
				<span class="icon-plus"></span> New Activity Type
			</button>
		</a>
	</div>
</div>

<div class="row-fluid">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th>Activity Type</th>
				<th>Color Code</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="confirmedType" items="${allConfirmedTypes}">
				<tr>
					<td>${confirmedType.confirmedType}</td>
					<td>${confirmedType.confirmedColorCode}</td>
					<td>

						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<a href="#" data-toggle="modal"
								data-id="<c:out value="${confirmedType.ID}"/>"
								data-target="#deleteConfirmedTypeModal">
								<button type="button" class="btn btn-danger">
									<span class="icon-remove"></span> Delete
								</button>
							</a> <a
								href="<c:url value="/activity/confirmedtype/${confirmedType.ID}/edit"/>">
								<button type="button" class="btn btn-primary">
									<span class="icon-edit"></span> Edit
								</button>
							</a> <a
								href="<c:url value="/activity/confirmedtype/${confirmedType.ID}"/>">
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

<div class="modal hide" id="deleteConfirmedTypeModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>Delete Confirmed Type</h3>
	</div>
	<div class="modal-body">
		<p>Are you sure you want to delete this confirmed type?</p>
	</div>
	<div class="modal-footer">
		<a href="#" class="btn" data-dismiss="modal">Cancel</a> <a
			id="modalLink"
			href="<c:url value="/activity/confirmedtype/#ID/delete"/>"
			class="btn btn-danger">Delete</a>
	</div>
</div>