<%@ page
   language="java"
   contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:page pageTitle="Planning">
  <jsp:attribute name="jsinit">
    <script>
      var isAdmin = ${isAdmin};
    </script>
    <script
      type="text/javascript"
      src="<c:url value="/fittesttracker/js/rest.js" />"></script>
    <script
      type="text/javascript"
      src="<c:url value="/fittesttracker/js/planning.js" />"></script>
  </jsp:attribute>

  <jsp:body>
    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#planning" role="tab">Planning</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="planning">
        <jsp:include page="/WEB-INF/partials/planning/planning.jsp" />
      </div>
    </div>
  </jsp:body>
</t:page>
