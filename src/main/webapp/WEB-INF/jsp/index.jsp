<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/11/27
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<body>

<h1>欢迎来到原始界面index</h1>
<%--${ctx}--%>
<%--<%=  request.setAttribute("ctxs",request.getContextPath())%>--%>
<img src="<%=  request.getContextPath() %>/images/1.jpg">
<img src="<%=  request.getContextPath() %>/images/2.jpg">
<img src="<%=  request.getContextPath() %>/images/3.jpg">
<%= System.currentTimeMillis()%>
<%=  request.getContextPath() %><p></p>
<%--<%= request.setAttribute("ctx",request.getContextPath()) %>--%>

<f:form modelAttribute="pks" action="${ctx}/mytests/add" method="post">
    <label>sid</label>
    <f:input path="orderId"/><p></p>
    <label>sname</label>
    <f:input path="orderNo"></f:input><p></p>
    <label>sname</label>
    <f:input path="cid"></f:input>
    <input type="submit" value="确定" />
</f:form>
</body>
</html>
