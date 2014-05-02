<%-- 
    Document   : plantilla
    Created on : 16-mar-2014, 18:18:35
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>   
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- CABECERA -->
        <s:head/>
        <tiles:insertAttribute name="cabecera"/>        
    </head>
    <body>
        <tiles:insertAttribute name="menu"/>
        <section id="contenido">
            <h1></h1>
            <div>
               <tiles:insertAttribute name="cuerpo"/>
            </div>
        </section>
               <tiles:insertAttribute name="pie"/>          
    </body>
</html>
