<%--
  Created by IntelliJ IDEA.
  User: yukti
  Date: 16/3/19
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<h1>
${heading}
</h1>
<form method="post" action="/form3/submitForm3.html">
    <label>First Name</label>
    <input name="firstName" type="text">
    <label>Last Name</label>
    <input name="lastname" type="text">
    <input type="submit">
</form>
</body>
</html>
