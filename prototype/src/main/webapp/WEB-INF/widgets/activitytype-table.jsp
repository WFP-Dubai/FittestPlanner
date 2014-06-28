<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row-fluid" style="margin-bottom: 25px">
	<div class="btn-toolbar btn-group-md" role="toolbar">
		<button type="button" class="btn btn-success" data-rel="tooltip"
			title="Add a new activity type">
			<span class="icon-plus"></span> New Activity Type
		</button>
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
			<c:forEach var="activityType" items="${activityTypes}">
				<tr>
					<td>${activityType.activityType}</td>
					<td>${activityType.colorCode}</td>
					<td>

						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<button type="button" class="btn btn-danger">
								<span class="icon-remove"></span> Delete
							</button>
							<button type="button" class="btn btn-primary">
								<span class="icon-edit"></span> Edit
							</button>
						</div>

					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>