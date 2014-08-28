<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables"%>

<t:page pageTitle="Profile Type">
  <jsp:body>
    <ul class="nav nav-tabs" type="tablist">
      <li class="active">
        <a href="#profile-types" type="tab">Profile Types</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="profile-types">
        <tt:profileTypeTable
          readOnly="${readOnly}"
          profileTypes="${allProfileTypes}" />
      </div>
    </div>
  </jsp:body>
</t:page>
