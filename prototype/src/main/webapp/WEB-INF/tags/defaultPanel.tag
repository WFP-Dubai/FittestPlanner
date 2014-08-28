<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@attribute name="type" required="false" %>
<%@attribute name="title" required="true" %>
<%@attribute name="badge" required="false" %>
<%@attribute name="badgeClass" required="false" %>

<%@attribute name="panelBody" fragment="true" %>

<div class="box col-md-12">
  <div class="box-inner ${typeDefault}">
    <div class="box-header well">
      
      <h2>
        <c:out value="${title}" />
      </h2>
      
    <c:if test="${not empty badge}">
        <span class="badge ${badgeClass}"
              style="margin-left: 10px;" >
          <c:out value="${badge}" />
        </span>
      </c:if>
      <div class="box-icon">
        <a href="#" class="btn btn-minimize btn-round btn-default"><i
          class="glyphicon glyphicon-chevron-up"></i></a>
        <a href="#" class="btn btn-close btn-round btn-default"><i
          class="glyphicon glyphicon-remove"></i></a>
      </div>
    </div>
    <div class="box-content row">
      <div class="col-md-12">
        <jsp:invoke fragment="panelBody" />
      </div>
    </div>
  </div>
</div>
