<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables"%>

<t:page pageTitle="Staff Role">
  <jsp:body>

    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#staff-roles" role="tab">Staff Roles</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="staff-roles">
        <tt:staffRoleTable
          readOnly="${readOnly}"
          staffRoles="${allStaffRoles}" />
      </div>
    </div>
  </jsp:body>
</t:page>
