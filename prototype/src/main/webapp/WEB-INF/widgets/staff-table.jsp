<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row-fluid" style="margin-bottom: 25px">
	<div class="span12">
		<div class="btn-toolbar btn-group-md" role="toolbar">
			<a href="<c:url value="/staff/new"/>">
				<button type="button" class="btn btn-success" data-rel="tooltip"
					title="Add a staff member">
					<span class="icon-plus"></span> New Staff
				</button>
			</a>
		</div>
	</div>
</div>

<div class="row-fluid">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th>Index</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>DOB</th>
				<th>Title</th>
				<th>Profile Type</th>
				<th>Nationality</th>
				<th>Color Code</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="staff" items="${allStaff}">
				<tr>
					<td><c:out value="${staff.index}" /></td>
					<td><c:out value="${staff.firstName}" /></td>
					<td><c:out value="${staff.lastName}" /></td>
					<td><c:out value="${staff.dateOfBirth}" /></td>
					<td><c:out value="${staff.title}" /></td>
					<td>
						<ul class="list-group">
							<c:forEach var="profileType" items="${staff.profileTypes}">
								<li class="list-group-item">
									<p>
										<c:out value="${profileType.profileType}" />
									</p>
								</li>
							</c:forEach>
						</ul>
					</td>
					<td>
						<ul class="list-group">
							<c:forEach var="nationality" items="${staff.nationalities}">
								<li class="list-group-item">
									<p>
										<c:out value="${nationality.fullName}" />
									</p>
								</li>
							</c:forEach>
						</ul>
					</td>
					<td
						style="<c:out value="background-color: #${staff.staffColorCode};"/> ">
						<div>
							<c:out value="${staff.staffColorCode}" />
						</div>
					</td>
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