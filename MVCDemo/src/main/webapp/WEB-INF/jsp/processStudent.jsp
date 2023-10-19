<%--
  Created by IntelliJ IDEA.
  User: rupa
  Date: 10/04/23
  Time: 10:57 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Student</title>ji6
</head>
<body>
Welcome ${s1}!<br>
Student ID:${s.studentID}<br>
Gender : ${s.gender}<br>
Region: ${s.country}<br>
Dept  : ${s.department}<br>

SKills: <ul> <c:forEach var="i" items="${s.language} " >
 <li>${i}</li>
</c:forEach>
</ul>



</body>
</html>
