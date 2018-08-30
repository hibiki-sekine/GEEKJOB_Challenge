<%-- 
    Document   : query_string_output
    Created on : 2018/06/29, 15:25:10
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
            request.setCharacterEncoding("UTF-8");
            int total = Integer.parseInt(request.getParameter("total"));
            out.print("総額: " + total + "<br>");
            int count = Integer.parseInt(request.getParameter("count"));
            out.print("数量: " + count + "<br>");
            int t = Integer.parseInt(request.getParameter("type"));
            out.print("商品種別: ");
            if(t == 1){
                out.print("雑貨<br>");
            }else if(t == 2){
                out.print("生鮮食品<br>");
            }else if(t == 3){
                out.print("その他<br>");
            }
           
            int tanka = total / count;
            out.print("単価: " + tanka + "<br>");
            
            double point = 0;
            if(total < 3000){
                point = total * 0.00;
            }else if(total >= 3000 && total < 5000){
                point = total * 0.04;
            }else if(total > 5000){
                point = total * 0.05;
            }
            out.print("ポイント:" + point + "<br");

        %>
    </body>
</html>
