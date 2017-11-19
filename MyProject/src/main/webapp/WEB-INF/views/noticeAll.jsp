<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<th>BNO</th>
		<th>TITLE</th>
		<th>WRITER</th>
		<th>REGDATE</th>
	</table>

<c:forEach items="${listall}" var="noticeVO">
<tr>
	<td>${noticeVO.bno}</td>
	<td>${noticeVO.title}</td>
	<td>${noticeVO.writer}</td>
	<td>${noticeVO.regdate}</td>
</tr>
</c:forEach>

</body>
</html>