<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Requirements</title>
<jsp:include page="/WEB-INF/templates/meta.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/WEB-INF/templates/navbar.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/templates/sidebar-button.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>

		<div id="page-content-wrapper">
			<div class="content-header"></div>

			<div class="page-content inset">
				<div class="row">
					<div class="col-lg-12">
						<div class="col-lg-6">
							<div class="well bs-component">
								<form class="form-horizontal">
									<fieldset>
										<legend>Date</legend>
										<div class="form-group">
											<label for="startDate" class="col-lg-3 control-label">Start
												Date</label>
											<div class="col-lg-9">
												<input type="text" class="form-control" id="startDate"
													placeholder="Start Date" />
											</div>
										</div>
										<div class="form-group">
											<label for="endDate" class="col-lg-3 control-label">End
												Date</label>
											<div class="col-lg-9">
												<input type="datetime" class="form-control" id="endDate"
													placeholder="End Date" />
											</div>
										</div>
										<div class="col-lg-6 col-lg-offset-3">
											<div class="input-group">
												<span class="input-group-addon"> <input
													type="checkbox" />
												</span> <label class="form-control">Show Today</label>
											</div>
											<!-- /input-group -->
										</div>
										<!-- /.col-lg-6 -->
									</fieldset>
								</form>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="well bs-component">
								<form class="form-horizontal">
									<fieldset>
										<legend>Weekly</legend>
										<div class="form-group">
											<label for="startDate" class="col-lg-3 control-label">Start
												Date</label>
											<div class="col-lg-9">
												<input type="text" class="form-control" id="startDate"
													placeholder="Start Date" />
											</div>
										</div>
										<div class="form-group">
											<label for="endDate" class="col-lg-3 control-label">End
												Date</label>
											<div class="col-lg-9">
												<input type="datetime" class="form-control" id="endDate"
													placeholder="End Date" />
											</div>
										</div>
									</fieldset>
								</form>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-lg-12">
						<div class="col-lg-6">
							<div class="well bs-component">
								<form:form class="form-horizontal" commandName="selectedActivity">
									<fieldset>
										<legend>Activities</legend>
										<div class="col-lg-12">
											<form:select class="form-control" path="ID" multiple="true">
												<form:options items="${activities}" itemValue="ID"
													itemLabel="description" />
												<form:errors path="ID" cssClass="error" />
											</form:select>
										</div>
									</fieldset>
								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>