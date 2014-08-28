<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>

<t:page pageTitle="Activity Type">
  <jsp:body>
    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#activity-types" role="tab">Activity Type</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="activity-types">
        <tt:activityTypeTable
          readOnly="${readOnly}"
          activityTypes="${allActivityTypes}" />
      </div>
    </div>
  </jsp:body>
</t:page>
