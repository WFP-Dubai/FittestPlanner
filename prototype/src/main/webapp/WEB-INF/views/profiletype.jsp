<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
<title>Profile Types</title>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/templates/sidebar-button.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

		<div id="page-content-wrapper">
			<div class="content-header"></div>

			<div class="page-content inset">
				<div class="row" style="margin-bottom: 25px">
					<div class="col-lg-12">
						<div class="btn-toolbar btn-group-md" role="toolbar">
							<button type="button" class="btn btn-success">
								<span class="glyphicon glyphicon-plus"></span> New Profile Type
							</button>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-lg-12">
						<table class="display table-bordered" rel="dataTable">
							<thead>
								<tr>
									<th>Profile Type</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="profileType" items="${profileTypes}">
									<tr>
										<td>${profileType.profileType}</td>
										<td>
											<div class="btn-toolbar btn-group-sm text-center"
												role="toolbar">
												<button type="button" class="btn btn-danger">
													<span class="glyphicon glyphicon-remove"></span> Delete
												</button>
												<button type="button" class="btn btn-primary">
													<span class="glyphicon glyphicon-edit"></span> Edit
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
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>