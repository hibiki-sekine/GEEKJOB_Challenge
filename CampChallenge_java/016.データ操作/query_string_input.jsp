<%-- 
    Document   : query_string_input
    Created on : 2018/06/29, 15:24:36
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
        <form action="./query_string_output.jsp" method="get">
            <!-- formタグで括られた入力項目はこれら -->
            <input type="text" name="total">
            <input type="text" name="count">
            <input type="text" name="type">
            <input type="submit" name="btnSubmit">

        </form>
    </body>
</html>
