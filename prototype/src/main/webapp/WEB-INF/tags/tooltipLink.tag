<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@attribute name="href" required="true" %>
<%@attribute name="text" required="false" %>

<a href="<c:url value="${href}" />"
   class="label label-default"
   data-toggle="tooltip"
   data-placement="top"
   title="${href}">
  <c:out value="${(text == '' || text == null) ? 'Link' : text}" />
</a>
