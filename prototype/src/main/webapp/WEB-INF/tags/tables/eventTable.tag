<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="events"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="event" />

<t:actionTable
  entity="${entity}"
  items="${events}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Event</th>
      <th>Start Date</th>
      <th>End Date</th>
      <th>Color Code</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>

  <jsp:body>
    <c:forEach var="event" items="${events}">
      <tr>
        <td>
          ${event.event}
        </td>
        <td>
          <fmt:formatDate pattern="dd/MM/yyyy" value="${event.startDate}"/>
        </td>
        <td>
          <fmt:formatDate pattern="dd/MM/yyyy" value="${event.endDate}"/>
        </td>
        <td>
          <t:colorLabel
            text="${event.colorCode}"
            color="${event.colorCode}" />
        </td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${event.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
