<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
$(function(){
    var data = [
                <c:forEach var="datum" items="${activityTypeChartData}">
                { label: '${datum.key}', data: ${datum.value} },
                </c:forEach>
    ];
    $.plot($("#donutchart"), data, {
        series : {
            pie : {
                innerRadius : 0.5,
                show : true
            }
        },
        legend : {
            show : false
        }
    });
});
</script>