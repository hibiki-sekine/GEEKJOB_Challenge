<%-- 
    Document   : if
    Created on : 2018/05/24, 17:55:50
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
            int i;
            i = 1;
            if(i == 1){
                out.print("1です!");
            }else if(i == 2){
                out.print("プログラミングキャンプ!");
            }else{
                out.print("その他です!");
            }
        %>
    </body>
</html>
