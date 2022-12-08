package com.hotel.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.hotelDAO;

public class HotelRegisterIdCheckAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/hotel/HotelRegisterIdCheck.jsp";
		String id=request.getParameter("id");
		//DAO 싱글톤 객체생성
		hotelDAO hdao=hotelDAO.getInstance();
		// 아이디 중복확인 메소드
		int result=hdao.confirmID(id); // DAO에 confimID 생성해줘야함.
		//userid, result 출력 세팅
		request.setAttribute("id", id);
		request.setAttribute("result", result);
		//결과값 뿌리기
		RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		
	}
}
