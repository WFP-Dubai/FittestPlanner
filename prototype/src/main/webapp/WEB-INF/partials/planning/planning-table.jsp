<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<table id="planning-table"
       class="table table-bordered table-responsive table-striped">
  <thead>
    <tr>
      <th style="width: 5%;">
        <button id="planning-table-collapse-button"
                class="btn btn-sm btn-warning">
          <span class="glyphicon glyphicon-chevron-up"> Collapse</span>
        </button>
      </th>
      <th id="planning-table-profile-col" style="width: 25%;">Profile</th>
      <th id="planning-table-location-col" style="width: 30%;">Location</th>
      <th id="planning-table-end-date-col" style="width: 15%;">Start Date</th>
      <th id="planning-table-start-date-col" style="width: 15%;">End Date</th>
    </tr>
  </thead>
  <tbody id="planning-table-body">

  </tbody>
</table>
