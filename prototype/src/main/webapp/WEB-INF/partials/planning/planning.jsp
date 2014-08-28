<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<div class="col-sm-12">
  <div id="planning-panel">
    <div class="row">
      <div class="col-md-6">
        <t:defaultPanel title="Activity">
          <jsp:attribute name="panelBody">
            <jsp:include page="/WEB-INF/partials/planning/planning-form.jsp" />
          </jsp:attribute>
        </t:defaultPanel>
      </div>
      <div class="col-sm-6">
        <t:defaultPanel title="Staff Role">
          <jsp:attribute name="panelBody">
            <jsp:include
              page="/WEB-INF/partials/staff/staff-roles/staff-role-form-js.jsp" />
          </jsp:attribute>
        </t:defaultPanel>
      </div>
    </div>
  </div>
  
  <div id="planning-table-panel"
       class="box col-md-12">
    <div class="box-inner">
      <div class="box-header well">
        <h2>Planning Table</h2>
        <div class="box-icon">
          <a href="#" class="btn btn-minimize btn-round btn-default"><i
            class="glyphicon glyphicon-chevron-up"></i></a>
          <a href="#" class="btn btn-close btn-round btn-default"><i
            class="glyphicon glyphicon-remove"></i></a>
        </div>
      </div>
      <div class="box-content row"
           id="planning-table-panel-body">
        <div class="col-sm-12">
          <jsp:include page="/WEB-INF/partials/planning/planning-table.jsp" />
        </div>
      </div>
    </div>
  </div>
</div>
