<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ attribute name="country" required="true"
              type="org.wfp.fittest.dto.CountryDto" %>

<c:url var="countrySave" value="/country/save" />

<form:form
  method="POST"
  action="${countrySave}"
  class="form-horizontal"
  role="form"
  id="country-form"
  modelAttribute="country">
  <form:hidden
    path="id" />
  <t:formGroup label="ISO Code">
    <form:input
      name="isoCode"
      class="form-control"
      type="text"
      path="isoCode"
      placeholder="ISO Country Code"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"
    />
  </t:formGroup>
  <t:formGroup label="Name">
    <form:input
      class="form-control"
      type="text"
      path="fullName"
      placeholder="Country Name"
      required="true"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Region">
    <form:input
      class="form-control"
      type="text"
      path="region"
      placeholder="Region"
      disabled="${readOnly ? 'true' : 'false'}"/>
  </t:formGroup>
  <t:formGroup label="Activities">
    <tt:activityTable
      simpleTable="true"
      activities="${country.activityDtos}"/>
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
   $('#country-form').bootstrapValidator({
     feedbackIcons: {
       valid: 'glyphicon glyphicon-ok',
       invalid: 'glyphicon glyphicon-remove',
       validating: 'glyphicon glyphicon-refresh'
     },
     live: 'enabled',
     fields: {
       isoCode: {
         message: 'ISO Code is not valid',
         validators: {
           notEmpty: {
             message: 'ISO Code is required and cannot be empty'
           },
           stringLength: {
             min: 2,
             max: 2,
             message: 'ISO Code must be 2 letters long'
           }
         }
       }
     }
   });
 });
</script>
