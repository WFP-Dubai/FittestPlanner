<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="sortable row-fluid">
	<div class="box span4">
		<jsp:include page="/WEB-INF/widgets/tables/staffbreakinservice-table.jsp"></jsp:include>
	</div>

	<div class="box span4">
		<jsp:include page="/WEB-INF/widgets/tables/staffavailable-table.jsp"></jsp:include>
	</div>

	<div class="box span4">
		<jsp:include page="/WEB-INF/widgets/tables/staffnotavailable-table.jsp"></jsp:include>
	</div>
</div>