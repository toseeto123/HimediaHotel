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

</head>


<!-- 메인 페이지 -->


<body>   

<body>
   

<jsp:include page="header.jsp"/>

<div class="container">

<div class="slider">
	
    <div class="item item1">
        <img src="images/main1.jpg" alt="">
    </div>
    <div class="item item2">
        <img src="images/main2.jpg" alt="">
    </div>
    <div class="item item3">
        <img src="images/main3.jpg" alt="">
    </div>
   
</div>

</div>


<jsp:include page="footer.jsp"/>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript" src="script/hotel.js"></script>
<script src="script/slick.min.js"></script>
<script type="text/javascript" src="script/hotelMainPage.js"></script>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
</body>

</html>
