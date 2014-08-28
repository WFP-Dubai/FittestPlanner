<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>

<t:page pageTitle="Activity Role">
  <jsp:body>
    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#activity-roles" role="tab">Activity Role</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="activity-roles">
        <tt:activityRoleTable
          readOnly="${readOnly}"
          activityRoles="${allActivityRoles}" />
      </div>
    </div>
  </jsp:body>
</t:page>
