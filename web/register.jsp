<%-- 
    Document   : register
    Created on : Jul 12, 2014, 3:27:34 PM
    Author     : Uchiha
--%>
<link rel="stylesheet" type="text/css" href="css/style.css">
<%@taglib prefix="h" uri="/struts-tags" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <div id="main">
    <body>
        <h1>Enter your details here : </h1>
        <h:form action="RegisterAction">
            <h:textfield name="Name" label="Name"></h:textfield>
            <h:textfield name="userid" label="User Id"></h:textfield>
            <h:password name="password" label="Password"></h:password>
            <h:textfield name="constituency" label="constituency"></h:textfield>
            <h:textfield name="role" label="role"></h:textfield>
            <h:textfield name="city" label="city"></h:textfield>
            <h:submit value="Register"></h:submit>
        </h:form>
    
    </body>
    </div>
</html>
