<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="css/board.css">
<head>
<script type="text/javascript" src="script/board.js"></script>
<meta charset="UTF-8">
<title>게시판 등록 사이트</title>

</head>
<body>
<div id="wrap" align="center">
		<h1>방문 후기</h1>

		<form action="HotelServlet" name="frm" method="post">
			<input type="hidden" name="command" value="board_write">
			<table>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="name"> </td>				
				</tr>	
				
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass"> </td>				
				</tr>
				
				<tr>
					<th>이메일</th>
					<td><input type="text" name="email"> </td>				
				</tr>
				
				<tr>
					<th>제 목</th>
					<td><input type="text" name="title" size="70"> </td>				
				</tr>
				
				<tr>
					<th>별 점</th>
					<td><input type="text" name="starpoint" size="5"> /10</td>				
				</tr>
				
				<tr>
					<th>내 용</th>
					<td>
						<textarea rows="10" cols="80" name="content"></textarea>
					</td>				
				</tr>
						
			</table>
			<br><br>
			<input type="submit" value="등록" onclick="return visit_review()">
			<input type="reset" value="다시 작성">
			<input type="button" value="목록" onclick="location.href='HotelServlet?command=visit_review'">
		</form>



	</div>

</body>
</html>