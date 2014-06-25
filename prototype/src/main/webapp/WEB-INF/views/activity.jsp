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
				<div class="row" style="margin-bottom: 25px">
					<div class="col-lg-12">
						<div class="btn-toolbar btn-group-md" role="toolbar">
							<button type="button" class="btn btn-success">
								<span class="glyphicon glyphicon-plus"></span> New Activity
							</button>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-lg-12">
						<table class="display table-bordered" rel="dataTable">
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
												rel="tooltip">Link</label>
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