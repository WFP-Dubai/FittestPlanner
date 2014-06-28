<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- topbar starts -->
<div class="navbar" role="navigation">
	<div class="navbar-inner">
		<div class="container-fluid">
			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse"> <span
				class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
			</a> <a class="brand" href="<c:url value="/"/>"><span>FITTEST
					Planner</span></a>

			<!-- theme selector starts -->
			<div class="btn-group pull-right theme-container">
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-tint"></i><span class="hidden-phone"> Change
						Theme / Skin</span> <span class="caret"></span>
				</a>
				<ul class="dropdown-menu" id="themes">
					<li><a data-value="classic" href="#"><i class="icon-blank"></i>
							Classic</a></li>
					<li><a data-value="cerulean" href="#"><i
							class="icon-blank"></i> Cerulean</a></li>
					<li><a data-value="cosmo" href="#"><i class="icon-blank"></i>
							Cosmo</a></li>
					<li><a data-value="cyborg" href="#"><i class="icon-blank"></i>
							Cyborg</a></li>
					<li><a data-value="journal" href="#"><i class="icon-blank"></i>
							Journal</a></li>
					<li><a data-value="flatly" href="#"><i class="icon-blank"></i>
							Flatly</a></li>
					<li><a data-value="lumen" href="#"><i class="icon-blank"></i>
							Lumen</a></li>
					<li><a data-value="readable" href="#"><i
							class="icon-blank"></i> Readable</a></li>
					<li><a data-value="redy" href="#"><i class="icon-blank"></i>
							Redy</a></li>
					<li><a data-value="simplex" href="#"><i class="icon-blank"></i>
							Simplex</a></li>
					<li><a data-value="slate" href="#"><i class="icon-blank"></i>
							Slate</a></li>
					<li><a data-value="spacelab" href="#"><i
							class="icon-blank"></i> Spacelab</a></li>
					<li><a data-value="united" href="#"><i class="icon-blank"></i>
							United</a></li>
				</ul>
			</div>
			<!-- theme selector ends -->

			<!-- user dropdown starts -->
			<div class="btn-group pull-right">
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-user"></i><span class="hidden-phone"> admin</span> <span
					class="caret"></span>
				</a>
				<ul class="dropdown-menu">
					<li><a href="#">Profile</a></li>
					<li class="divider"></li>
					<li><a href="login.html">Logout</a></li>
				</ul>
			</div>
			<!-- user dropdown ends -->

			<!--
			<div class="top-nav nav-collapse">
				<ul class="nav">
					<li><a href="#">Visit Site</a></li>
					<li>
						<form class="navbar-search pull-left">
							<input placeholder="Search" class="search-query span2"
								name="query" type="text">
						</form>
					</li>
				</ul>
			</div>
			-->
			<!--/.nav-collapse -->
		</div>
	</div>
</div>

<!--
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">
                    <img src="<c:url value="/img/WFPBanner.png" />"
                         width="45px"
                         height="35px"/>
FITTEST Planner
</a>
</div>
<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	<ul class="nav navbar-nav">
	</ul>

	<form class="navbar-form navbar-left" role="search"></form>

	<ul class="nav navbar-nav navbar-right">
		<li class="dropdown"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">Account <b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="#"><span class="glyphicon glyphicon-star">
							Profile</span></a></li>
				<li class="divider"></li>
				<li><a href="#"><span class="glyphicon glyphicon-off">
							Logout</span></a></li>
			</ul></li>
		<li class="dropdown"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown">Theme <b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
			</ul></li>
	</ul>
</div>
</div>
</nav>
-->
