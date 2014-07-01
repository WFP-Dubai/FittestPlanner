<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="staffDetails" method="POST">
	<div class="row-fluid">
		<div class="well">
			<div class="form-horizontal">
				<fieldset>
					<legend>Date</legend>
					<div class="control-group">
						<label for="staffIndex" class="control-label">Staff Index</label>
						<div class="controls">
							<input type="number" min="0" class="form-control" id="staffIndex"
								placeholder="Staff Index" required />
						</div>
					</div>
					<div class="control-group">
						<label for="firstName" class="control-label">First Name</label>
						<div class="controls">
							<input type="text" class="form-control" id="firstName"
								placeholder="First Name" required />
						</div>
					</div>
					<div class="control-group">
						<label for="lastName" class="control-label">Last Name</label>
						<div class="controls">
							<input type="text" class="form-control" id="lastName"
								placeholder="Last Name" required />
						</div>
					</div>
					<div class="control-group">
						<label for="dateOfBirth" class="control-label">Date of
							Birth</label>
						<div class="controls">
							<input rel="datetime" type="text" class="form-control"
								id="dateOfBirth" placeholder="Date of Birth" required />
						</div>
					</div>
					<div class="control-group">
						<label for="title" class="control-label">Title</label>
						<div class="controls">
							<input type="text" class="form-control" id="title"
								placeholder="Title" required />
						</div>
					</div>
					<div class="control-group">
						<label for="thuraya" class="control-label">Thuraya</label>
						<div class="controls">
							<input type="text" class="form-control" id="thuraya"
								placeholder="Thuraya" />
						</div>
					</div>
					<div class="control-group">
						<label for="mobile" class="control-label">Mobile Phone</label>
						<div class="controls">
							<input type="text" class="form-control" pattern="\+?\d+"
								id="mobile" placeholder="Mobile Phone" />
						</div>
					</div>

					<div class="control-group">
						<label for="staffType" class="control-label">Staff Type</label>
						<div class="controls">
							<form:select id="staffType" size="10" multiple="false" path="staffType"
								data-rel="chosen" required="true">
								<form:options items="${allStaffTypes}" itemLabel="staffType"
									itemValue="ID" />
							</form:select>
						</div>
					</div>

					<div class="control-group">
						<label for="colorCode" class="control-label">Color Code</label>
						<div class="controls">
							<input type="text" class="form-control" id="colorCode"
								placeholder="Color Code" />
						</div>
					</div>
				</fieldset>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/widgets/form-submit-buttons.jsp"></jsp:include>
</form:form>