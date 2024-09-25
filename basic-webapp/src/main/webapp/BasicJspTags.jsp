<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
public int add(int a,int b)
{
	return a+b;
}
%>

<%
int res=add(30, 70);
%>

<h1>Addition is <%= res %></h1>

</body>
</html>