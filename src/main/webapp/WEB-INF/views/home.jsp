<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


    <table>
        <tr>
            <th>순번</th>
            <th>타입</th>
            <th>제목</th>
            <th>내용</th>
            <th>조횟수</th>
        </tr>
        <c:forEach var="list" items="${result}">
            <tr>
                <td>${list.REPORT_NO}</td>
                <td>${list.REPORT_TYPE}</td>
                <td>${list.SUBJECT}</td>
                <td>${list.CONTENT}</td>
                <td>${list.SCNT}</td>
            <tr>
        </c:forEach>
    </table>
    
    
</body>
</html>
