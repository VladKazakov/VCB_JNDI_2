<%@ page import="java.util.Date" %>
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

<c:forEach items="${zayavkas}" var="zayavka">
    <c:out value="${fullName}"/>
    ${zayavka.id}
    ${fullName}
    <c:out value="${zayavka.fullName}"/>
</c:forEach>


</body>
</html>
