package com.hdev.study.student;

import java.util.Scanner;

public class Studentcontroller {

	
	//start
	public void start(Student st, boolean check) {
		
		while(check=true) {
			System.out.println("1.학생정보입력\t 2.학생정보출력\t 3.프로그종료");
			Scanner sc2 = new Scanner(System.in);
			int select = sc2.nextInt();
			if(select==1) {
				//1.학생정보입력
				Studentinput si = new Studentinput();
				si.input(st);
				//  학생정보입력 후 총점과 평균이 계산
				StudentJumsu sj = new StudentJumsu();
				sj.t(st);
			}else if(select==2){
				//2.학생정보출력
				StudentView sv = new StudentView();
				sv.view(st);
			}else if(select==3){
				//3.프로그램종료
				System.out.println("프로그램종료");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
	
}
