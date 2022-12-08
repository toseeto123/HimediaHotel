<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/hotelMainPage.css">
<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/slick.css">
<link rel="stylesheet" type="text/css" href="css/board.css">
</head>
<body>
<header>
    <div class="innerbox">
        
            <div class="Logo">
                <input type="button" value="Hotel Himedia" onClick="location.href='HotelServlet?command=hotel_main_page_form'">               
            </div>


            <div>
               <input type="button" value="로그아웃" onClick="location.href='HotelServlet?command=login_page'">
            </div>
            <div>
                <input type="button" value="방문후기" onClick = "location.href='HotelServlet?command=visit_review'">
            </div> 
            <div>
                <input type="button" value="예약하기" onClick = "location.href='HotelServlet?command=reservation_form'">
            </div> 

    </div>
</header>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript" src="script/hotel.js"></script>
<script src="script/slick.min.js"></script>
<script type="text/javascript" src="script/hotelMainPage.js"></script>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
</html>