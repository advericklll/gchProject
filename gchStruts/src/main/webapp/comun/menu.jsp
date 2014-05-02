<%-- 
    Document   : menu
    Created on : 16-mar-2014, 18:18:59
    Author     : Lucas
--%>

<header>
    <%@taglib prefix="s" uri="/struts-tags"%>
    <link href="../css/dashboard.css" rel="stylesheet">
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <s:a cssClass="navbar-brand" action="home" namespace="/seguridad" executeResult="true"><s:text name="nav.systemName"/></s:a>                
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Dashboard</a></li>
                        <li><a href="#" ><s:text name="nav.settings"/></a></li>
                    <li><a href="#"><s:text name="nav.profile"/></a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><s:text name="nav.language"/> <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <s:url var="ingles" includeParams="all" value="">
                                    <s:param name="request_locale">en</s:param>
                                </s:url>
                                <s:a href="%{ingles}"><s:text name="nav.language.english"/>
                                </s:a>
                                
                            </li>
                            <li>
                                <s:url var="espanol" includeParams="all" value="">
                                    <s:param name="request_locale">es</s:param>
                                </s:url>
                                <s:a href="%{espanol}"><s:text name="nav.language.spanish"/></s:a>                            

                            </li> 


                        </ul>
                    </li>
                    <li><s:a action="logoutLogin" namespace="/seguridad"><s:text name="nav.logout"/></s:a></li>


                    </ul>
                    <form class="navbar-form navbar-right">
                    <s:textfield cssClass="form-control" name="search" placeholder="%{getText('nav.search')}"/>                    
                </form>
            </div>
        </div>
    </div>
</header>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><s:a action="iniciarProfesor" namespace="/profesor"><s:text name="menu.professors"/></s:a></li>
                <li><a href="#"><s:text name="menu.laboratories"/></a></li>
                <li><a href="#"><s:text name="menu.frequencies"/></a></li>
                <li><a href="#"><s:text name="menu.programs"/></a></li>
                <li><a href="#"><s:text name="menu.courses"/></a></li>
            </ul>            
        </div>

    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
