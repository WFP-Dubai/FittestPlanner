<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="activityTypes"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="activityType" />

<t:actionTable
  entity="${entity}"
  items="${activityTypes}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Activity Type</th>
      <th>Color Code</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>

  <jsp:body>
    <c:forEach var="activityType" items="${allActivityTypes}">
      <tr>
        <td>${activityType.activityType}</td>
        <td class="text-center">
          <t:colorLabel
            color="${activityType.colorCode}"
            text="${activityType.colorCode}"/>
        </td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${activityType.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
