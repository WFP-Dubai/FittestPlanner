<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
<title>Staff</title>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/templates/sidebar-button.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

		<div id="page-content-wrapper">
			<div class="content-header"></div>

			<div class="page-content inset">
				<div class="row">
					<div class="col-lg-12">
						<table
							class="table table-bordered table-responsive table-condensed">
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
												<br />
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