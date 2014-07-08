<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:url var="saveURL" value="/country/save"/>
<form:form modelAttribute="countryDetails" method="POST"
	action="${saveURL}">
	<div class="row-fluid">
		<div class="well span6">
			<div class="form-horizontal">
				<fieldset>
					<legend>Country</legend>
					<div class="control-group">
						<label for="ISOCode" class="control-label">ISO Code</label>
						<div class="controls">
							<form:input path="ISOCode" type="text" class="form-control"
								id="ISOCode" placeholder="ISO Code" required="false" />
						</div>
					</div>
					<div class="control-group">
						<label for="fullName" class="control-label">Full Name</label>
						<div class="controls">
							<form:input path="fullName" type="text" class="form-control"
								id="fullName" placeholder="Full Name" required="true" />
						</div>
					</div>
					<div class="control-group">
						<label for="Region" class="control-label">Region</label>
						<div class="controls">
							<form:input path="Region" type="text" class="form-control"
								id="Region" placeholder="Region" required="false" />
						</div>
					</div>
				</fieldset>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/widgets/misc/form-submit-buttons.jsp"></jsp:include>
</form:form>