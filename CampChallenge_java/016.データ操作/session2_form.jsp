<%-- 
    Document   : session2_form
    Created on : 2018/08/30, 12:23:46
    Author     : hibikisekine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession hs = request.getSession();

            String name0 = "";
            if (hs.getAttribute("name") != null) {
                name0 = (String) hs.getAttribute("name");
            }
            String sex0 = "";
            if (hs.getAttribute("sex") != null) {
                sex0 = (String) hs.getAttribute("sex");
            }
            String hobby0 = "";
            if (hs.getAttribute("hobby") != null) {
                hobby0 = (String) hs.getAttribute("hobby");
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./session2.jsp" method="post">
            <p>名前:<input type="text" name="name" required value="<%=name0%>"></p>
            <p>
                男<input type="radio" name="sex" value = "男" required
                        <% if (sex0.equals("男")) {
                                out.print("checked");
                            }%>>
                女<input type="radio" name="sex" value ="女" required
                        <% if (sex0.equals("女")) {
                                out.print("checked");
                            }%>>
            </p>
            <p>趣味:<textarea name="hobby"><%=hobby0%></textarea></p>
            <input type = "submit" name="button" value = "送信">
        </form>
    </body>
</html>
