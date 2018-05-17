<%-- 
    Document   : fizzbuzz
    Created on : 2018/04/19, 0:28:48
    Author     : hibikisekine
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ナベアツ課題</title>
</head>
<body>
    <h1>ナベアツ課題</h1>
    <%
    
    int i;
    for(i=1;i<=40;i++){
        out.print(i);
        if((i%3==0 || String.valueOf(i).indexOf("3") != -1) && (i%5==0)){
            out.print("アホになる犬っぽくなる");
        }else if(i%3==0 || String.valueOf(i).indexOf("3") != -1){
            out.print("アホになる");
        }else if(i%5==0){
            out.print("犬っぽくなる");
        }
        out.print("<br>");
    }

    %>
</body>
</html>