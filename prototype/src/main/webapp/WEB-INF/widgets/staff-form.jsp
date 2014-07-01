<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="row-fluid">
	<form:form modelAttribute="staffDetails" method="POST">
		<div class="well">
		
			<div class="form-horizontal">
				<fieldset>
					<legend>Date</legend>
					<div class="control-group">
						<label for="startDate" class="control-label">Start Date</label>
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
	</form:form>
</div>