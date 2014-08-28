<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="confirmedTypes"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="confirmedType" />

<t:actionTable
  entity="${entity}"
  items="${confirmedTypes}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Confirmed Type</th>
      <th>Color Code</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>

  <jsp:body>
    <c:forEach var="confirmedType" items="${confirmedTypes}">
      <tr>
        <td>
          ${confirmedType.confirmedType}
        </td>
        <td class="text-center">
          <t:colorLabel
            text="${confirmedType.confirmedColorCode}"
            color="${confirmedType.confirmedColorCode}" />
        </td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${confirmedType.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
