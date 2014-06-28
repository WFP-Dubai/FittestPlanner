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
				</ul>
				<div id="homeTabContent" class="tab-content" style="padding: 10px">
					<div class="tab-pane active" id="info">
						<jsp:include page="/WEB-INF/widgets/staff-notification.jsp"></jsp:include>
						<jsp:include page="/WEB-INF/widgets/staff-summary.jsp"></jsp:include>
						<jsp:include page="/WEB-INF/widgets/activitytype-chart.jsp"></jsp:include>
					</div>
					<div class="tab-pane" id="roles">
						<div class="row-fluid">
							<jsp:include page="/WEB-INF/widgets/staffrole-table.jsp"></jsp:include>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/widgets/activitytype-chart-jsload.jsp"></jsp:include>
</body>
</html>