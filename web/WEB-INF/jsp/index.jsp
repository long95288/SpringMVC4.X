<%--
  Created by IntelliJ IDEA.
  User: 风兮木落
  Date: 2019/5/24
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>${title}</title>
  </head>
  <body>
  ${END}
  <div style="text-align: center">
      <form method="post" action="/login">
          <table>
              <tr>
                  <td>账号:</td><td><input type="text" name="account"></td>
              </tr>
              <tr>
                  <td>密码:</td><td><input type="password" name="password"></td>
              </tr>
              <tr>
                  <td><input type="submit" value="登陆"></td><td><input type="reset" value="重置"/></td>
              </tr>
          </table>
      </form>
  </div>
  </body>
</html>
