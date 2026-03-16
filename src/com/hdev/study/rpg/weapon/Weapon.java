package com.hdev.study.rpg.weapon;

public class Weapon implements Action{

	String name;
	int damage;
	int level;

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		this.t();
	}
	
	private void t() {
		System.out.println("공격");
	}
}
