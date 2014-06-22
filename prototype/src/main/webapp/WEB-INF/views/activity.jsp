<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
<title>Activities</title>
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
						<table class="table table-striped table-bordered table-responsive">
							<thead>
								<tr>
									<th>ID</th>
									<th>Description</th>
									<th>EtcServiceMap</th>
									<th>Countries</th>
									<th>Mission Name</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="activity" items="${activities}">
									<tr>
										<td><c:out value="${activity.ID}" /></td>
										<td><c:out value="${activity.description}" /></td>
										<td><a href="<c:url value="${activity.etcServiceMap}"/>">Link</a></td>
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
													<li class="list-group-item"><c:out value="${mission.missionName}"/></li>
												</c:forEach>
											</ul>
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