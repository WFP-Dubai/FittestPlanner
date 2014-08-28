<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:page pageTitle="Dashboard">
  <jsp:body>

    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#home" role="tab">Home</a>
      </li>
      <li>
        <a href="#charts" role="tab">Charts</a>
      </li>
    </ul>
    <div class="tab-content">
      <div class="tab-pane active" id="home">

        <jsp:include page="/WEB-INF/partials/dashboard/home.jsp" />
      </div>
      <div class="tab-pane" id="charts">
        <jsp:include page="/WEB-INF/partials/dashboard/charts.jsp" />
      </div>
    </div>
  </jsp:body>
</t:page>
