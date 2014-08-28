<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:url var="authenticate" value="/authenticate" />

<!DOCTYPE html PUBLIC
"-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <jsp:include page="/WEB-INF/partials/meta.jsp" />
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/fittesttracker/css/login.css" />" />
    <style type="text/css">

.container{ margin-top:2%; }
     #bg {
       position: fixed; 
       top: -50%; 
       left: -50%; 
       width: 200%; 
       height: 200%;
     }
     #bg img {
       position: absolute; 
       top: 0; 
       left: 0; 
       right: 0; 
       bottom: 0; 
       margin: auto; 
       min-width: 50%;
       min-height: 50%;
	    opacity: 0.75;
     }
	 .container .account-wall{ border: 1px solid; border-radius: 25px; }
     .login-title {
       color: white;
     }
    </style>
    <title>FITTESTTracker - Login</title>
  </head>
  <body>
    <div class="container">
      <div id="bg">
        <img src="<c:url value="/fittesttracker/images/background3.jpg" />" alt="">
      </div>
      <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
          
          <c:if test="${loginErrorMessage != null}">
            <div class="alert alert-danger" role="alert">
              <c:out value="${loginErrorMessage}" />
            </div>
          </c:if>
          <div class="account-wall">
		  <h1 class="text-center">
            FITTEST Tracker
          </h1>
		  <br/>
            <img class="profile-img"
                 src="<c:url value="/fittesttracker/images/profile_alt.png" />"
                 alt="">
            <form:form
              modelAttribute="loginDetails"
              method="POST"
              action="${authenticate}"
              class="form-signin">
              <form:input
                type="text"
                path="username"
                class="form-control"
                placeholder="Email"
                require="true"
                autofocus="true" />
              <form:input
                type="password"
                path="password"
                class="form-control"
                placeholder="Password"
                required="true" />
              <button class="btn btn-lg btn-primary btn-block" type="submit" />
              Sign in</button>
              <label class="checkbox">
                <input type="checkbox" value="remember-me">
                Remember me
              </label>
            </form:form>
			<center>  <img  src="<c:url value="/fittesttracker/images/FITTEST.jpg" />"  alt=""> <p/><br/>
			<small> &#169; World Food Programme 2014 </small> </center>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
