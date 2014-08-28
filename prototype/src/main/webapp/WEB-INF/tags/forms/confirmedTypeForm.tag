<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="confirmedType" required="true"
              type="org.wfp.fittest.dto.ConfirmedTypeDto" %>

<c:url var="confirmedTypeSave" value="/confirmedType/save" />

<form:form
  method="POST"
  action="${confirmedTypeSave}"
  class="form-horizontal"
  role="form"
  id="confirmed-type-form"
  modelAttribute="confirmedType">
  <form:hidden
    path="id" />
  <t:formGroup label="Confirmed Type">
    <form:input
      class="form-control"
      type="text"
      path="confirmedType"
      placeholder="Confirmed Type"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Color Code">
    <form:input
      class="form-control color"
      type="text"
      path="confirmedColorCode"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Activities">
    <tt:activityTable
      simpleTable="true"
      activities="${confirmedType.activityDtos}"/>
  </t:formGroup>
  <t:formGroup label="Staff Roles">
    <tt:staffRoleTable
      simpleTable="true"
      staffRoles="${confirmedType.staffRoleDtos}"/>
  </t:formGroup>

  <c:if test="${not readOnly}">
    <t:formGroup label="">
      <div class="btn-group btn-group-md">
        <button type="submit"
                class="btn btn-success">
          <span class="glyphicon glyphicon-ok"></span> Save
        </button>
      </div>
    </t:formGroup>
  </c:if>
</form:form>

<script>
 $(document).ready(function() {
   $('#confirmed-type-form').bootstrapValidator({
     feedbackIcons: {
       valid: 'glyphicon glyphicon-ok',
       invalid: 'glyphicon glyphicon-remove',
       validating: 'glyphicon glyphicon-refresh'
     },
     live: 'enabled'
   });
 });
</script>
