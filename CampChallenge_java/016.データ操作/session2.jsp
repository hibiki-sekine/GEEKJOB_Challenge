<%-- 
    Document   : session2
    Created on : 2018/07/14, 16:05:22
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
            
            String name = request.getParameter("name");
            String sex = request.getParameter("sex");
            String hobby = request.getParameter("hobby");
            
            out.print("名前: " + name + "<br>");
            out.print("性別: " + sex + "<br>");
            out.print("趣味: " + hobby + "<br>");
            
            HttpSession hs = request.getSession();
           
            if(name != null && sex != null && hobby != null){
                hs.setAttribute("name", name);
                hs.setAttribute("sex", sex);
                hs.setAttribute("hobby", hobby);
            }
        %>
    </body>
</html>
