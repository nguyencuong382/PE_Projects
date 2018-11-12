<%-- 
    Document   : edit
    Created on : Nov 10, 2018, 3:55:00 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/FinalQ2_SE05630/edit" method="POST">
            <p>ID:<input type="text" name="ID" value="${dummy.dummyID}" /></p>
            <p>Name:<input type="text" name="dummyName" value="${dummy.dummyName}" /></p>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
