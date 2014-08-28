<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables"%>

<t:page pageTitle="Language">
  <jsp:body>
    <ul class="nav nav-tabs" type="tablist">
      <li class="active">
        <a href="#languages" type="tab">Languages</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="languages">
        <tt:languageTable
          readOnly="${readOnly}"
          languages="${allLanguages}" />
      </div>
    </div>
  </jsp:body>
</t:page>
