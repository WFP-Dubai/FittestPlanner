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
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>
			<div id="content" class="span10">
				<ul class="nav nav-tabs" id="myTab">
					<li class="active"><a href="#staff">Staff</a></li>
					<li><a href="#staffrole">Staff Role</a></li>
					<li><a href="#profiletype">Profile Type</a></li>
					<li><a href="#staffconfirmtype">Staff Confirm Type</a></li>
				</ul>
				<div id="activityTabContent" class="tab-content"
					style="padding: 10px">
					<div class="tab-pane" id="staff">
						<jsp:include page="/WEB-INF/widgets/tables/staff-table.jsp"></jsp:include>
					</div>
					<div class="tab-pane" id="staffrole">
						<jsp:include page="/WEB-INF/widgets/tables/staffrole-table.jsp"></jsp:include>
					</div>
					<div class="tab-pane" id="profiletype">
						<jsp:include page="/WEB-INF/widgets/tables/profiletype-table.jsp"></jsp:include>
					</div>
					<div class="tab-pane" id="staffconfirmtype">
						<jsp:include page="/WEB-INF/widgets/tables/staffrole-table.jsp"></jsp:include>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>