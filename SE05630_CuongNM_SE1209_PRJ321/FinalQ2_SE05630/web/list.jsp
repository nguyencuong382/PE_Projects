<%-- 
    Document   : list
    Created on : Nov 10, 2018, 3:45:58 PM
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

        <table border="1" cellspacing="0">
            <thead>
                <tr>
                    <th>DummyID</th>
                    <th>DummyName</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="d" items="${dummies}">
                    <tr>
                        <td>${d.dummyID}</td>
                        <td>${d.dummyName}</td>
                    </tr>
                </c:forEach>


            </tbody>
        </table>


    </body>
</html>
