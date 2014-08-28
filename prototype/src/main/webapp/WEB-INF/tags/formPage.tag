<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<%@attribute name="entity" required="true"%>

<t:page pageTitle="${entity}">
  <div class="container">
    <div class="col-sm-11 well well-lg">
      <div class="row">
        <jsp:doBody />
      </div>
    </div>
  </div>
</t:page>
