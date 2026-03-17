package com.hdev.util.ex1;

import java.util.Scanner;

public class StudentController {

	
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		
		
		
		
	
		
		boolean flag = true;
		StudentDTO [] ar = null;
		while(flag) {
			System.out.println("1.학생정보초기화, 2.학생정보출력, 3.학생정보검색, 4.종료");
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.println("학생정보초기화 완료");
				ar = ss.init();
			}else if (choice==2) {
				System.out.println("학생정보출력 완료");
				sv.view(ar);
			}else if (choice==3) {
				ss.search(ar);
			}else if (choice==4) {
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			}
		}
		
	}
	
}
