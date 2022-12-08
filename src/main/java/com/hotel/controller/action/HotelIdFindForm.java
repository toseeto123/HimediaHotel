package com.hotel.controller.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hotel.dao.hotelDAO;
import com.hotel.vo.hotelVO;

public class HotelIdFindForm implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		String url = "hotel/hotelIDFindResult.jsp";
		
		PrintWriter out = response.getWriter();
			
		hotelVO hvo = new hotelVO();
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		System.out.println("idã��");
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(pass);
		
		hotelDAO dao = hotelDAO.getInstance();
		dao.idFind(name, email, id, pass);
		
//		hvo = dao.idFind(name, email, id, pass);
//		new HotelIdPWAction().execute(request, response);
		
//		hvo = dao.idFind(name, email); // ���̵� ã�� �޼���
						
		if(hvo != null) {
		    out.println("<script>alert('"+name+"���� ���̵�� "+hvo.getId()+"�Դϴ�.')</script>");	          
		}
//		else {
//		    out.println("<script>alert('���̵� �������� �ʽ��ϴ�.');"
//		            + "location.href='HotelServlet?command=hotel_id/pw_form'</script>");
//		}

		
	}
}

		
		

