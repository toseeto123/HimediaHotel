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
		//id & ��й�ȣ ����������� �α��ε����ʰ� �ϱ����� ��ɾ� �߰����� (�Ķ���Ͱ� id,pass,lev ��������)
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
//		String lev=request.getParameter("lev");
	
		//�̱��� ��ü DAO��ü ����
		hotelDAO hdao=hotelDAO.getInstance();
		//DAO ��ü Ŭ������ userCheck �޼ҵ� ȣ��
//		int result=hdao.userCheck(id,pass,lev);
		int result=hdao.userCheck(id,pass);
		//���̵�� �н����尡 ������� �Ϲ�ȸ��, ������ �����Ͽ� ������������
		if(result==2 ) {
			//VO�� ��Ƽ� ȸ������������
		  hotelVO hvo=new hotelVO();
		  //DAOŬ������ id ������ ������ ȸ������������ getMember ���
		  hvo=hdao.getMember(id); 
		  //���� ���
		  HttpSession session=request.getSession();
		  session.setAttribute("loginUser", hvo);
		  session.setAttribute("result",result);
		  
		url="/hotel/hotelMainPage.jsp";
		}else {
			url="/hotel/hotelLogin.jsp";
			if(result==1) { //���� ����ġ�Ҷ�
				request.setAttribute("message", "�Է��Ͻ� ������ ����ġ�մϴ�");
			}else if(result==0) {//��й�ȣ�� ����ġ�Ұ��
				request.setAttribute("message", "�Է��Ͻ� ��й�ȣ�� ����ġ�մϴ�.");
			}else if(result==-1) {
				request.setAttribute("message", "���������ʴ� ���̵��Դϴ�.");
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
	
}
