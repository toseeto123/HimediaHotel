package com.hotel.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.hotelDAO;
import com.hotel.vo.hotelVO;

public class HotelLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/hotel/hotelLogin.jsp";
		
		hotelDAO hdao = hotelDAO.getInstance();
		
		List<hotelVO> guestList = hdao.selectAllGuest();
		List<hotelVO> boardList = hdao.selectAllBoard();

		request.setAttribute("elist", guestList);
		request.setAttribute("boardList", boardList);
		
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		
		
	}

}
