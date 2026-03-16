package com.hdev.study.student;

public class Student {
	
	//학생의 데이터를 담는 곳
	
	//변수(instance 변수, 멤버변수, field)
	//접근지정자 [그외지정자] 데이터타입 변수멍
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	//메서드 (instance 메서드, 멤버메서드)
	//public static void main(String [] args){}
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){}
	public void info() {
		System.out.println("info");
	}
	
	public void print() {
		System.out.println("print");
	}
	

}
