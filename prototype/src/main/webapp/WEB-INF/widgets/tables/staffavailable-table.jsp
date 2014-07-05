<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well">
	<h2>Available</h2>
	<div class="box-icon">
		<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
		<a href="#" class="btn btn-minimize btn-round"><i
			class="icon-chevron-up"></i></a> <a href="#"
			class="btn btn-close btn-round"><i class="icon-remove"></i></a>
	</div>
</div>
<div class="box-content info-panel">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="staff" items="${availableStaff}">
				<tr>
					<td>
						<ul class="dashboard-list">
							<li><a href="<c:url value="${staff.index}"/>"> <img
									class="dashboard-avatar" alt="${staff.firstName}"
									src="${contextPath}/img/profile.png" /> <strong>Name:</strong>
									${staff.name} <br /> <strong>Profile Type:</strong> <c:forEach
										var="profileType" items="${staff.profileTypes}">
										<c:out value="${profileType.profileType}" />
									</c:forEach>
							</a></li>
						</ul>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div class="btn-group btn-group-sm pull-right">
		<button type="button" class="btn btn-primary">${availableStaff.size()}</button>
		<button type="button" class="btn btn-default">View</button>
	</div>
	<div class="clearfix"></div>
</div>