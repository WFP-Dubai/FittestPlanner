<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables"%>

<t:page pageTitle="Staff Type">
  <jsp:body>
    <ul class="nav nav-tabs" type="tablist">
      <li class="active">
        <a href="#staff-types" type="tab">Staff Types</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="staff-types">
        <tt:staffTypeTable
          readOnly="${readOnly}"
          staffTypes="${allStaffTypes}" />
      </div>
    </div>
  </jsp:body>
</t:page>
