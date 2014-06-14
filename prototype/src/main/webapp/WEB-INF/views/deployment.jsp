<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
<title>Deployments</title>
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
                    <div class="col-lg-12"></div>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>