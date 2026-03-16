package com.hdev.mod;

public class PhoneMain {
	
	

	public static void main(String[] args) {
		//Phone p1 = new Phone();
		Phone p1 = new Phone();
		Phone.company = "삼성전자";
		Phone.info();
		
//		p1.price = 1000000;
		System.out.println();
		
		
		Phone p2 = new Phone();
		p2.company = "애플";
		p2.price = 2000000;
		

	}

}
