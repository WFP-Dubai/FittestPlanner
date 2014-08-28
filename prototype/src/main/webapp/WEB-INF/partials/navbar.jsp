<%@ page
   language="java"
   contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div
  class="navbar navbar-default"
  role="navigation">
  <div class="navbar-inner">
    <button
      type="button"
      class="navbar-toggle pull-left"
      data-toggle="collapse"
      data-target=".navbar-collapse">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>

    <a class="navbar-brand" href="#">FITTEST Tracker</a>

    <div class="btn-group pull-right">
      <form
        method="POST"
        action="<c:url value="/logout" />">
        <button type="submit" class="btn btn-danger">
          <i class="glyphicon glyphicon-off"></i>
          <span class="hidden-sm hidden-xs"> Logout</span>
        </button>
      </form>
    </div>
    
    <div class="btn-group pull-right">
      <form
        method="POST"
        action="<c:url value="#" />">
        <button type="button" class="btn btn-primary">
          <i class="glyphicon glyphicon-user"></i>
          <span class="hidden-sm hidden-xs"> ${name}</span>
        </button>
      </form>
    </div>
        
    <div class="btn-group pull-right theme-container">
      <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
        <i class="glyphicon glyphicon-tint"></i><span
          class="hidden-sm hidden-xs"> Change Theme</span>
        <span class="caret"></span>
      </button>
      <ul class="dropdown-menu" id="themes">
        <li><a data-value="classic" href="#"><i class="whitespace"></i> Classic</a></li>
        <li><a data-value="cerulean" href="#"><i class="whitespace"></i> Cerulean</a></li>
        <li><a data-value="cosmo" href="#"><i class="whitespace"></i> Cosmo</a></li>
        <li><a data-value="cyborg" href="#"><i class="whitespace"></i> Cyborg</a></li>
        <li><a data-value="darkly" href="#"><i class="whitespace"></i> Darkly</a></li>
        <li><a data-value="flatly" href="#"><i class="whitespace"></i> Flatly</a></li>
        <li><a data-value="journal" href="#"><i class="whitespace"></i> Journal</a></li>
        <li><a data-value="lumen" href="#"><i class="whitespace"></i> Lumen</a></li>
        <li><a data-value="readable" href="#"><i class="whitespace"></i> Readable</a></li>
        <li><a data-value="simplex" href="#"><i class="whitespace"></i> Simplex</a></li>
        <li><a data-value="slate" href="#"><i class="whitespace"></i> Slate</a></li>
        <li><a data-value="spacelab" href="#"><i class="whitespace"></i> Spacelab</a></li>
        <li><a data-value="superhero" href="#"><i class="whitespace"></i> Superhero</a></li>
        <li><a data-value="united" href="#"><i class="whitespace"></i> United</a></li>
        <li><a data-value="yeti" href="#"><i class="whitespace"></i> Yeti</a></li>
      </ul>
    </div>
  </div>
</div>
