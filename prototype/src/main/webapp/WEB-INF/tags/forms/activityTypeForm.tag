<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="activityType" required="true"
              type="org.wfp.fittest.dto.ActivityTypeDto" %>

<c:url var="activityTypeSave" value="/activityType/save" />

<form:form
  method="POST"
  action="${activityTypeSave}"
  class="form-horizontal"
  role="form"
  id="activity-type-form"
  modelAttribute="activityType">
  <form:hidden
    path="id" />
  <t:formGroup label="ActivityType">
    <form:input
      class="form-control"
      type="text"
      path="activityType"
      placeholder="Activity Type Description"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Color Code">
    <form:input
      class="form-control color"
      type="text"
      path="colorCode"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Activities">
    <tt:activityTable
      simpleTable="true"
      activities="${activityType.activityDtos}"/>
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
   $('#activity-type-form').bootstrapValidator({
     feedbackIcons: {
       valid: 'glyphicon glyphicon-ok',
       invalid: 'glyphicon glyphicon-remove',
       validating: 'glyphicon glyphicon-refresh'
     },
     live: 'enabled'
   });
 });
</script>
