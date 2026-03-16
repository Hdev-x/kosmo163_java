package com.hdev.study.rpg;

import com.hdev.study.rpg.weapon.Staff;

public class Monster {

	//몬스터의 데이터를 담고 있는 객체
	
	//이름, 레벨, 체력, 방어력, 공격력, 속성
	String monsterName;
	int monsterLevel;
	int monsterHp;
	int monsterDefence;
	int monsterDamage;
	Staff staff;
	Sword sword;
	int gold=20;
	
	public Monster() {
		this.monsterName="슬라임";
	}
	
	
	public int check() {
		//hp가 0 이하인지 체크하려는 메서드
		if(this.monsterHp<=0) {
			System.out.println("꾸엑");
		}
		
		return gold;
	}
	
	public void t() {
		//-----
		return; //void로 시작을 해도 return 뒤에 아무것도 적지 않으면 즉시 종료
	}
	
	
	public void info() {
		System.out.println("이름 : "+this.monsterName);
		System.out.println("레벨 : "+this.monsterLevel);
		System.out.println("HP : "+this.monsterHp);
	}
	
}
