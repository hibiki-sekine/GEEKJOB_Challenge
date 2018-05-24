<%-- 
    Document   : array2
    Created on : 2018/05/24, 19:04:17
    Author     : hibikisekine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<String> data = new ArrayList<String>();
            data.add("10");
            data.add("100");
            data.add("soeda");
            data.add("hayashi");
            data.add("-20");
            data.add("118");
            data.add("END");
            data.set(2,"33");
            out.println(data);
        %>
    </body>
</html>
