package com.hdev.study.rpg.weapon;

public interface Action {
	
	// 인터페이스는 추상메소드만 가질 수 있다.
	// 인터페이스는 객체를 생성할 수 없다.
	// 인터페이스는 다중 상속이 가능하다.
	
//	public final int NUM=1;
	// 인터페이스의 멤버변수는 public static final이 생략되어 있다.
	 int NUM=1; 
	// public static final이 생략되어 있다.
//	public abstract void attack();
	// 인터페이스의 메소드는 public abstract가 생략되어 있다.
	void attack(); 
	// public abstract가 생략되어 있다.
	

}
