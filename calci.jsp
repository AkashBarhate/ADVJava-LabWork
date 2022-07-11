<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if("add" != null){%>
<%
int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));

int sum =num1+num2;

%>
<h1>Sum of <%=num1 %> and <%=num2 %> is <%=sum %></h1>
<%}%>

<% if("multiply" != null){%>
<%
int num3=Integer.parseInt(request.getParameter("num1"));
int num4=Integer.parseInt(request.getParameter("num2"));

int mul =num3 *num4;

%>

<h1>Multiplication of <%=num3 %> and <%=num4 %> is <%=mul %></h1>
<%}%>

</body>
</html>