<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

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
      id="deployment-form">
  <div class="row">
    <div class="col-md-6">
      <t:defaultPanel title="Time & Date">
        <jsp:attribute name="panelBody">
          <t:formGroup label="Start Date">
            <input name="startDate"
                   id="startDate"
                   type="text"
                   placeholder="DD/MM/YYYY"
                   class="form-control datepicker"
                   required />
          </t:formGroup>
          <t:formGroup label="End Date">
            <input name="endDate"
                   id="endDate"
                   type="text"
                   class="form-control datepicker"
                   placeholder="DD/MM/YYYY"
                   required />
          </t:formGroup>
          <t:formGroup label="Time Marker">
            <label id="timelineMarker"
                   class="form-control"
                   disabled="true">
            </label>
          </t:formGroup>
        </jsp:attribute>
      </t:defaultPanel>
    </div>
    <div class="col-md-6">
      <t:defaultPanel title="Options">
        <jsp:attribute name="panelBody">
          <t:formGroup label="Show Confirmed Only">
            <input id="showConfirmedOnly"
                   class="form-control"
                   type="checkbox" />
          </t:formGroup>
          <t:formGroup label="Show Planned Events">
            <input id="showEvents" class="form-control" type="checkbox" />
          </t:formGroup>
        </jsp:attribute>
      </t:defaultPanel>
    </div>
  </div>
  
  <div class="row">
    <div class="col-md-6">
      <t:defaultPanel title="Staff Types">
        <jsp:attribute name="panelBody">
          <t:formGroup label="Select All">
            <input
            type="checkbox"
            class="form-control" id="select-all-staffTypes" />
          </t:formGroup>
          <t:formGroup label="Staff Type">
            <select id="staffTypes" class="form-control"
                    size="10"
                    multiple="true"
                    required>
              
            </select>
          </t:formGroup>
        </jsp:attribute>
      </t:defaultPanel>
    </div>

    <div class="col-md-6">
      <t:defaultPanel title="Activity">
        <jsp:attribute name="panelBody">
          <t:formGroup label="Select All">
            <input type="checkbox"
                   class="form-control" id="select-all-activities" />
          </t:formGroup>
          <t:formGroup label="Activity">
            <select id="activities" class="form-control"
                    size="12"
                    multiple="true"
                    required>
              
            </select>
          </t:formGroup>
        </jsp:attribute>
      </t:defaultPanel>
    </div>
  </div>

  <div class="row">
    <div class="col-md-4">
      <div class="btn-toolbar">
        <button
          id="clear-deployment"
          type="reset"
          class="btn btn-md btn-danger">
          <span class="glyphicon glyphicon-remove"> Clear</span>
        </button>
        <button
          id="submit-deployment"
          type="submit"
          class="btn btn-md btn-success">
          <span class="glyphicon glyphicon-ok"> Submit</span>
        </button>
      </div>
    </div>
  </div>
</form>
