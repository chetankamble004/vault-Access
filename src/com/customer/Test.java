package com.customer;

import java.util.Scanner;
import com.model.User;
import com.service.Logbook;

public class Test {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		
		Logbook lb=new Logbook();
		User u=null;
		while(true) {
			System.out.println("\n~~~~~~~~~~~~~~ Welcome to Vault Access ~~~~~~~~~~~~~~");
			System.out.println("1.Registration\n2.Login\n3.Logout");
			System.out.println("Enter choice : ");
			int ch=s.nextInt();
			switch(ch) {
			case 1:
				u=lb.register();
				System.out.println("\nRegistration completed...");
				System.out.println("\nUsername : "+u.getUsername());
				System.out.println("Password : "+u.getPassword());
				System.out.println("\nYou are login now.....!!!!");
				break;
			case 2:
				lb.login(u);
				break;
			case 3:
				lb.logout();
				break;
			default : 
				System.out.println("\nWrong choice...!!!\nPlease enter valid choice...");
			}
		}
	}
}