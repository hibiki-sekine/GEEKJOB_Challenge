<%-- 
    Document   : while
    Created on : 2018/05/29, 0:30:51
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
            double var = 1000;
            while(var > 100){
                var = var/2;
            }
            out.println(var);
        %>
    </body>
</html>
