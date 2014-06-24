<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="sidebar-wrapper">
	<ul class="sidebar-nav">
		<li class="sidebar-section">Main</li>
		<li><a href="<c:url value="/"/>"><span class="glyphicon glyphicon-home">
					Dashboard</span></a></li>
		<li><a href="<c:url value="/requirement"/>"><span
				class="glyphicon glyphicon-book"> Requirements</span></a></li>
		<li><a href="<c:url value="/planning"/>"><span class="glyphicon glyphicon-edit">
					Planning</span></a></li>
		<li><a href="<c:url value="/deployment"/>"><span
				class="glyphicon glyphicon-list-alt"> Deployments</span></a></li>

		<li class="sidebar-section">Edit</li>
		<li><a href="<c:url value="/activity"/>"><span
				class="glyphicon glyphicon-asterisk"> Activity</span></a></li>
		<li><a href="<c:url value="/staff"/>"><span class="glyphicon glyphicon-user">
					Staff</span></a></li>
		<li><a href="profiletype"><span
				class="glyphicon glyphicon-briefcase"> Profile Type</span></a></li>
		<li><a href="<c:url value="/country"/>"><span class="glyphicon glyphicon-globe">
					Country</span></a></li>
	</ul>
</div>