<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="staffRoleDetails" method="POST">
	<div class="row-fluid">
		<div class="well span6">
			<div class="form-horizontal">
				<fieldset>
					<legend>Date</legend>
					<div class="control-group">
						<label for="activityRoles" class="control-label">Activity
							Roles</label>
						<div class="controls">
							<form:select id="activityRoles" multiple="true"
								placeholder="Select activity roles" path="activityRoles"
								data-rel="chosen" required="true">
								<form:options items="${allActivityRoles}" itemValue="ID" />
							</form:select>
						</div>
					</div>

					<div class="control-group">
						<label for="startDate" class="control-label">Start Date</label>
						<div class="controls">
							<form:input path="startDate" rel="datetime" type="text"
								class="form-control" id="startDate" placeholder="Start Date"
								required="true" />
						</div>
					</div>

					<div class="control-group">
						<label for="endDate" class="control-label">End Date</label>
						<div class="controls">
							<form:input path="endDate" rel="datetime" type="text"
								class="form-control" id="endDate" placeholder="End Date"
								required="true" />
						</div>
					</div>

					<div class="control-group">
						<label for="staffRoleLocation" class="control-label">Location</label>
						<div class="controls">
							<form:input path="location" type="text" class="form-control"
								id="staffRoleLocation" placeholder="Location" required="true" />
						</div>
					</div>

					<div class="control-group">
						<label for="staffRoleComments" class="control-label">Comments</label>
						<div class="controls">
							<form:input path="comments" type="text" class="form-control"
								id="staffRoleComments" placeholder="Comments" />
						</div>
					</div>

					<div class="control-group">
						<label for="confirmedType" class="control-label">Confirmed
							Type</label>
						<div class="controls">
							<form:select id="confirmedType" multiple="false"
								path="confirmedType" data-rel="chosen" required="true">
								<form:options items="${allConfirmedTypes}"
									itemLabel="confirmedType" itemValue="ID" />
							</form:select>
						</div>
					</div>
				</fieldset>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/widgets/misc/form-submit-buttons.jsp"></jsp:include>
</form:form>