<%-- 
    Document   : login
    Created on : 19-mar-2014, 2:34:56
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="/gchStruts2/images/ico/favicon.ico">

        <title><s:text name="login.tittle"/></title>

        <!-- Bootstrap core CSS -->
        <link href="/gchStruts/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="/gchStruts/css/signin.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy this line! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <s:head/>
    </head>

    <body>
        <s:div cssClass="container">
            <s:form cssClass="form-signin" role="form">
                <h2 class="form-signin-heading"><s:text name="login.head"/></h2>
                <s:textfield name="usuario.user" cssClass="form-control" placeholder="%{getText('login.username')}"/>
                <s:password name="usuario.pass" cssClass="form-control" placeholder="%{getText('login.password')}"/>                         
                <label class="checkbox">
                    <s:checkbox cssClass="checkbox" value="remember-me" name="checkMe"/> <s:text name="login.rememberMe"/>
                </label>  
                    <s:submit name="Login" cssClass="btn btn-lg btn-primary btn-block" 
                              key="login.button" action="loginLogin" namespace="/seguridad"/>  
                    <br/>
                    <s:actionerror/>
            </s:form>                
                
        </s:div><!-- /container -->


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="/gchStruts/js/jquery-2.1.0.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="/gchStruts/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>
