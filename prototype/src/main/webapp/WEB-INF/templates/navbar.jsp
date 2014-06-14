<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> <span
                        class="icon-bar"></span> <span class="icon-bar"></span> <span
                        class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <img src="<c:url value="/img/WFPBanner.png" />"
                         width="45px"
                         height="35px"/>
                    FITTEST Planner
                </a>
            </div>
            <div class="collapse navbar-collapse"
                id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                </ul>

                <form class="navbar-form navbar-left" role="search"></form>

                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown"><a href="#" class="dropdown-toggle"
                        data-toggle="dropdown">Account <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><span class="glyphicon glyphicon-star">
                                        Profile</span></a></li>
                            <li class="divider"></li>
                            <li><a href="#"><span class="glyphicon glyphicon-off">
                                        Logout</span></a></li>
                        </ul></li>
                    <li class="dropdown"><a href="#" class="dropdown-toggle"
                        data-toggle="dropdown">Theme <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                        </ul></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
    </nav>