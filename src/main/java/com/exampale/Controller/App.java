package com.exampale.Controller;

public class App {
	
	int id;
	String name;
	String userName;
	String Gmail;
	
	public App(int id, String name, String userName, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		Gmail = gmail;
	}
	public App() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGmail() {
		return Gmail;
	}
	public void setGmail(String gmail) {
		Gmail = gmail;
	}

}
