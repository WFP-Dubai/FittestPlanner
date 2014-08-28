<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="tc" tagdir="/WEB-INF/tags/charts"%>

<div class="row">
  <div class="col-sm-6">
    <t:defaultPanel
      type="panel-primary"
      title="Staff Availability">
      <jsp:attribute name="panelBody">
        <tc:donutChart
          id="staff-availability-chart"
          width="500px"
          height="500px"
          data="${countStaffAvailability}" />
      </jsp:attribute>
    </t:defaultPanel>
  </div>
  <div class="col-sm-6">
    <t:defaultPanel
      type="panel-primary"
      title="Staff Types">
      <jsp:attribute name="panelBody">
        <tc:donutChart
          id="staff-type-chart"
          width="500px"
          height="500px"
          data="${countStaffTypes}" />
      </jsp:attribute>
    </t:defaultPanel>
  </div>
</div>

<div class="row">
  <div class="col-sm-12">
    <t:defaultPanel
      type="panel-primary"
      title="Profile Types">
      <jsp:attribute name="panelBody">
        <tc:donutChart
          id="profile-type-chart"
          width="800px"
          height="500px"
          data="${countProfileTypes}" />
      </jsp:attribute>
    </t:defaultPanel>
  </div>
</div>
