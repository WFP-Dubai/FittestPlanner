<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:url var="saveURL" value="/staff/save"/>
<form:form modelAttribute="staffDetails" method="POST" action="${saveURL}">
	<div class="row-fluid">
		<div class="well span4">
			<div class="form-horizontal">
				<fieldset>
					<legend>Date</legend>
					<div class="control-group">
						<label for="staffIndex" class="control-label">Staff Index</label>
						<div class="controls">
							<form:input type="number" min="0" path="index"
								class="form-control" id="staffIndex" placeholder="Staff Index"
								required="true" />
						</div>
					</div>
					<div class="control-group">
						<label for="firstName" class="control-label">First Name</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="firstName"
								id="firstName" placeholder="First Name" required="true" />
						</div>
					</div>
					<div class="control-group">
						<label for="lastName" class="control-label">Last Name</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="lastName"
								id="lastName" placeholder="Last Name" required="true" />
						</div>
					</div>
					<div class="control-group">
						<label for="dateOfBirth" class="control-label">Date of
							Birth</label>
						<div class="controls">
							<form:input rel="datetime" type="text" path="dateOfBirth"
								class="form-control" id="dateOfBirth"
								placeholder="Date of Birth" />
						</div>
					</div>
					<div class="control-group">
						<label for="title" class="control-label">Title</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="title"
								id="title" placeholder="Title" required="true" />
						</div>
					</div>
					<div class="control-group">
						<label for="thuraya" class="control-label">Thuraya</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="thuraya"
								id="thuraya" pattern="\+?\d+" placeholder="Thuraya" />
						</div>
					</div>
					<div class="control-group">
						<label for="mobile" class="control-label">Mobile Phone</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="mobile"
								pattern="\+?\d+" id="mobile" placeholder="Mobile Phone" />
						</div>
					</div>

					<div class="control-group">
						<label for="staffType" class="control-label">Staff Type</label>
						<div class="controls">
							<form:select id="staffType" size="10" multiple="false"
								path="staffType" data-rel="chosen" required="true">
								<form:options items="${allStaffTypes}" itemLabel="staffType"
									itemValue="ID" />
							</form:select>
						</div>
					</div>

					<div class="control-group">
						<label for="colorCode" class="control-label">Color Code</label>
						<div class="controls">
							<form:input type="text" class="form-control" path="staffColorCode" id="colorCode"
								placeholder="Color Code" />
						</div>
					</div>
				</fieldset>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/widgets/misc/form-submit-buttons.jsp"></jsp:include>
</form:form>