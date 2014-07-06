<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
<title>Countries</title>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

			<div id="content" class="span10">
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
										<div class="btn-toolbar btn-group-sm text-center"
											role="toolbar">
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
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>