<%-- 
    Document   : VoterPanel
    Created on : Nov 12, 2015, 3:49:51 PM
    Author     : uchiha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/mydb"
                 user="root"
                 password="root"
/>


             
<!DOCTYPE html>

<c:when test="${3>2}" >
    <p>
        dfsd
    </p>
</c:when>
        <p>
           
</p>
${r}

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>
       
        <table border="1" bgcolor=""lightblue">
               <tr>
                
                <th>
                    
                </th>
                <th>
                    
                    
                    "${r}"
                </th>
                <th>Del</th>
               
                
            </tr>
           
    </body>
</html>
