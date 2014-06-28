<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well">
	<h2>Not Available</h2>
	<div class="box-icon">
		<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
		<a href="#" class="btn btn-minimize btn-round"><i
			class="icon-chevron-up"></i></a> <a href="#"
			class="btn btn-close btn-round"><i class="icon-remove"></i></a>
	</div>
</div>
<div class="box-content">
	<table
		class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th>Name</th>
				<th>Break Start</th>
				<th>Break End</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="staff" items="${breakInService}">
				<tr>
					<td>${staff.name}</td>
					<td></td>
					<td></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="btn-group btn-group-sm pull-right">
		<button type="button" class="btn btn-primary">${notAvailableStaff.size()}</button>
		<button type="button" class="btn btn-default">View</button>
	</div>
	<div class="clearfix"></div>
</div>