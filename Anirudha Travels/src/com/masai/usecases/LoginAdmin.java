package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.exception.AdminException;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;
import com.masai.main.Admin;
import com.masai.main.AdminMenu;
import com.masai.main.Main;
import com.masai.model.Customer;

public class LoginAdmin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username:");
		String username = sc.next();
		
		System.out.println("Enter Password:");
		String password = sc.next();
		
		
		AdminDao adminDao = new AdminDaoImpl();
		
		try {
			String result = adminDao.loginAdmin(username, password);
			
			System.out.println(result);
			System.out.println("-----------------------------------------");
			System.out.println("");
			AdminMenu.main(args);
			
		} catch (AdminException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			System.out.println("");
			Admin.main(args);
		}
	
		sc.close();
	}

}
