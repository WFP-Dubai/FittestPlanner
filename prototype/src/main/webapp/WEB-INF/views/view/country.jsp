<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:page pageTitle="View Country">
  <div class="container">
    <div class="col-sm-8 well well-sm">
      <t:formGroup
        label="Name">
        <label class="form-control">
          ${country.fullName}
        </label>
      </t:formGroup>
      <t:formGroup
        label="ISO Code">
        <label class="form-control">
          ${country.isoCode}
        </label>
      </t:formGroup>
      <t:formGroup
        label="Region">
        <label class="form-control">
          ${country.region}
        </label>
      </t:formGroup>
      <t:formGroup
        label="Name">
        <label class="form-control">
          ${country.fullName}
        </label>
      </t:formGroup>
    </div>
  </div>
</t:page>
