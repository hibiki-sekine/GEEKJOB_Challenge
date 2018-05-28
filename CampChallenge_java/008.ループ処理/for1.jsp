<%-- 
    Document   : for1
    Created on : 2018/05/29, 0:11:56
    Author     : hibikisekine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            long result = 1;
            for(int i=0;i<20;i++){
                result = result * 8;
            }
            out.println(result);
        %>
    </body>
</html>
