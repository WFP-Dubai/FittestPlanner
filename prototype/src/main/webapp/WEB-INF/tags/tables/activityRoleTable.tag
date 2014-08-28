<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="activityRoles"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="activityRole" />

<t:actionTable
  entity="${entity}"
  items="${activityRoles}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Activity</th>
      <th>Profile Type</th>
      <th>Location</th>
      <th>Start Date</th>
      <th>End Date</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>

  <jsp:body>
    <c:forEach var="item" items="${activityRoles}">
      <tr>
        <td>${item.activityDescription}</td>
        <td>${item.profileTypeDescription}</td>
        <td>${item.location}</td>
        <td>
          <fmt:formatDate pattern="dd/MM/yyyy" value="${item.startDate}"/>
        </td>
        <td>
          <fmt:formatDate pattern="dd/MM/yyyy" value="${item.endDate}"/>
        </td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${item.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
