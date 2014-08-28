<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@ attribute
   name="languages"
   required="true"
   type="java.util.List" %>

<%@ attribute name="simpleTable" required="false" %>
<%@ attribute name="readOnly" required="false" %>

<c:set var="entity" value="language" />

<t:actionTable
  entity="${entity}"
  items="${languages}"
  simpleTable="${simpleTable}"
  readOnly="${readOnly}">

  <jsp:attribute name="actionTableHeader">
    <tr>
      <th>Language</th>
      <th>Actions</th>
    </tr>
  </jsp:attribute>

  <jsp:body>
    <c:forEach var="language" items="${languages}">
      <tr>
        <td>${language.language}</td>
        <td>
          <t:actionButtons
            readOnly="${readOnly}"
            entity="${entity}"
            id="${language.id}" />
        </td>
      </tr>
    </c:forEach>
  </jsp:body>
</t:actionTable>
