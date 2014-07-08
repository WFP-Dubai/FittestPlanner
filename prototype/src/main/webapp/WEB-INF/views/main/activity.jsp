<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Activities</title>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

			<div id="content" class="span10">
				<ul class="nav nav-tabs" id="myTab">
					<li class="active"><a href="#activity">Activity</a></li>
					<li><a href="#activityrole">Activity Role</a></li>
					<li><a href="#activitytype">Activity Type</a></li>
					<li><a href="#activity-confirmed">Confirmed</a></li>
					<li><a href="#activity-notconfirmed">Not Confirmed</a></li>
				</ul>
				<div id="activityTabContent" class="tab-content"
					style="padding: 10px">
					<div class="tab-pane" id="activitytype">
						<jsp:include page="/WEB-INF/widgets/tables/activitytype-table.jsp"></jsp:include>
					</div>
					<div class="tab-pane active" id="activity">
						<jsp:include page="/WEB-INF/widgets/tables/activity-table.jsp"></jsp:include>
					</div>
					<div class="tab-pane" id="activityrole">
						<jsp:include page="/WEB-INF/widgets/tables/activityrole-table.jsp"></jsp:include>
					</div>
					<div class="tab-pane" id="activity-confirmed">
						<jsp:include
							page="/WEB-INF/widgets/tables/activity-confirmed-table.jsp"></jsp:include>
					</div>
					<div class="tab-pane" id="activity-notconfirmed">
						<jsp:include
							page="/WEB-INF/widgets/tables/activity-notconfirmed-table.jsp"></jsp:include>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>