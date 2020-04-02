<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/3/28
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add">
    姓名：<input type="text" name="userName">
   密码： <input type="text" name="password">
    <input type="submit" value="提交">
</form>

<form action="/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="files">
    <input type="submit" value="提交">
</form>
<img src="" alt="">
<a href="/download?fileName=yml配置.txt">下载</a>
</body>
</html>
