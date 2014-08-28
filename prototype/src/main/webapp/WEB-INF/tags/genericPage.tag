<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<%@attribute name="body" fragment="true"%>
<%@attribute name="meta" fragment="true"%>
<%@attribute name="_css" fragment="true"%>
<%@attribute name="jsload" fragment="true"%>
<%@attribute name="_jsinit" fragment="true"%>

<!DOCTYPE html PUBLIC
"-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <jsp:invoke fragment="meta" />
    <jsp:invoke fragment="_css" />
  </head>
  <body>
    <div id="pageheader">
      <jsp:invoke fragment="header" />
    </div>

    <div id="body">
      <jsp:doBody />
    </div>
    <div id="pagefooter">
      <jsp:invoke fragment="footer" />
    </div>

    <jsp:invoke fragment="jsload" />

    <jsp:invoke fragment="_jsinit" />
  </body>
</html>
