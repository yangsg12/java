<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2014/12/17
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
  </head>
  <body>
    <form name="login" method="post" action="login.action">
        <p>
            用户：
            <input type="text" name="username" id="textfield"/>
            <br />
            <br />
            <input type="text" name="password" id="textfield2"/>
            <br />
            <br />
            <input type="submit" name="button" value="提交" />
        </p>
    </form>

  </body>
</html>
