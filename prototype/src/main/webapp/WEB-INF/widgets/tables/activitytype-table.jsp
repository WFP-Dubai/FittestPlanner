<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
			<c:forEach var="activityType" items="${allActivityTypes}">
				<tr>
					<td>${activityType.activityType}</td>
					<td>${activityType.colorCode}</td>
					<td>

						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<a href="#" data-toggle="modal"
								data-id="<c:out value="${activityType.ID}"/>"
								data-target="#deleteActivityTypeModal">
								<button type="button" class="btn btn-danger">
									<span class="icon-remove"></span> Delete
								</button>
							</a> <a
								href="<c:url value="/activity/type/${activityType.ID}/edit"/>">
								<button type="button" class="btn btn-primary">
									<span class="icon-edit"></span> Edit
								</button>
							</a> <a href="<c:url value="/activity/type/${activityType.ID}"/>">
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

<div class="modal hide" id="deleteActivityTypeModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>Delete Activity Type</h3>
	</div>
	<div class="modal-body">
		<p>Are you sure you want to delete this activity type?</p>
	</div>
	<div class="modal-footer">
        <c:url var="deleteURL" value="/activity/type/#ID/delete" />
        <form method="POST" action="${deleteURL}">
		<a href="#" class="btn" data-dismiss="modal">Cancel</a>
			<input type="submit" id="modalLink" value="Delete" class="btn btn-danger" />
		</form>
	</div>
</div>