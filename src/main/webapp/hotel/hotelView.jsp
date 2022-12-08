<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/board.js"></script>
<link rel="stylesheet" type="text/css" href="css/board.css">
</head>
<body>
<div id="wrap" align = "center">
	<h1>게시판 상세 보기</h1>
		<table>
			<tr>
				<th>작성자</th> <td>${board.name}</td>		
			</tr>
			
			<tr>
				<th>이메일</th> <td>${board.email}</td>	
			</tr>
			
			<tr>
				<th>작성일</th> <td><fmt:formatDate value="${board.writedate}"/></td>
			</tr>
			
			<tr>
				<th>조회수</th> <td>${board.readcount}</td>
			</tr>
			
			<tr>
				<th>별점</th> <td>${board.starpoint} /10</td>
			</tr>
			
			<tr>
				<th>제 목</th> 
				<td colspan="3"> <pre>${board.title}</pre>
				</td>
			</tr>	
	
			<tr>
				<th>내 용</th> 
				<td colspan="3"> <pre>${board.content}</pre>
				</td>
			</tr>
			
			
	
		</table>
		<br><br>
		<input type="button" value="게시글 수정" 
		onclick="location.href='HotelServlet?command=board_update_form&num=${board.num}'">
		
		<input type="button" value="게시글 삭제"
		onclick="location.href='HotelServlet?command=board_delete_form&num=${board.num}'" onclick="location.href='HotelServlet?command=visit_review'">
		
		<input type="button" value="게시글 리스트"
		onclick="location.href='HotelServlet?command=visit_review'">
		
		<input type="button" value="게시글 등록"
		onclick="location.href='HotelServlet?command=board_write_form'">


</div>



</body>
</html>