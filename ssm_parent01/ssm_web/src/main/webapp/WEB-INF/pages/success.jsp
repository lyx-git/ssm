<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/12/19
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
    <h3>执行成功</h3>
    <c:forEach items="${accounts}" var="account">
        ${account.id}--------${account.name}-------${account.money}<br>
    </c:forEach>

    ${account.id}----${account.name}----${account.money}
</body>
</html>
