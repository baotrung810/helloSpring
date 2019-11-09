<%-- 
    Document   : home
    Created on : Apr 24, 2019, 7:44:52 PM
    Author     : AnhLe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${name} from ${country}</h1>
        
        <a href="<c:url value="/data?name=Anh&country=VN"/>">view data</a><br/>
        <a href="<c:url value="/data-path-variable/Anh/VN/123"/>">view data path variable</a>
    </body>
</html>
