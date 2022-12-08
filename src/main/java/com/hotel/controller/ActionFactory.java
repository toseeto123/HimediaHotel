package com.hotel.controller;



import com.hotel.controller.action.Action;
import com.hotel.controller.action.BoardDeleteAction;
import com.hotel.controller.action.BoardUpdateAction;
import com.hotel.controller.action.BoardUpdateFormAction;
import com.hotel.controller.action.BoardViewAction;
import com.hotel.controller.action.BoardWriteAction;
import com.hotel.controller.action.BoardWriteFormAction;
import com.hotel.controller.action.HotelIdFindForm;
import com.hotel.controller.action.HotelIdPWAction;
import com.hotel.controller.action.HotelLoginAction;
import com.hotel.controller.action.HotelMainPageForm;
import com.hotel.controller.action.HotelRegisterAction;
import com.hotel.controller.action.HotelRegisterIdCheckAction;
import com.hotel.controller.action.HotelRegisterSuccessForm;
import com.hotel.controller.action.HotelReservationForm;
import com.hotel.controller.action.HotelVisitReviewForm;

public class ActionFactory {

	private ActionFactory() {
		super();

	}

	// ΩÃ±€≈Ê

	private static ActionFactory instance = new ActionFactory();

	public static ActionFactory getInstance() {
		return instance;

	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println(command);
		if (command.equals("login_page")) {
			action = new HotelLoginAction();
		} else if (command.equals("hotel_register_form")) {
			action = new HotelRegisterAction();
		} else if (command.equals("hotel_register")) {
			action = new HotelRegisterSuccessForm();
		} else if (command.equals("hotel_id/pw_form")) {
			action = new HotelIdPWAction();
		} else if (command.equals("hotel_main_page_form")) {
			action = new HotelMainPageForm();
		} else if (command.equals("hotel_id_check_form")) {
			action = new HotelRegisterIdCheckAction();
		}else if (command.equals("visit_review")) {
			action = new HotelVisitReviewForm();
		} else if (command.equals("reservation_form")) {
			action = new HotelReservationForm();
		} else if (command.equals("id_find_form")) {
			action = new HotelIdFindForm();
		} else if (command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		} else if (command.equals("board_write")) {
			action = new BoardWriteAction();
		} else if (command.equals("board_view")) {
			action = new BoardViewAction();
		} else if (command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		} else if (command.equals("board_update")) {
			action = new BoardUpdateAction();
		} else if(command.equals("board_delete_form")) {
			action = new BoardDeleteAction();
		}

		return action;

	}

}
