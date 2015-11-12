<%-- 
    Document   : index
    Created on : Jul 26, 2014, 12:59:32 PM
    Author     : Uchiha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="css/style.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <div id="main">
        <div id="content">
    <body>
        Login:
        
        <s:form action="LoginAction" >
        <s:textfield name="userid" label="Login ID" /></br>
        <s:password name="password" label="Password"/></br>
        <s:submit value="LOGIN"/>
        </s:form>

        <a href="register.jsp">click here</a>for Voter Registration</br>
        <a href="register_candidate.jsp">click here</a>for Candidate Registration</br>
        
    </body>
        </div>
    </div>
</html>



