<%--
  Created by IntelliJ IDEA.
  User: bit-user
  Date: 2018-04-16
  Time: 오후 6:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>

<form action="/cmd?cmd=upload" method="post" enctype="multipart/form-data">
    <input type="text" name="title" value="" size="36"> <br><br>
    <textarea name="contents" cols="28" rows="10"></textarea> <br><br>
    <input type="file" name="file"> <br>
    <input type="submit" value="upload">
</form>

</body>
</html>
