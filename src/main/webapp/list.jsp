<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" charset="UTF-8">
    <title>List</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>

        <td>Полное имя</td>
    </tr>


    <c:forEach items="${zayavkas}" var="zayavka">
    <tr>
        <td>${zayavka.id}</td>

        <td>${zayavka.fullName}</td>
    </tr>

    </c:forEach>
</table>






</body>
</html>
