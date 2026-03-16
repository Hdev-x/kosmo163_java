package com.hdev.daiso;

public class DaisoMain {

	public static void main(String[] args) {
		
		
		Keyboard k1 = new Keyboard();
		Mouse m1 = new Mouse();
		Notebook n1 = new Notebook();
		Tv t1 = new Tv();
		
		Electronics[] electronics = {k1,m1};
		
		Customer customer = new Customer();
		customer.money=10000000;
		customer.point=100;
		
		customer.buy(electronics);
		
		
		

	}

}
