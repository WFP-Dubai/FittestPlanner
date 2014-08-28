<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@attribute name="staffList" required="true" type="java.util.List" %>

<table class="simple-dataTable display" cellspacing="0">
  <thead>
    <tr>
      <th>
        Staff
      </th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="staff" items="${staffList}">
      <tr>
        <td>
          <ul class="media-list">
            <li class="media">
              <a class="pull-left" href="#">
                <img class="media-object"
                     width="40"
                     height="40"
                     src="<c:url value="/fittesttracker/images/profile.jpg" />"
                     alt="Profile Image">
              </a>
              <div class="media-body">
                <c:url
                  var="staffLink"
                  value="/staffList/${staff.id}/view" />
                <a href="${staffLink}" target="_blank">
                  <c:out value="${staff.name}" />
                </a>
                <br />
                <ul class="list-inline">
                    <li>
                      <small>
                        ${staff.title}
                      </small>
                    </li>
                </ul>
              </div>
            </li>
          </ul>
        </td>
      </tr>
    </c:forEach>
  </tbody>
</table>
