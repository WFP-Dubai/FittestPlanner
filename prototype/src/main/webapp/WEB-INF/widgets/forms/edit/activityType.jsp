<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="activityTypeDetails" method="POST">
	<div class="row-fluid">
		<div class="well">
			<div class="form-horizontal">
				<fieldset>
					<legend>Activity Type</legend>
					<div class="control-group">
						<label for="activityType" class="control-label">Activity Type</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="activityType"
								id="activityType" placeholder="Description" required="true" />
						</div>
					</div>
					<div class="control-group">
						<label for="colorCode" class="control-label">Color Code</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="colorCode"
								id="colorCode" placeholder="Color" required="false" />
						</div>
					</div>
				</fieldset>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/widgets/misc/form-submit-buttons.jsp"></jsp:include>
</form:form>