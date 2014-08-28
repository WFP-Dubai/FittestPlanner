<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tt" tagdir="/WEB-INF/tags/tables" %>

<t:page pageTitle="Event">
  <jsp:body>
    <ul class="nav nav-tabs" role="tablist">
      <li class="active">
        <a href="#event" role="tab">Event</a>
      </li>
    </ul>

    <div class="tab-content">
      <div class="tab-pane active" id="event">
        <tt:eventTable
          readOnly="${readOnly}"
          events="${allEvents}" />
      </div>
    </div>
  </jsp:body>
</t:page>
