<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방문후기</title>
<link rel="stylesheet" type="text/css" href="css/board.css">
</head>
<body>
<jsp:include page="header.jsp"/>


	<div id="wrap" align="center">
		<h1>방문 후기 리스트</h1>

		<table class="list">
			<tr>
				<td colspan="6" style="border: white; text-align: right"><a
					href="HotelServlet?command=board_write_form">방문후기 등록</a></td>
			</tr>

			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회</th>
				<th>별점</th>
			</tr>

			<c:forEach var="board" items="${boardList}">
				<tr class="record">

					<td>${board.num}</td>

					<td><a href="HotelServlet?command=board_view&num=${board.num}">${board.title}</a>
					</td>

					<td>${board.name}</td>

					<td><fmt:formatDate value="${board.writedate}" /></td>

					<td>${board.readcount}</td>
					
					<td>${board.starpoint }</td>

				</tr>

			</c:forEach>

		</table>

	</div>


</body>
</html>