<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="activityRoleDetails" method="POST"
	action="new">
	<div class="row-fluid">
		<div class="well span6">
			<div class="form-horizontal">
				<fieldset>
					<legend>Activity Role</legend>

					<div class="control-group">
						<label for="activity" class="control-label">Activity</label>
						<div class="controls">
							<form:select id="activity" multiple="false" path="activity"
								data-rel="chosen" required="true">
								<form:options items="${allActivities}" itemLabel="description"
									itemValue="ID" />
							</form:select>
						</div>
					</div>

					<div class="control-group">
						<label for="profileType" class="control-label">Profile
							Type</label>
						<div class="controls">
							<form:select id="profileType" multiple="false" path="profileType"
								data-rel="chosen" required="true">
								<form:options items="${allProfileTypes}" itemLabel="profileType"
									itemValue="ID" />
							</form:select>
						</div>
					</div>

					<div class="control-group">
						<label for="startDate" class="control-label">Start Date</label>
						<div class="controls">
							<form:input path="startDate" rel="datetime" type="text" class="form-control"
								id="startDate" placeholder="Start Date" required="true" />
						</div>
					</div>

					<div class="control-group">
						<label for="endDate" class="control-label">End Date</label>
						<div class="controls">
							<form:input path="endDate" rel="datetime" type="text" class="form-control"
								id="endDate" placeholder="End Date" required="true" />
						</div>
					</div>

                    <div class="control-group">
                        <label for="activityRoleLocation" class="control-label">Location</label>
                        <div class="controls">
                            <form:input path="location" type="text" class="form-control" id="activityRoleLocation"
                                placeholder="Location" required="true" />
                        </div>
                    </div>
				</fieldset>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/widgets/misc/form-submit-buttons.jsp"></jsp:include>
</form:form>