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
				<form:form modelAttribute="requirementCriteria" method="POST">
					<div class="row">
						<div class="col-sm-12">
							<div class="col-sm-4">
								<div class="well bs-component">
									<div class="form-horizontal">
										<fieldset>
											<legend>Date</legend>
											<div class="form-group">
												<label for="startDate" class="col-md-4 control-label">Start
													Date</label>
												<div class="col-md-8">
													<div class="input-group">
														<input rel="datetime" type="text" class="form-control"
															id="startDate" placeholder="Start Date" /> <span
															class="input-group-addon glyphicon glyphicon-calendar"></span>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="endDate" class="col-md-4 control-label">End
													Date</label>
												<div class="col-md-8">
													<div class="input-group">
														<input rel="datetime" type="text" class="form-control"
															id="endDate" placeholder="End Date" /> <span
															class="input-group-addon glyphicon glyphicon-calendar"></span>
													</div>
												</div>
											</div>

										</fieldset>
									</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="well bs-component">
									<div class="form-horizontal">
										<fieldset>
											<legend>Today</legend>
											<div class="form-group">
												<label for="showToday" class="col-md-4 control-label">Show
													Today?</label>
												<div class="col-md-3">
													<input type="checkbox" class="form-control" id="showToday"
														placeholder="Show Today" />
												</div>
											</div>
											<div class="form-group">
												<label for="endDate" class="col-md-4 control-label">Today
													is</label>
												<div class="col-md-8">
													<div class="input-group">
														<input rel="datetime" type="text" class="form-control"
															id="todayDate" placeholder="Today's Date" /> <span
															class="input-group-addon glyphicon glyphicon-calendar"></span>
													</div>
												</div>
											</div>
										</fieldset>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12">
							<div class="col-md-4">
								<div class="well bs-component">
									<div class="form-horizontal">
										<fieldset>
											<legend>Activities</legend>
											<form:select size="15" multiple="true" path="activities">
												<form:options items="${requirementCriteria.activities}" itemLabel="description"
													itemValue="ID" />
											</form:select>
										</fieldset>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="row">
									<div class="col-md-12">
										<div class="well bs-component">
											<div class="form-horizontal">
												<fieldset>
													<legend>Weekly</legend>
													<div class="form-group">
														<label for="showWeeklyGrid" class="col-md-4 control-label">Show
															Weekly Grid?</label>
														<div class="col-md-3">
															<input type="checkbox" class="form-control"
																id="showWeeklyGrid" placeholder="Show Weekly Grid" />
														</div>
													</div>
													<div class="form-group">
														<label for="weekStart" class="col-md-4 control-label">Starts
															On</label>
														<div class="col-md-8">
															<div class="input-group">
																<select class="form-control">
																	<option>Sunday</option>
																	<option>Monday</option>
																</select>
															</div>
														</div>
													</div>
												</fieldset>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<div class="well bs-component">
											<div class="form-horizontal">
												<fieldset>
													<legend>Weekly</legend>
													<div class="form-group">
														<label for="showBarDates" class="col-md-4 control-label">Show
															Dates on Bars?</label>
														<div class="col-md-3">
															<input type="checkbox" class="form-control"
																id="showBarDates" placeholder="Show Bar Dates" />
														</div>
													</div>
													<div class="form-group">
														<label for="showConfirmedOnly"
															class="col-md-4 control-label">Show Confirmed
															Only?</label>
														<div class="col-md-3">
															<input type="checkbox" class="form-control"
																id="showConfirmedOnly" placeholder="Show Confirmed Only" />
														</div>
													</div>
												</fieldset>
											</div>
										</div>
									</div>
								</div>
								<div class="row">

									<div class="btn-toolbar" role="toolbar">
										<button type="button" class="btn btn-danger">
											<span class="glyphicon glyphicon-remove"></span> Clear
										</button>
										<button type="button" class="btn btn-success">
											<span class="glyphicon glyphicon-ok"></span> Display
											Requirements
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>

				</form:form>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>