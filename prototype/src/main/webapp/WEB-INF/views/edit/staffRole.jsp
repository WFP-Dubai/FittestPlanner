<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
<title>Staff Role Form</title>
</head>
<body>
    <jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
    <div class="container-fluid">
        <div class="row-fluid">
            <jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

            <div id="content" class="span10">
                <div class="span 6">
                    <jsp:include page="/WEB-INF/widgets/forms/edit/staffRole.jsp"></jsp:include>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>