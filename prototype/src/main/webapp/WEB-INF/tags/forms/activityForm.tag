<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="activity" required="true"
              type="org.wfp.fittest.dto.ActivityDto" %>
<%@ attribute name="confirmedTypes" required="true" type="java.util.List" %>
<%@ attribute name="activityTypes" required="true" type="java.util.List" %>
<%@ attribute name="countries" required="true" type="java.util.List" %>

<c:url var="activitySave" value="/activity/save" />

<form:form
  method="POST"
  action="${activitySave}"
  class="form-horizontal"
  role="form"
  id="activity-form"
  modelAttribute="activity">

  <form:hidden
    path="id" />
  <t:formGroup label="Descritpion">
    <form:input
      class="form-control"
      type="text"
      path="description"
      placeholder="Activity Description"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="ETC Service Map">
    <form:input
      class="form-control"
      type="text"
      path="etcServiceMap"
      placeholder="ETC Service Map URL"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Confirmed Type">
    <form:select
      class="form-control"
      items="${confirmedTypes}"
      itemValue="id"
      itemLabel="confirmedType"
      path="confirmedTypeId"
      multiple="false"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Activity Type">
    <form:select
      class="form-control"
      items="${activityTypes}"
      itemValue="id"
      itemLabel="activityType"
      path="activityTypeId"
      multiple="false"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Country">
    <form:select
      class="form-control"
      items="${countries}"
      itemValue="id"
      itemLabel="fullName"
      path="countryIds"
      multiple="true"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
  <t:formGroup label="Activity Role">
    <tt:activityRoleTable
      simpleTable="true"
      activityRoles="${activity.activityRoleDtos}" />
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
   $('#activity-form').bootstrapValidator({
     feedbackIcons: {
       valid: 'glyphicon glyphicon-ok',
       invalid: 'glyphicon glyphicon-remove',
       validating: 'glyphicon glyphicon-refresh'
     },
     live: 'enabled'
   });
 });
</script>
