package com.hdev.study.rpg.unit;

//추상 클래스 : 객체를 생성할 수 없는 클래스, 상속을 목적으로 하는 클래스
public abstract class Character {
	
	
	// 이름, 체력, 공격력, 경험치, 레벨
	String name;
	int damage;
	int hp;
	int mp;
	int gold = 0;
	int level;
	
	
	// 추상 메소드 : 구현부가 없는 메소드, 상속받은 클래스에서 반드시 구현해야 하는 메소드
	public abstract void attack(); 
	
	public void info() {
		System.out.println(this);
		System.out.println("이름 : "+name);
		System.out.println("체력 : "+hp);
		System.out.println("마나 : "+mp);
		System.out.println("공격력 : "+damage);
		System.out.println("경험치 : "+gold);
		System.out.println("레벨 : "+level);
	}

}
