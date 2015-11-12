<%-- 
    Document   : delete
    Created on : Nov 12, 2015, 5:45:49 PM
    Author     : uchiha
--%>

<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/mydb"
                 user="root"
                 password="root"
/>
<s:update>
   delete from users where userid='${param.id}'   
</s:update>

<c:set var="msg" value="User Deleted" scope="request"/>
<jsp:forward page="AdminPanel.jsp"/>
                 