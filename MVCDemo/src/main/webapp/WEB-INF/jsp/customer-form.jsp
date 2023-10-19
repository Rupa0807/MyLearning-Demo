<%--
  Created by IntelliJ IDEA.
  User: rupa
  Date: 11/04/23
  Time: 2:40 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Login</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
<h2>Customer Details</h2>
<form:form action="processCustomer" modelAttribute="Customer">
   <div> First Name(*):  <form:input path="firstName"></form:input>
    <form:errors path="firstName" cssClass="error"/><br><br>
    Last Name :  <form:input path="lastName"></form:input><br><br>
    Customer ID:  <form:input path="customerID" ></form:input>
    <form:errors path="customerID" cssClass="error"/><br><br><br><br>
    <input type="submit" value="submit"></div>
</form:form>
</body>
</html>
