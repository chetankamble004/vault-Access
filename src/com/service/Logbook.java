package com.service;

import java.security.SecureRandom;
import java.util.Scanner;
import com.model.User;

public class Logbook{
	
	Scanner s=new Scanner(System.in);
	
	public User register(){
		
		System.out.print("Enter registration id : ");
		int id=s.nextInt();
		System.out.print("Enter name : ");
		String str=s.next()+s.nextLine();
		System.out.print("Enter age : ");
		int age=s.nextInt();
		System.out.print("Enter Email : ");
		String eml=s.next()+s.nextLine();
		
		String nm="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				nm=nm+'_';
			}else {
				nm+=str.charAt(i);
			}
		}
		String uname=nm+"@LogBook";
		String pass=Logbook.passGen();
		User u1=new User(id,nm,age,eml,uname,pass);
		return u1;
	}
	public void login(User user){
		System.out.print("Enter Username: ");
		String inputUsername = s.nextLine();
		if (inputUsername.equals(user.getUsername())){
			System.out.print("Enter password: ");
			String inputPassword = s.nextLine();
			if (inputPassword.equals(user.getPassword())){
				System.out.println("\nLogin successfully...");
                System.out.println("\nYour inforamtion:");
                System.out.println("Id: "+user.getRegId());
                System.out.println("Name: "+user.getName());
                System.out.println("Mail Id: "+user.getEmail());
                System.out.println("Age: "+user.getAge());
			}else{
				System.out.println("\nPassword incorrect...!!!\nPlease try again...");
	        }
		}else{
	            System.out.println("\nUsername incorrect...!!!\nPlease try again...");
			}
		}
	
	public void logout(){
		System.out.println("\nLogged out successfully...!!!");
		System.exit(0);
	}
	public static String passGen(){
		SecureRandom sr=new SecureRandom();
		
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String uppercase = lowercase.toUpperCase();
		String splChar = "<>/?:/*-+~@#$%^&*()-_=";
		String nm = "0123456789";
		String allChar = lowercase+uppercase+splChar+nm;
		StringBuffer sb = new StringBuffer(8);
		
		for(int i=0;i<8;i++){
			sb.append(allChar.charAt(sr.nextInt(allChar.length())));
		}
		String res=sb.toString();
		return res;
	}
}
