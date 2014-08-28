<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="countries"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="country" />

<t:actionTable
  entity="${entity}"
  items="${countries}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Name</th>
      <th>ISO Code</th>
      <th>Region</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>

  <jsp:body>
    <c:forEach var="country" items="${countries}">
      <tr>
        <td>
          ${country.fullName}
        </td>
        <td>
          ${country.isoCode}
        </td>
        <td>
          ${country.region}
        </td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${country.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
