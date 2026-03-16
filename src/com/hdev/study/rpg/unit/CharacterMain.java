package com.hdev.study.rpg.unit;

import com.hdev.study.rpg.weapon.Weapon;
import com.hdev.study.rpg.weapon.Sword;
import com.hdev.study.rpg.weapon.Staff;
import com.hdev.study.rpg.weapon.Action;

public class CharacterMain {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.name = "메르세데스";
		Warrior w2 = new Warrior();
		
		//다형성 : 하나의 객체가 여러 가지 형태를 가질 수 있는 성질
		
	
		Character c1 = w1; 
		// 부모 타입으로 자식 객체를 참조할 수 있다. (업캐스팅)
		System.out.println(c1.name);
//		System.out.println(c1.sword); 
		// 모든 캐릭터가 sword를 가지고 있는 것은 아니기 때문에 null이 출력됨
		Warrior w3 = (Warrior)c1; 
		// 자식 타입으로 부모 객체를 참조하려면 명시적으로 형변환을 해야한다. (다운캐스팅)
		w3.weapon = new Sword(); 
		w3.weapon = new Staff();
		
		Action a = new Sword();
		 

	}

}
