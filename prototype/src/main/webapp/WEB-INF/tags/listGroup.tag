<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@attribute name="items" required="false" type="java.util.List" %>
<%@attribute name="property" required="false" %>
<%@attribute name="styled" required="false" %>

<ul class="${styled ? 'list-group' : 'list-unstyled'}">
  <c:forEach var="item" items="${items}">
    <li class="${styled ? 'list-group-item' : ''}">
      <c:out value="${property != null ? item[property] : item}" />
    </li>
  </c:forEach>
</ul>
