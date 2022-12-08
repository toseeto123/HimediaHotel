package com.hotel.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.hotelDAO;
import com.hotel.vo.hotelVO;

public class HotelRegisterSuccessForm implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hotelVO hvo = new hotelVO();
		
		hvo.setName(request.getParameter("name"));
		hvo.setId(request.getParameter("id"));
		hvo.setPass(request.getParameter("pass"));
		hvo.setEmail(request.getParameter("email"));
		
	
		hotelDAO hdao = hotelDAO.getInstance();
		hdao.loginHotel(hvo);
		
		new HotelLoginAction().execute(request, response);
		System.out.println("¼º°ø");
		
	}

}
