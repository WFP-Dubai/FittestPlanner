<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row-fluid" style="margin-bottom: 25px">
	<div class="btn-toolbar btn-group-md" role="toolbar">
		<a href="<c:url value="/activity/new"/>">
			<button type="button" class="btn btn-success" data-rel="tooltip"
				title="Add a new activity">
				<span class="icon-plus"></span> New Activity
			</button>
		</a>
	</div>
</div>

<div class="row-fluid">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th>ID</th>
				<th>Description</th>
				<th>EtcServiceMap</th>
				<th>Countries</th>
				<th>Mission Name</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="activity" items="${activities}">
				<tr>
					<td><p class="text-center">
							<c:out value="${activity.ID}" />
						</p></td>
					<td><c:out value="${activity.description}" /></td>
					<td class="text-center"><a
						href="<c:url value="${activity.etcServiceMap}"/>"> <label
							class="label label-primary" data-toggle="tooltip"
							data-placement="bottom" title="${activity.etcServiceMap}"
							data-rel="tooltip">Link</label>
					</a></td>
					<td>
						<ul class="list-group">
							<c:forEach var="country" items="${activity.countries}">
								<li class="list-group-item">
									<p>
										<c:out value="${country.fullName}" />
									</p>
								</li>
							</c:forEach>
						</ul>
					</td>
					<td>
						<ul class="list-group">
							<c:forEach var="mission" items="${activity.missions}">
								<li class="list-group-item"><c:out
										value="${mission.missionName}" /></li>
							</c:forEach>
						</ul>
					</td>
					<td>

						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<a href="#" data-toggle="modal" data-target="#deleteActivityModal">
								<button type="button" class="btn btn-danger">
									<span class="icon-remove"></span> Delete
								</button>
							</a>
							<a href="<c:url value="/activity/${activity.ID}/edit"/>">
								<button type="button" class="btn btn-primary">
									<span class="icon-edit"></span> Edit
								</button>
							</a> <a href="<c:url value="/activity/${activity.ID}"/>">
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

<div class="modal hide" id="deleteActivityModal">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">×</button>
        <h3>Settings</h3>
    </div>
    <div class="modal-body">
        <p>Are you sure you want to delete this activity?</p>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn" data-dismiss="modal">Cancel</a>
        <a href="<c:url value="/staff/${staff.index}/delete"/>" class="btn btn-danger">Delete</a>
    </div>
</div>