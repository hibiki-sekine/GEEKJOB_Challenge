<%-- 
    Document   : array1
    Created on : 2018/05/24, 18:42:18
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
            String[] data = {"10","100","soeda","hayashi","-20","118","END"};
            for(int i=0;i<data.length;i++){
                out.print(data[i] + " ");
            }
        %>
    </body>
</html>
