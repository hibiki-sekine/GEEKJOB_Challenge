<%-- 
    Document   : switch
    Created on : 2018/04/19, 14:55:03
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
            int value;
            value = 0;
            switch(value){
                case 1:
                    out.print("one");
                break;
                case 2:
                    out.print("two");
                break;
                default:
                    out.print("想定外");
                break;
            }
        %>
    </body>
</html>