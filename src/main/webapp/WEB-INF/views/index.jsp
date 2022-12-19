<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<%--<% String name = (String) request.getAttribute("Name"); %>--%>
<%--<h1> Name is <%=name%></h1>--%>

<%--Another way of fetching--%>
<%--Fetching Whole Arraylist--%>
<c:forEach var="item" items="${Names}">
    <h1>${item}</h1>
</c:forEach>

</body>
</html>
