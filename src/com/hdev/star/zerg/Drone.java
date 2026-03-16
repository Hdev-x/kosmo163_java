package com.hdev.star.zerg;

public class Drone {

	public int hp;
	protected int damage;
	private String color;
	String name;
	
	
	public void work() {
		System.out.println("드론이 일합니다.");
	}
	
	
	private void info() {
		System.out.println("드론의 hp는 " + hp);
		System.out.println("드론의 damage는 " + damage);
		System.out.println("드론의 color는 " + color);
		System.out.println("드론의 name은 " + name);
	}
	
	
}
