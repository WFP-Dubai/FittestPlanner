<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@attribute name="color" required="true" %>
<%@attribute name="text" required="true" %>

<label class="label label-default"
       style="background-color:#${color};">
  <c:out value="${text}" />
</label>
