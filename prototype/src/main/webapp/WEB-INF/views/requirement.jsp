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
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/templates/sidebar.jsp"></jsp:include>
			<div id="content" class="span10">
				<div class="row-fluid">
					<form:form modelAttribute="requirementCriteria" method="POST">
						<div class="row-fluid">
							<div class="span4">
								<div class="well">
									<div class="form-horizontal">
										<fieldset>
											<legend>Date</legend>
											<div class="control-group">
												<label for="startDate" class="control-label">Start
													Date</label>
												<div class="controls">
													<input rel="datetime" type="text" class="form-control"
														id="startDate" placeholder="Start Date" required />

												</div>
											</div>
											<div class="control-group">
												<label for="endDate" class="control-label">End Date</label>
												<div class="controls">
													<input rel="datetime" type="text" class="form-control"
														id="endDate" placeholder="End Date" required />
												</div>
											</div>
										</fieldset>
									</div>
								</div>
							</div>
							<div class="span4">
								<div class="well">
									<div class="form-horizontal">
										<fieldset>
											<legend>Today</legend>
											<div class="control-group">
												<label for="showToday" class="control-label">Show
													Today?</label>
												<div class="controls">
													<input type="checkbox" class="form-control" id="showToday"
														placeholder="Show Today" />
												</div>
											</div>
											<div class="control-group">
												<label for="endDate" class="control-label">Today is</label>
												<div class="controls">
													<input rel="datetime" type="text" class="form-control"
														id="todayDate" placeholder="Today's Date" required />
												</div>
											</div>
										</fieldset>
									</div>
								</div>
							</div>
						</div>

						<div class="row-fluid">
							<div class="span4">
								<div class="well">
									<div class="form-horizontal">
										<fieldset>
											<legend>Activities</legend>
											<label for="activities" class="control-label">Activities</label>
											<form:select id="activities" size="10" multiple="true"
												path="activities" required="true" data-rel="chosen">
												<form:options items="${allActivities}"
													itemLabel="description" itemValue="ID" />
											</form:select>
										</fieldset>
									</div>
								</div>
							</div>
							<div class="span4">
								<div class="row-fluid">
									<div class="span12">
										<div class="well">
											<div class="form-horizontal">
												<fieldset>
													<legend>Weekly</legend>
													<div class="control-group">
														<label for="showWeeklyGrid" class="span4 control-label">Show
															Weekly Grid?</label>
														<div class="controls">
															<input type="checkbox" class="form-control"
																id="showWeeklyGrid" placeholder="Show Weekly Grid" />
														</div>
													</div>
													<div class="control-group">
														<label for="weekStart" class="span4 control-label">Starts
															On</label>
														<div class="controls">

															<select class="form-control">
																<option>Sunday</option>
																<option>Monday</option>
															</select>

														</div>
													</div>
												</fieldset>
											</div>
										</div>
									</div>
								</div>
								<div class="row-fluid">
									<div class="span12">
										<div class="well">
											<div class="form-horizontal">
												<fieldset>
													<legend>Options</legend>
													<div class="control-group">
														<label for="showBarDates" class="span4 control-label">Show
															Dates on Bars?</label>
														<div class="controls">
															<input type="checkbox" class="form-control"
																id="showBarDates" placeholder="Show Bar Dates" />
														</div>
													</div>
													<div class="control-group">
														<label for="showConfirmedOnly" class="span4 control-label">Show
															Confirmed Only?</label>
														<div class="controls">
															<input type="checkbox" class="form-control"
																id="showConfirmedOnly" placeholder="Show Confirmed Only" />
														</div>
													</div>
												</fieldset>
											</div>
										</div>
									</div>
								</div>

							</div>
						</div>
						<jsp:include page="/WEB-INF/widgets/form-submit-buttons.jsp" />
					</form:form>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="/WEB-INF/templates/jsload.jsp"></jsp:include>
</body>
</html>