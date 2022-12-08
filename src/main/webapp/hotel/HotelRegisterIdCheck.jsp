<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 체크 페이지</title>
<script type="text/javascript" src="script/hotel.js"></script>
</head>
<body>

 <h2>아이디 중복 확인</h2>
 <p>아이디는 4~12글자 숫자 및 영문자로 입력하세요<p><hr>
 <form action="HotelServlet" name="frm" method="post">
 
  아이디:
  <input type="text" name="id" value="${id}">
  <input type="hidden" name="command" value="hotel_id_check_form">
  <input type="submit" value="중복체크"><br>
  
  <!-- 아이디 존재할 때-->
  <c:if test="${result==1}">
   <script type="text/javascript">
   <!-- 부모창의 value를 공백으로 처리-->
   opener.document.frm.id.value="";
   </script>
   ${id}는 이미 사용중인 아이디 입니다.
  </c:if>
 <!-- 아이디가 없을경우에  공백처리하는 opener 명령이 없기때문에 부모창에서  사라지지않음. -->
 <c:if test="${result==-1}">
 ${id}는 사용 가능한 아이디입니다.
 <input type="button" value="사용" class="cancel" onclick="idok()">
 </c:if>
 
 </form>

</body>
</html>