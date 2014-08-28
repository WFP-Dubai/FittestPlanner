<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute name="entity" required="required" %>
<%@ attribute
   name="items"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<%@ attribute name="actionTableHeader" fragment="true" %>

<c:if test="${not (readOnly or simpleTable)}">
  <t:createButton entity="${entity}" />
</c:if>

<table
  cellspacing="0"
  width="100%"
  class="${simpleTable ?  'simple-dataTable' : 'default-dataTable'} display table-bordered">
  <thead>
    <jsp:invoke fragment="actionTableHeader" />
  </thead>
  <tbody>
    <jsp:doBody />
  </tbody>
</table>
