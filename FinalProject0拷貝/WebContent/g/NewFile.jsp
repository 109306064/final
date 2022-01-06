<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoogleSearch</title>

</head>
<body>

<p>Search engine</p>

<body style='background-color:#F78B88'>
<div>
		<%
		String[][] orderList = (String[][]) request.getAttribute("search");
		

		for (int i = 0; i < orderList.length; i++) {
			String s=orderList[i][1];
			s=s.substring(7);
		%>
		
		 <% System.out.println( s+orderList); %>
		
		<%
}
%>
	</div>

</body>
</html>