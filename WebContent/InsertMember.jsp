

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="web.MemberController" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MemberController" method="post">
            <input type="text" name="memName">
            <input type="submit" value="Insert Member">
            
        </form>
    </body>
</html>
