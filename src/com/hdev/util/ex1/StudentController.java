package com.hdev.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	/**
	 * 
	 */
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();

		boolean flag = true;
		ArrayList<StudentDTO> ar = null;
		while (flag) {
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.학생정보추가");
			System.out.println("5.종료");
			System.out.println("======================");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("학생정보초기화 완료");
				ar = ss.init();
			} else if (choice == 2) {
				System.out.println("학생정보출력 완료");
				System.out.println("-------------------");
				sv.view(ar);
				System.out.println("======================");
			} else if (choice == 3) {
				StudentDTO studentDTO = ss.search(ar);
				if (studentDTO != null) {
					sv.view(studentDTO);
					System.out.println("======================");
				} else {
					System.out.println("찾는 학생의 정보가 없습니다.");
					System.out.println("======================");
				}
			} else if (choice == 4) {
				ss.add(ar);
			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			}
		}

	}

}
