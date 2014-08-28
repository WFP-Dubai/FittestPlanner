<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@attribute name="id" required="true" %>
<%@ attribute
   name="data"
   required="true"
   type="java.util.Map" %>
<%@attribute name="width" required="false" %>
<%@attribute name="height" required="false" %>

<div id="${id}">
  <svg style="width:${width};height:${height};">
  </svg>
</div>

<script type="text/javascript">
 nv.addGraph(function() {
   var chart = nv.models
                 .pieChart()
                 .x(function(d) { return d.label })
                 .y(function(d) { return d.value })
                 .showLabels(true)
                 .labelThreshold(.05)
                 .donut(true)
                 .donutRatio(0.45);
   d3.select("#${id} svg")
     .datum([
     <c:forEach var="d" items="${data}">
     {
       "label" : "${d.key}",
       "value" : ${d.value}
     },
     </c:forEach>
   ])
     .transition().duration(350)
     .call(chart);

   chart.update();
   nv.utils.windowResize(chart.update);   
   return chart;
 });
</script>
