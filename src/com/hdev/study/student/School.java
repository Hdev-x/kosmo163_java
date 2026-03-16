package com.hdev.study.student;

public class School {

	public static void main(String[] args) {
//		TestJumsu tj = new TestJumsu();
//		StudentView sv = new StudentView();
//		Studentinput si = new Studentinput();
//		Student st = new Student();
//		
//		
//		si.input(st);
//		tj.t(st); //총점과 평균을 내는 메서드
//		sv.view(st); //출력용 메서드
		
		
		//StudentController start 메서드호출
		Student st = new Student();
		Studentcontroller sctr = new Studentcontroller();
		sctr.start(st, false);
		
	}

}
