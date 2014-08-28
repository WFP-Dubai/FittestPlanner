<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="activityRole" required="true"
              type="org.wfp.fittest.dto.ActivityRoleDto" %>
<%@ attribute name="activities" required="true" type="java.util.List" %>
<%@ attribute name="profileTypes" required="true" type="java.util.List" %>
<%@ attribute name="staffRoles" required="true" type="java.util.List" %>

<c:url var="activityRoleSave" value="/activityRole/save" />

<form:form
  method="POST"
  action="${activityRoleSave}"
  class="form-horizontal"
  role="form"
  id="activity-role-form"
  modelAttribute="activityRole">
  <form:hidden
    path="id" />
  <t:formGroup label="Activity">
    <form:select
      class="form-control"
      items="${activities}"
      itemValue="id"
      itemLabel="description"
      path="activityId"
      multiple="false"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Profile Type">
    <form:select
      class="form-control"
      items="${profileTypes}"
      itemValue="id"
      itemLabel="profileType"
      path="profileTypeId"
      multiple="false"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}" />
  </t:formGroup>
  <t:formGroup label="Location">
    <form:input
      class="form-control"
      type="text"
      path="location"
      placeholder="Activity Role Location"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
  <t:formGroup label="Start Date">
    <form:input
      name="startDate"
      class="datepicker form-control"
      type="text"
      path="startDate"
      required="true"
      placeholder="DD/MM/YYYY"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
  <t:formGroup label="End Date">
    <form:input
      name="endDate"
      class="datepicker form-control"
      type="text"
      path="endDate"
      required="true"
      placeholder="DD/MM/YYYY"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
  <t:formGroup label="Staff Roles">
    <tt:staffRoleTable
      simpleTable="true"
      staffRoles="${activityRole.staffRoleDtos}" />
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
   $('#activity-role-form').bootstrapValidator({
     feedbackIcons: {
       valid: 'glyphicon glyphicon-ok',
       invalid: 'glyphicon glyphicon-remove',
       validating: 'glyphicon glyphicon-refresh'
     },
     live: 'enabled',
     fields: {
       startDate: {
         message: 'Start Date is not valid',
         validators: {
           notEmpty: {
             message: 'Start Date is required'
           },
           date: {
             format: "DD/MM/YYYY"
           }
         }
       },
       endDate: {
         message: 'End Date is not valid',
         validators: {
           notEmpty: {
             message: 'End Date is required'
           },
           date: {
             format: "DD/MM/YYYY"
           },
           callback: {
             message: 'Start Date must be before End Date',
             callback: function(value, validator, $field) {
               var st = validator.getFieldElements('startDate').val();
               var start = moment(st, 'DD/MM/YYYY').valueOf();
               var end = moment(value, 'DD/MM/YYYY').valueOf();
               return (end >= start);
             }
           }
         }
       }
     }
   });

   $('#startDate').on('change', function() {
     $('#activity-role-form').bootstrapValidator('revalidateField', 'startDate');
   });
   $('#endDate').on('change', function() {
     $('#activity-role-form').bootstrapValidator('revalidateField', 'endDate');
   });
 });
</script>
