<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="event" required="true"
              type="org.wfp.fittest.dto.EventDto" %>

<c:url var="eventSave" value="/event/save" />

<form:form
  method="POST"
  action="${eventSave}"
  class="form-horizontal"
  role="form"
  id="event-form"
  modelAttribute="event">
  <form:hidden
    path="id" />
  <t:formGroup label="Event">
    <form:input
      class="form-control"
      type="text"
      path="event"
      placeholder="Event Description"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"
    />
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
      placeholder="DD/MM/YYYY"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
    <t:formGroup label="Color Code">
    <form:input
      class="form-control color"
      type="text"
      path="colorCode"
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
   $('#event-form').bootstrapValidator({
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
     $('#event-form').bootstrapValidator('revalidateField', 'startDate');
   });
   $('#endDate').on('change', function() {
     $('#event-form').bootstrapValidator('revalidateField', 'endDate');
   });
 });
</script>
