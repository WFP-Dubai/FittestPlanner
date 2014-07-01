<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="span2 main-menu-span">
	<div class="well nav-collapse sidebar-nav">
		<ul class="nav nav-tabs nav-stacked main-menu">
			<li class="nav-header hidden-tablet">Main</li>

			<li><a href="<c:url value="/"/>"><i class="icon-home"></i> <span
					class="hidden-tablet">Dashboard</span></a></li>
			<li><a href="<c:url value="/requirement"/>"><i
					class="icon-book"></i> <span class="hidden-tablet">Requirements</span></a></li>
			<li><a href="<c:url value="/planning"/>"><i
					class="icon-edit"></i> <span class="hidden-tablet">Planning</span></a></li>
			<li><a href="<c:url value="/deployment"/>"><i
					class="icon-list-alt"></i> <span class="hidden-tablet">Deployments</span></a></li>

			<li class="nav-header hidden-tablet">Edit</li>
			<li><a href="<c:url value="/activity"/>"><i
					class="icon-asterisk"></i> <span class="hidden-tablet">Activity</span></a></li>
			<li><a href="<c:url value="/staff"/>"><i class="icon-user"></i>
					<span class="hidden-tablet">Staff</span></a></li>
			<li><a href="<c:url value="/profiletype"/>"><i class="icon-briefcase"></i> <span
					class="hidden-tablet">Profile Type</span></a></li>
			<li><a href="<c:url value="/country"/>"><i
					class="icon-globe"></i>
					<span class="hidden-tablet">Country</span></a></li>
		</ul>
	</div>
</div>