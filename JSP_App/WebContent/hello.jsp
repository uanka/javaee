<%@ page import="java.util.*" %>

<html>
<head>
	<title>Say Hello</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div>
	

<%
  String styles = (String) request.getAttribute("styles");
	out.print(styles);
%>
	<p>(Hello, friend!)<p>
</div>
</body>
</html>