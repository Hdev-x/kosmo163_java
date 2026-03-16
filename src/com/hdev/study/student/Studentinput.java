package com.hdev.study.student;

import java.util.Scanner;

public class Studentinput {

	public void input(Student st) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		st.name=sc.next();
		System.out.println("국어점수 입력");
		st.kor = sc.nextInt();
		System.out.println("영어점수 입력");
		st.eng = sc.nextInt();
		System.out.println("수학점수 입력");
		st.math = sc.nextInt();
		
	}
	
	
}
