<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="css/hotelRegister.css">
<link rel="stylesheet" type="text/css" href="css/reset.css">
<script type="text/javascript" src="script/hotel.js"></script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<!-- 회원가입 페이지 -->

<body>
	
   <div class="container">
            <div class="Register_form">
                <div class="Logo">
                    <p>Register</p>
                </div>
                <form action="HotelServlet" name="frm" method="post">
         		<input type="hidden" name="command" value="hotel_register">
                <input type="hidden" name="lev" value="B">
                
                <input type="text" name="name" placeholder="이름">
                
                <input type="text" name="id" id="id" placeholder="아이디">
                 <input type="hidden" name="reid">
                 <input type="button" value="중복확인" onclick="idCheck()">
                
                <input type="password" name="pass" id="pass"placeholder="비밀번호">
                <input type="password" name="repass" id="pass_check" placeholder="비밀번호 확인">
                
                <input type="text" name="phone" placeholder="핸드폰번호">
                <input type="text" name="email" placeholder="이메일">
                <input type="submit" value="회원가입"
                 onClick="return registerCheck()">
                </form>


            </div>

        </div>
       
    
</body>
</html>