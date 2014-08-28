<%@ page
   language="java"
   contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" %>
<%@ taglib
   prefix="c"
   uri="http://java.sun.com/jsp/jstl/core" %>

<div
  id="sidebar"
  class="sidebar-nav"
  role="navigation">
  <div class="nav-canvas">
    <div class="nav-sm nav nav-stacked">
    </div>
    <img id="logo"
         class="center"
         width="150"
         height="150"
         src="<c:url value="/fittesttracker/images/logo.png" />" />
         
    <ul class="nav nav-pills nav-stacked main-menu">
      <li class="nav-header">Main</li>
      <li>
        <a href="<c:url value="/dashboard" />">
          <span class="glyphicon glyphicon-home"> Dashboard</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/planning" />">
          <span class="glyphicon glyphicon-time"> Planning</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/deployment" />">
          <span class="glyphicon glyphicon-info-sign"> Deployment</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/requirement" />">
          <span class="glyphicon glyphicon-search"> Requirement</span>
        </a>
      </li>
      
      <li class="nav-header">Activity</li>
      <li>
        <a href="<c:url value="/activity" />">
          <span class="glyphicon glyphicon-star"> Activity</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/activityRole" />">
          <span class="glyphicon glyphicon-bookmark"> Activity Role</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/activityType" />">
          <span class="glyphicon glyphicon-tags"> Activity Type</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/event" />">
          <span class="glyphicon glyphicon-road"> Event</span>
        </a>
      </li>
      
      <li class="nav-header">Staff</li>
      <li>
        <a href="<c:url value="/staffList" />">
          <span class="glyphicon glyphicon-user"> Staff</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/staffRole" />">
          <span class="glyphicon glyphicon-pushpin"> Staff Role</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/staffType" />">
          <span class="glyphicon glyphicon-tag"> Staff Type</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/profileType" />">
          <span class="glyphicon glyphicon-paperclip"> Profile Type</span>
        </a>
      </li>
      
      <li class="nav-header">Misc</li>
      <li>
        <a href="<c:url value="/country" />">
          <span class="glyphicon glyphicon-globe"> Country</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/language" />">
          <span class="glyphicon glyphicon-italic"> Language</span>
        </a>
      </li>
      <li>
        <a href="<c:url value="/confirmedType" />">
          <span class="glyphicon glyphicon-ok-circle"> Confirmed Type</span>
        </a>
      </li>
    </ul>
  </div>
</div>
