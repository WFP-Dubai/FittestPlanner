<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="profileType" required="true"
              type="org.wfp.fittest.dto.ProfileTypeDto" %>

<c:url var="profileTypeSave" value="/profileType/save" />

<form:form
  method="POST"
  action="${profileTypeSave}"
  class="form-horizontal"
  role="form"
  id="profile-type-form"
  modelAttribute="profileType">
  <form:hidden
    path="id" />
  <t:formGroup label="Profile Type">
    <form:input
      class="form-control"
      type="text"
      path="profileType"
      placeholder="Staff Profile Type"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Staff">
    <tt:staffTable
      simpleTable="true"
      staffList="${profileType.staffDtos}"/>
  </t:formGroup>
  <t:formGroup label="Activity Roles">
    <tt:activityRoleTable
      simpleTable="true"
      activityRoles="${profileType.activityRoleDtos}"/>
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
   $('#profile-type-form').bootstrapValidator({
     feedbackIcons: {
       valid: 'glyphicon glyphicon-ok',
       invalid: 'glyphicon glyphicon-remove',
       validating: 'glyphicon glyphicon-refresh'
     },
     live: 'enabled'
   });
 });
</script>
