<%--
  Created by IntelliJ IDEA.
  User: zhugp
  Date: 2017/6/23
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <p>${result}</p>
    <form action="loginAction.action" method="post">
      账号:<input name = "loginName" type="text" placeholder="输入账号">
      密码:<input name = "password" type="password" placeholder="输入密码">
      <button type="submit">登录</button>
    </form>
  </body>
</html>
