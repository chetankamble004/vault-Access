package com.model;

public class User {
	
	private int regId;
	private String name;
	private int age;
	private String email;
	private String username;
	private String password;
	
	public User(int regId,String name,int age,String email,String username,String password) {
		this. regId=regId;
		this. name = name;
		this.age = age;
		this. email = email;
		this.username = username;
		this. password = password;
	}

	public int getRegId() {
		return regId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}
