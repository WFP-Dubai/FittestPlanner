<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="tf" tagdir="/WEB-INF/tags/forms" %>

<t:formPage entity="staff">
  <tf:staffForm
    staff="${staff}"
    staffTypes="${allStaffTypes}"
    profileTypes="${allProfileTypes}"
    nationalities="${allNationalities}"
    languages="${allLanguages}" />
</t:formPage>
