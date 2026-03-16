package com.hdev.study.student;

public class StudentView {

	
	//view
	//학생의 정보를 출력
	//이름, 국어, 영어, 수학, 총점, 평
	public void view(Student st) {
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(st.name+"\t"); // println -> ln = 입력이 끝난 다음에 엔터치고 내려가라.
		System.out.print(st.kor+"\t");	
		System.out.print(st.eng+"\t");
		System.out.print(st.math+"\t");
		System.out.print(st.total+"\t");
		System.out.println(st.avg);
	}
	
}
