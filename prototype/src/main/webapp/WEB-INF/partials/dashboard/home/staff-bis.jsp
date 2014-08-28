<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<table class="default-dataTable display table-bordered">
  <thead>
    <tr>
      <th>Full Name</th>
      <th>ISO Code</th>
      <th>Region</th>
      <th>Actions</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="country" items="${allCountries}">
      <tr>
        <td>${country.fullName}</td>
        <td>${country.isoCode}</td>
        <td>${country.region}</td>
        <td></td>
      </tr>
    </c:forEach>
  </tbody>
</table>
