<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
<title>FITTEST Planner</title>
</head>
<body>
	<div id="container-fluid">
		<div class="row-fluid">
			<div class="row-fluid">
				<div class="row-fluid">
					<div class="span12 center login-header"><h3>FITTEST Planner</h3></div>
				</div>
				<!--/span-->
			</div>
			<!--/row-->
			<div class="row-fluid">
				<div class="well span5 center login-box">
					<div class="alert alert-info">Please login with your Username/Email
						and Password.</div>
					<form class="form-horizontal" action="<c:url value="/login"/>" method="post">
						<fieldset>
							<div class="input-prepend" title="Username" data-rel="tooltip">
								<span class="add-on"><i class="icon-user"></i></span><input
									autofocus class="input-large span10" name="username"
									id="username" type="text" placeholder="username or email" required/>
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="Password" data-rel="tooltip">
								<span class="add-on"><i class="icon-lock"></i></span><input
									class="input-large span10" name="password" id="password"
									type="password" placeholder="password" required/>
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend">
								<label class="remember" for="remember"><input
									type="checkbox" id="remember" />Remember me</label>
							</div>
							<div class="clearfix"></div>

							<p class="center span5">
								<button type="submit" class="btn btn-primary">Login</button>
							</p>
						</fieldset>
					</form>
				</div>
				<!--/span-->
			</div>
			<!--/row-->
		</div>
		<!--/fluid-row-->

	</div>
	<!--/.fluid-container-->

	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>