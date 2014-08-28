<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="staffType" required="true"
              type="org.wfp.fittest.dto.StaffTypeDto" %>

<c:url var="staffTypeSave" value="/staffType/save" />

<form:form
  method="POST"
  action="${staffTypeSave}"
  class="form-horizontal"
  role="form"
  id="staff-type-form"
  modelAttribute="staffType">
  <form:hidden
    path="id" />
  <t:formGroup label="Staff Type">
    <form:input
      class="form-control"
      type="text"
      path="staffType"
      required="true"
      placeholder="Staff Type"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
  <t:formGroup label="Staff">
    <tt:staffTable
      simpleTable="true"
      staffList="${staffType.staffDtos}"/>
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
   $('#staff-type-form').bootstrapValidator({
     feedbackIcons: {
       valid: 'glyphicon glyphicon-ok',
       invalid: 'glyphicon glyphicon-remove',
       validating: 'glyphicon glyphicon-refresh'
     },
     live: 'enabled'
   });
 });
</script>
