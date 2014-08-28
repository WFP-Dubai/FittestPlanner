<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<div class="row" style="padding-bottom: 20px;">
  <div class="col-md-12">
    <t:defaultPanel title="Timeline">
      <jsp:attribute name="panelBody">
        <div id="timeline">
          
        </div>
      </jsp:attribute>
    </t:defaultPanel>
  </div>
</div>
<form class="form-horizontal"
      role="form"
      id="requirement-form">
  <div class="row">
    <div class="col-sm-6">
      <t:defaultPanel title="Time & Date">
        <jsp:attribute name="panelBody">
          <t:formGroup label="Start Date">
            <input id="startDate"
                   type="text"
                   placeholder="DD/MM/YYYY"
                   class="form-control datepicker"
                   required />
          </t:formGroup>
          <t:formGroup label="End Date">
            <input id="endDate"
                   type="text"
                   placeholder="DD/MM/YYYY"
                   class="form-control datepicker"
                   required />
          </t:formGroup>
          <t:formGroup label="Time Marker">
            <label id="timelineMarker" class="form-control" disabled="true">
            </label>
          </t:formGroup>
        </jsp:attribute>
      </t:defaultPanel>
    </div>

    <div class="col-sm-6">
      <t:defaultPanel title="Options">
        <jsp:attribute name="panelBody">
          <t:formGroup label="Show Confirmed Only">
            <input id="showConfirmedOnly" class="form-control" type="checkbox" />
          </t:formGroup>
        </jsp:attribute>
      </t:defaultPanel>

      <t:defaultPanel title="Activity">
        <jsp:attribute name="panelBody">
          <t:formGroup label="Select All">
            <input type="checkbox" class="form-control" id="select-all-activities" />
          </t:formGroup>
          <t:formGroup label="Activity">
            <select id="activities" class="form-control"
                    size="12"
                    multiple="true"
                    required></select>
          </t:formGroup>
        </jsp:attribute>
      </t:defaultPanel>
    </div>
  </div>

  <div class="row">
    <div class="col-sm-4">
      <div class="btn-toolbar">
        <button
          id="clear-requirement"
          type="reset"
          class="btn btn-md btn-danger">
          <span class="glyphicon glyphicon-remove"> Clear</span>
        </button>
        <button
          id="submit-requirement"
          type="submit"
          class="btn btn-md btn-success">
          <span class="glyphicon glyphicon-ok"> Submit</span>
        </button>
      </div>                
    </div>
  </div>
</form>
