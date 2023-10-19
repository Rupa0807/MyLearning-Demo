<%--
  Created by IntelliJ IDEA.
  User: rupa
  Date: 10/04/23
  Time: 10:37 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
<h2>Enter Details</h2><br>
<form:form action="/student/processStudent"  modelAttribute="stud">
  First Name(*):  <form:input path="firstname"></form:input><
    <form:errors path="firstname"/><br><br>
  Last Name :  <form:input path="lastname"></form:input><br><br>
  Student ID:  <form:input path="studentID" ></form:input><br><br>
  Gender    :  <form:radiobutton path="gender" value="M" />Male
               <form:radiobutton path="gender" value="F" /> Female<br><br>
  <div class="h-space">Department:  <form:select path="department" ><br><br>
  <form:options
          items="${stud.departmentlist }"/><br><br>

</form:select><br><br>

   Skills :<form:checkboxes path="language" items="${stud.languagelist}"  /><br><br>
  Country   :  <form:select path="country">
    <form:option value="APAC" label="APAC"></form:option><br>
  <form:option value="UK" label="UK"></form:option><br>
  <form:option value="EU" label="EU"></form:option><br>

</form:select></div><br><br>
  <input type="submit"/>

</form:form>


</body>
</html>
