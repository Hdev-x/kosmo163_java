package com.hdev.mod;

public class Phone {
	
	public static String company;
	String name;
	int price;
	static{
		Phone.company = "삼성전자";
	}
	
	
	public void call() {
		System.out.println(Phone.company);
		System.out.println(this.name);
		
	}
	
	
	public static void info() {
		System.out.println(Phone.company);
		System.out.println(this.name);
		this.call();
		
	}
	

}
