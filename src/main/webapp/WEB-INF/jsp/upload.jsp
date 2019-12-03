<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/11/29
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>
<h1>文件上传</h1>
<form action="${ctx}/toupload" method="post" enctype="multipart/form-data" >
    <input type="file" name="img" />
    <input value="上传" type="submit" />


</form><p></p>
<form action="${ctx}/downloadFile2" method="post" enctype="multipart/form-data" >
    <input type="file" name="imgcs" />
    <input value="下载" type="submit" />


</form>

</body>
</html>
