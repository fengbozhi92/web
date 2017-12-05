<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>customer</title>
</head>
<body>
	<h1>客户列表</h1>
	<table>
		<tr>
			<th>客户名称</th>
			<th>联系人</th>
			<th>电话</th>
			<th>邮箱</th>
			<th>备注</th>
		</tr>
		<c:forEach items="${customerList}" var="it">
			<tr>
				<td><a href="${BASE}/customer_show?id=${it.id}">${it.name}</a></td>
				<td>${it.contact}</td>
				<td>${it.phone}</td>
				<td>${it.email}</td>
				<td>${it.remark}</td>
				<td>
					<a href="${BASE}/customer_edit?id=${it.id}">编辑</a>&nbsp;
					<a href="${BASE}/customer_delete?id=${it.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>