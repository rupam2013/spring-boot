<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>


<h2>This is a Spring bean home page</h2>

 <div class="container">
    <h3>This is secured!</h3>
    <p>
      Hello <b><%= request.getRemoteUser() %></b>
    </p>
    <a href="/logout">logout</a>
    </div>


</body>
</html>