<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="profileTypes"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="profileType" />

<t:actionTable
  entity="${entity}"
  items="${profileTypes}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Profile Type</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>

  <jsp:body>
    <c:forEach var="profileType" items="${profileTypes}">
      <tr>
        <td>
          ${profileType.profileType}
        </td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${profileType.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
