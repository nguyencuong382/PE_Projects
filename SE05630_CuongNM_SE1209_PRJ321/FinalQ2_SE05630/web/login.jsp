<%-- 
    Document   : login.jsp
    Created on : Nov 8, 2018, 8:33:58 PM
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

        <form action="${pageContext.request.contextPath}/login" method="POST">
            <p>Username: <input type="text" name="userName"> </p>
            <p>Password: <input type="text" name="password"></p>
            <input type="submit" value="Login">
        </form>

    </body>
</html>
