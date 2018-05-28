<%-- 
    Document   : map
    Created on : 2018/05/28, 17:44:45
    Author     : hibikisekine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HashMap<String, String> data = new HashMap<String, String>();
            data.put("1", "AAA");
            data.put("hello", "world");
            data.put("soeda", "33");
            data.put("20", "20");
            
            for(String key : data.keySet()){
                out.println(data.get(key));
            }
        %>
    </body>
</html>
