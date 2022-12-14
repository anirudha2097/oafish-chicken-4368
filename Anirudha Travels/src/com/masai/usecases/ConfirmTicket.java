package com.masai.usecases;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.BusException;
import com.masai.main.AdminMenu;
import com.masai.model.Customer;

public class ConfirmTicket {

	public static void main(String[] args) {
		
		AdminDao adminDao = new AdminDaoImpl();
		
		try {
			Customer cust = adminDao.confirmTicket();
			System.out.println("");
			System.out.println("Customer Contact Details");
			System.out.println("Name: "+cust.getName());
			System.out.println("Email: "+cust.getEmail());
			System.out.println("Phone No.: "+cust.getPhone());
			System.out.println("-----------------------------------------");
			System.out.println("");
			AdminMenu.main(args);
		} catch (BusException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			System.out.println("");
			AdminMenu.main(args);
		}

		
	}

}
