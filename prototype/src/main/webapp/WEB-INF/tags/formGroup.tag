<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@attribute name="label" required="true" %>
<%@attribute name="labelClass" required="false" %>
<%@attribute name="formClass" required="false" %>
<%@attribute name="formInput" fragment="true"%>

<c:set var="labelClassDefault"
       value="${empty labelClass ? 'col-xs-2' : labelClass}"/>

<c:set var="formId"
       value="${fn:replace(fn:replace(fn:toLowerCase(label), ' ', '-'), '/', '-')}"/>

<div class="form-group">
  <label for="${formId}"
         class="${labelClassDefault} control-label">
    <c:out value="${label}" />
  </label>
  <div id="${formId}" class="${empty formClass ? 'col-xs-10' : formClass}">
    <jsp:doBody />
  </div>
</div>
