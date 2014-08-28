<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:page pageTitle="Requirement">
  <jsp:attribute name="jsinit">
    <script
      type="text/javascript"
      src="<c:url value="/external/js/vis.min.js" />"></script>
    <script
      type="text/javascript"
      src="<c:url value="/fittesttracker/js/rest.js" />"></script>    
    <script
      type="text/javascript"
      src="<c:url value="/fittesttracker/js/requirement.js" />"></script>
  </jsp:attribute>
  
  <jsp:body>
    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#requirement" role="tab">Requirement</a>
      </li>
    </ul>
    
    <div class="tab-content">
      <div class="tab-pane active" id="requirement">
        <jsp:include page="/WEB-INF/partials/requirement/requirement.jsp" />
      </div>
    </div>
  </jsp:body>
</t:page>
