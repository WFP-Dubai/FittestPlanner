<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables"%>

<t:page pageTitle="Country">
  <jsp:body>
    <ul class="nav nav-tabs" type="tablist">
      <li class="active">
        <a href="#countries" type="tab">Countries</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="countries">
        <tt:countryTable
          readOnly="${readOnly}"
          countries="${allCountries}" />
      </div>
    </div>
  </jsp:body>
</t:page>
