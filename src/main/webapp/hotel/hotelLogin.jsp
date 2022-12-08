<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<link rel="stylesheet" type="text/css" href="css/hotelLogin.css">
<link rel="stylesheet" type="text/css" href="css/reset.css">
<script type="text/javascript" src="script/hotel.js"></script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 로그인 페이지 -->


 <section class="container">

        <div class="visual_slider">

            <div class="item item1">
                <img src="images/travel1.jpg" alt="">
            </div>
            <div class="login_form">
                <div class="top_box">
                    <h2>Log In</h2>
                </div>
               
                <div class="middle_box">
                <form action="HotelServlet" name="frm" method="post">
                <input type="hidden" name="command" value="hotel_main_page_form">
                   
                        <input type="text" placeholder="아이디" name="id">
                        <input type="password" placeholder="비밀번호" name="pass">
                        <input type=submit value="로그인" 
                        onclick = "return hotelCheck()">
                        
                </form>
                </div>
                <div class="bottom_box">
                   
                    <input type="submit" value="회원가입" onClick="location.href='HotelServlet?command=hotel_register_form'">
                  	<input type="submit" value="아이디/비밀번호 찾기" onClick = "location.href='HotelServlet?command=hotel_id/pw_form'">
                   		 
                 
                </div>

            </div>

        </div>
        
       </section>
       
    


</body>
</html>