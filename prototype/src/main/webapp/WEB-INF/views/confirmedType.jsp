<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables"%>

<t:page pageTitle="Confirmed Type">
  <jsp:body>
    <ul class="nav nav-tabs" type="tablist">
      <li class="active">
        <a href="#confirmed-types" type="tab">Confirmed Types</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="confirmed-types">
        <tt:confirmedTypeTable
          readOnly="${readOnly}"
          confirmedTypes="${allConfirmedTypes}" />
      </div>
    </div>
  </jsp:body>
</t:page>
