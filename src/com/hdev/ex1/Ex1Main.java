package com.hdev.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		
		
		
		Marine m1 = new Marine();
		
		m1.hp=50;
		m1.defence=20;
		m1.damage=5;
		m1.range=4;
		
		System.out.println(m1.hp);
		System.out.println("1.공격 2.이동");
		
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		
		if(select==1) {
			m1.attack();
			
		}else {
			m1.move();
		}
		
		
	}

}
