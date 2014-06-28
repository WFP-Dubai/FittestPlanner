<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="sortable row-fluid">
	<a class="span4 well top-block"
		href="<c:url value="/activitytype/${activityTypesWithId['Leave']}"/>"
		data-placement="bottom" title="Staff on leave/BIS" data-rel="tooltip">
		<span class="icon32 icon-red icon-user"></span> <span
		class="notification">4</span>
		<h3>Leave</h3> <span class="badge">${staffByActivityType['Leave'].size()}</span>
	</a> <a
		href="<c:url value="/activitytype/${activityTypesWithId['Field mission']}"/>"
		class="span4 well top-block" data-placement="bottom"
		title="Staff not assigned to any mission and not on leave/BIS"
		data-rel="tooltip"> <span class="icon32 icon-red icon-user"></span>
		<h3>Field Mission</h3> <span class="notification">0</span> <span
		class="badge">${staffByActivityType['Field mission'].size()}</span>
	</a> <a
		href="<c:url value="/activitytype/${activityTypesWithId['Other']}"/>"
		class="span4 well top-block" data-placement="bottom"
		title="Staff currently assigned to a mission" data-rel="tooltip">
		<span class="icon32 icon-red icon-user"></span>
		<h3>Other</h3> <span class="notification">5</span> <span class="badge">${staffByActivityType['Other'].size()}</span>
	</a>
</div>