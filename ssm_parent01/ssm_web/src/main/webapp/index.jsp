<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/12/19
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="/accountController/findAll">点击查询所有账户</a>
    <hr>
    <form action="/accountController/findAccountById" method="post">
        <input type="text" name="id" placeholder="请输入指定id"><br>
        <input type="submit" value="查询指定账户">
    </form>
    <hr>
    <form action="/accountController/saveAccount" method="post">
        <input type="text" name="name" placeholder="请输入账户名"><br>
        <input type="text" name="money" placeholder="请输入余额"><br>
        <input type="submit" value="保存账户">
    </form>
    <hr>
    <form action="/accountController/deleteAccount" method="post">
        <input type="text" name="id" placeholder="请输入指定id"><br>
        <input type="submit" value="删除账户">
    </form>
    <hr>
    <form action="/accountController/updateAccount" method="post">
        <input type="text" name="id" placeholder="请输入指定id"><br>
        <input type="text" name="money" placeholder="请输入修改的金额"><br>
        <input type="submit" value="修改账户">
    </form>
</body>
</html>
