package com.hdev.study.rpg;

import com.hdev.study.rpg.unit.Wizard;

public class RpgMain {

	public static void main(String[] args) {
		//메인메서드의 역할 :
		//프로그램을 실행
		//코드를 테스트
		//데이터타입 변수명 = new 클래스명();   =>   객체만드는코드
		
		Wizard w1 = new Wizard();
		w1.info();
		w1.staff.info();
	}

}
