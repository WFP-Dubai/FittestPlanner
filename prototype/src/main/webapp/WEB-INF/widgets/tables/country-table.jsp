<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row-fluid" style="margin-bottom: 25px">
	<div class="btn-toolbar btn-group-md" role="toolbar">
		<button type="button" class="btn btn-success" data-rel="tooltip"
			title="Add a new country">
			<span class="icon-plus"></span> New Country
		</button>
	</div>
</div>

<div class="row-fluid">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th>ISO Code</th>
				<th>Full Name</th>
				<th>Region</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="country" items="${allCountries}">
				<tr>
					<td><c:out value="${country.ISOCode}" /></td>
					<td><c:out value="${country.fullName}" /></td>
					<td><c:out value="${country.region}" /></td>
					<td>
						<div class="btn-toolbar btn-group-sm text-center" role="toolbar">
							<a href="#" data-toggle="modal"
								data-id="<c:out value="${country.ID}"/>"
								data-target="#deleteCountryModal">
								<button type="button" class="btn btn-danger">
									<span class="icon-remove"></span> Delete
								</button>
							</a> <a href="<c:url value="/country/${country.ID}/edit"/>">
								<button type="button" class="btn btn-primary">
									<span class="icon-edit"></span> Edit
								</button>
							</a> <a href="<c:url value="/country/${country.ID}"/>">
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

<div class="modal hide" id="deleteCountryModal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
		<h3>Delete Country</h3>
	</div>
	<div class="modal-body">
		<p>Are you sure you want to delete this country?</p>
	</div>
	<div class="modal-footer">
		<a href="#" class="btn" data-dismiss="modal">Cancel</a> <a
			id="modalLink" href="<c:url value="/country/#ID/delete"/>"
			class="btn btn-danger">Delete</a>
	</div>
</div>