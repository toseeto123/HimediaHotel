package com.hotel.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.hotelDAO;
import com.hotel.vo.hotelVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		hotelVO hvo = new hotelVO();

		hvo.setName(request.getParameter("name"));
		hvo.setPass(request.getParameter("pass"));
		hvo.setEmail(request.getParameter("email"));
		hvo.setTitle(request.getParameter("title"));
		hvo.setContent(request.getParameter("content"));
		hvo.setStarpoint(request.getParameter("starpoint"));

		hotelDAO dao = hotelDAO.getInstance();
		dao.insertBoard(hvo);

		new HotelVisitReviewForm().execute(request, response);
	}

}
