package com.hdev.study.rpg.unit;

import com.hdev.study.rpg.Monster;
import com.hdev.study.rpg.weapon.Weapon;

public class Warrior extends Character {
	
	public Weapon weapon;
	
	@Override
	public void attack() {
		System.out.println("검 공격!");		
	}
	
	
}
