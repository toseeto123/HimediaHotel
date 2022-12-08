	package com.hotel.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hotel.dao.hotelDAO;
import com.hotel.vo.hotelVO;

public class HotelMainPageForm implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String url=null;
		//id & 비밀번호 맞지않을경우 로그인되지않게 하기위한 명령어 추가구간 (파라미터값 id,pass,lev 가져오기는 생)
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
//		String lev=request.getParameter("lev");
	
		//싱글톤 객체 DAO객체 생성
		hotelDAO hdao=hotelDAO.getInstance();
		//DAO 객체 클래스의 userCheck 메소드 호출
//		int result=hdao.userCheck(id,pass,lev);
		int result=hdao.userCheck(id,pass);
		//아이디와 패스워드가 맞을경우 일반회원, 관리자 구분하여 페이지보내기 result2= 관리자 result=3 일반회
		if(result==2 ) {
			//VO에 담아서 회원정보보내기
		  hotelVO hvo=new hotelVO();
		  //DAO클래스에 id 정보를 가지고 회원정보가져올 getMember 사용
		  hvo=hdao.getMember(id); 
		  //세션 사용
		  HttpSession session=request.getSession();
		  session.setAttribute("loginUser", hvo);
		  session.setAttribute("result",result);
		  
		url="/hotel/hotelMainPage.jsp";
		}else {
			if(result==2) {
				url="hotel/hotelMainPage2.jsp";
			}
			if(result==1 || result== 0 || result== -1) { //레벨 불일치할때
				url="/hotel/hotelLogin.jsp";
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
	
}
