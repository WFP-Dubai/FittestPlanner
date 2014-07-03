<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

			<div id="content" class="span10">
				<ul class="nav nav-tabs" id="myTab">
					<li class="active"><a href="#info">Active Info</a></li>
					<li><a href="#roles">Staff Roles</a></li>
					<li><a href="#charts">Charts</a></li>
				</ul>
				<div id="homeTabContent" class="tab-content" style="padding: 10px">
					<div class="tab-pane active" id="info">
						<jsp:include page="/WEB-INF/widgets/misc/staff-notification.jsp"></jsp:include>
						<jsp:include page="/WEB-INF/widgets/misc/staff-summary.jsp"></jsp:include>

					</div>
					<div class="tab-pane" id="roles">
						<div class="row-fluid">
							<jsp:include page="/WEB-INF/widgets/tables/staffrole-table.jsp"></jsp:include>
						</div>
					</div>
					<div class="tab-pane" id="charts">
						<div class="row-fluid">
							<div class="span4">
								<jsp:include
									page="/WEB-INF/widgets/charts/activitytype-chart.jsp"></jsp:include>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
	<jsp:include
		page="/WEB-INF/widgets/charts/activitytype-chart-jsload.jsp"></jsp:include>
</body>
</html>