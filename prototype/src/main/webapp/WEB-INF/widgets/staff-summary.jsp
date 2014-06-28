<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="sortable row-fluid">
	<div class="box span4">
		<jsp:include page="/WEB-INF/widgets/staffbreakinservice-table.jsp"></jsp:include>
	</div>

	<div class="box span4">
		<jsp:include page="/WEB-INF/widgets/staffavailable-table.jsp"></jsp:include>
	</div>

	<div class="box span4">
		<jsp:include page="/WEB-INF/widgets/staffnotavailable-table.jsp"></jsp:include>
	</div>
</div>