<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="activities"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="activity" />

<t:actionTable
  entity="${entity}"
  items="${activities}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Description</th>
      <th>Activity Type</th>
      <th>ETC Service Map</th>
      <th>Country</th>
      <th>Confirmed Type</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>
  
  <jsp:body>
    <c:forEach var="activity" items="${activities}">
      <tr>
        <td>${activity.description}</td>
        <td>${activity.activityTypeDescription}</td>
        <td>
          <c:if test="${activity.etcServiceMap != ''}">
            <t:tooltipLink href="${activity.etcServiceMap}"/>
          </c:if>
        </td>
        <td>
          <t:listGroup items="${activity.countryNames}" />
        </td>
        <td class="text-center">
          <t:colorLabel
            color="${activity.confirmedTypeColorCode}"
            text="${activity.confirmedTypeDescription}" />
        </td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${activity.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
