<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="staffRole" required="true"
              type="org.wfp.fittest.dto.StaffRoleDto" %>
<%@ attribute name="activityRoles" required="true" type="java.util.List" %>
<%@ attribute name="confirmedTypes" required="true" type="java.util.List" %>
<%@ attribute name="staffList" required="true" type="java.util.List" %>

<c:url var="staffRoleSave" value="/staffRole/save" />

<form:form
  method="POST"
  action="${staffRoleSave}"
  class="form-horizontal"
  role="form"
  id="staff-role-form"
  modelAttribute="staffRole">
  <form:hidden
    path="id" />
  <t:formGroup label="Activity Role">
    <form:select
      class="form-control"
      items="${activityRoles}"
      path="activityRoleId"
      itemValue="id"
      multiple="false"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>

  </t:formGroup>
  <t:formGroup label="Staff">
    <form:select
      class="form-control"
      items="${staffList}"
      itemValue="id"
      path="staffId"
      multiple="false"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>

  </t:formGroup>  
  <t:formGroup label="Confirmed Type">
    <form:select
      class="form-control"
      items="${confirmedTypes}"
      itemValue="id"
      path="confirmedTypeId"
      multiple="false"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>

  </t:formGroup>
  <t:formGroup label="Start Date">
    <form:input
      name="startDate"
      class="datepicker form-control"
      type="text"
      path="startDate"
      placeholder="DD/MM/YYYY"
      required="true"
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
  <t:formGroup label="Location">
    <form:input
      class="form-control"
      type="text"
      path="location"
      placeholder="Staff Role Location"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
  <t:formGroup label="Comments">
    <form:input
      class="form-control"
      type="text"
      path="comments"
      placeholder="Comments"
      disabled="${readOnly ? 'true' : 'false'}"
    />
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
   $('#staff-role-form').bootstrapValidator({
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
     $('#staff-role-form').bootstrapValidator('revalidateField', 'startDate');
   });
   $('#endDate').on('change', function() {
     $('#staff-role-form').bootstrapValidator('revalidateField', 'endDate');
   });
 });
</script>
