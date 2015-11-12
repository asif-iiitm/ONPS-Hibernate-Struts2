<%-- 
    Document   : AdminPanel
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

<s:query var="rs">
    select * from users
</s:query>
<s:query var="rs2">
    select * from Voters
</s:query>
             
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>
        <table border="1" bgcolor=""lightblue">
               <tr>
                
                <th>
                    User Id
                </th>
                <th>
                    Role
                    
                </th>
                <th>Delete</th>
               
                
            </tr>
            <c:forEach var="data" items="${rs.rows}">
            <tr>
                <td>
                    ${data.userid}
                </td>
                <td>
                    ${data.role}
                </td>
                <td>
                    
                    <a  href="delete.jsp?id=${data.userid}">
                        Delete
                    </a>
                </td>
               </tr>
            
            </c:forEach>
    </body>
</html>
