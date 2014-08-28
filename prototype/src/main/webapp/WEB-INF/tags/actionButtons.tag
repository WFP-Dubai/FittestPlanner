<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="readOnly" required="false" %>
<%@ attribute name="entity" required="true" %>
<%@ attribute name="id" required="true" %>

<div class="btn-toolbar"
     role="toolbar"
     style="text-align: center;">
  
  <c:if test="${not readOnly}">
    <div class="btn-group btn-group-md">
      <button type="button"
              class="btn btn-danger"
              onclick="ftUI.deleteEntityDialog('${entity}', '${id}')"
              data-toggle="tooltip"
              data-placement="top"
              title="Delete">
        <span class="glyphicon glyphicon-trash"></span>
      </button>
    </div>
  </c:if>
  
  <div class="btn-group btn-group-md">
    <a href="<c:url value="/${entity}/${id}/view" />">
      <button type="button"
              class="btn btn-primary"
              data-toggle="tooltip"
              data-placement="top"
              title="View">
        <span class="glyphicon glyphicon-eye-open"></span>
      </button>
    </a>
  </div>
</div>
