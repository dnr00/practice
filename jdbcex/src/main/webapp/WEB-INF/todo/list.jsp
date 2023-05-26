<%--
  Created by IntelliJ IDEA.
  User: sanguk
  Date: 2023-03-14
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
<h1>Todo List</h1>

<ul>
    <select name="search" title="searchname">
        <option selected value="">선택하세요</option>
        <option value="${dto.title}"<c:if test="${}">selected="selected"</c:if> >제목</option>
    </select>
</ul>

<ul>
    <c:forEach items="${dtoList}" var="dto">
        <li>
            <span><a href="/todo/read?tno=${dto.tno}">${dto.tno}</a> </span>
            <span>${dto.title}</span>
            <span>${dto.dueDate}</span>
            <span>${dto.finished? "DONE": "NOT YET"}</span>
        </li>
    </c:forEach>
</ul>

</body>
</html>
