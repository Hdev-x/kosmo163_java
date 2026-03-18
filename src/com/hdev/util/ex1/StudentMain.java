package com.hdev.util.ex1;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StudentService s = new StudentService();
//		StudentView sv = new StudentView();
//		StudentDTO [] dtos = s.init();
//		sv.view(dtos);
		
		StudentController sc = new StudentController();
		sc.start();

	}

}