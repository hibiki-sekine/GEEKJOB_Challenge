<%-- 
    Document   : switch2
    Created on : 2018/04/19, 19:58:11
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
        char s;
        s = 'A';
        switch(s){
            case 'A':
                out.print("英語");
            break;
            case 'あ':
                out.print("日本語");
                break;
            default:
                break;
        }
    %>
    </body>
</html>
