package com.hdev.daiso;

public class Customer {
	
	int money;
	int point;
	
	
		//자기가 가진 돈에서 제품 불특청 여러개의 가격을 빼고,
		//자기가 가진 포인트에서 제품 불특청 여러개의 포인트를 더한다.
	public void buy(Electronics[] electronics) {
		for(int i=0; i<electronics.length; i++) {
			this.money = this.money-electronics[i].price;
			this.point = this.point+electronics[i].Point;
			//구매 후 잔액과 포인트를 출력
			System.out.println("잔액 : "+this.money);
			System.out.println("포인트 : "+this.point);
		}
	
		
	}
	
	//매개변수를 하나만 선언
	public void buy(Electronics electronics) {
		//자기가 가진 돈에서 제품의 가격을 빼고,
		//자기가 가진 포인트에서 제품의 포인트를 더한다.
		this.money = this.money-electronics.price;
		this.point = this.point+electronics.Point;
		//구매 후 잔액과 포인트를 출력
		System.out.println("잔액 : "+this.money);
		System.out.println("포인트 : "+this.point);
	}

}
