<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="activityDetails" method="POST" action="new">
	<div class="row-fluid">
		<div class="well">
			<div class="form-horizontal">
				<fieldset>
					<legend>Date</legend>
					<div class="control-group">
						<label for="activityDescription" class="control-label">Activity
							Description</label>
						<div class="controls">
							<form:input type="text" path="description" class="form-control" id="activityDescription"
								placeholder="Description" required="true" />
						</div>
					</div>
					<div class="control-group">
						<label for="activityType" class="control-label">Activity
							Type</label>
						<div class="controls">
							<form:select id="activityType" multiple="false"
								path="activityType" data-rel="chosen" required="true">
								<form:options items="${allActivityTypes}" value="${activityType.ID}"
									itemLabel="activityType" itemValue="ID" />
							</form:select>
						</div>
					</div>
					<div class="control-group">
						<label for="etcServiceMap" class="control-label">ETC
							Service Map</label>
						<div class="controls">
							<form:input path="etcServiceMap" type="url" class="form-control" id="etcServiceMap"
								placeholder="etcServiceMap" required="false"/>
						</div>
					</div>

				</fieldset>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/widgets/misc/form-submit-buttons.jsp"></jsp:include>
</form:form>