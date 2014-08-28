<%@ page
   language="java"
   contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:page pageTitle="Deployment">
  <jsp:attribute name="jsinit">
    <script
      type="text/javascript"
      src="<c:url value="/external/js/vis.min.js" />"></script>
    <script
      type="text/javascript"
      src="<c:url value="/fittesttracker/js/rest.js" />"></script>    
    <script
      type="text/javascript"
      src="<c:url value="/fittesttracker/js/deployment.js" />"></script>
  </jsp:attribute>
  
  <jsp:body>
    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#deployment" role="tab">Deployment</a>
      </li>
    </ul>
    
    <div class="tab-content">
      <div class="tab-pane active" id="deployment">
        <jsp:include page="/WEB-INF/partials/deployment/deployment.jsp" />
      </div>
    </div>
  </jsp:body>
</t:page>
