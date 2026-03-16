package com.hdev.study.rpg.unit;

import com.hdev.study.rpg.weapon.Staff;

public class Wizard extends Character{
	// 이름, 체력, 공격력, 경험치, 레벨
	
	Staff staff;
	
	
	
	public void a() {
		System.out.println(this.name);
	}
	
	// 오버라이딩 : 부모로부터 상속 받은 메서드의 내용을 재정의 하는 것
	// 메서드의 선언부는 부모와 동일해야함
	// 단, 접근지정자는 같거나 더 넓은 범위로 설정해야함
	public void attack() {
		System.out.println("마법 공격!");
	}
	
	@Override
	public void info() {
		super.info(); // 부모의 info() 메서드를 호출해서 출력
		
		System.out.println(staff);
	}
	
	
}