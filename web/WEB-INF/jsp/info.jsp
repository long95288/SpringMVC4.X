<%--
  Created by IntelliJ IDEA.
  User: 风兮木落
  Date: 2019/5/24
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆信息</title>
</head>
<body>
<h4>这是路径为rootURL/login/info的处理</h4>
<br>
Model传过来的数据${info}
<table>
    <tr>
        <td>账号:</td><td>${account}</td>
    </tr>
    <tr>
        <td>密码:</td><td>${password}</td>
    </tr>
</table>
</body>
</html>
