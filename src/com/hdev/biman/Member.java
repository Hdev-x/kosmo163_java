package com.hdev.biman;

public class Member {
	//Singleton Pattern Design Pattern
	//싱글톤 패턴 : 하나의 클래스에서 단 하나의 객체만 생성할 수 있도록 하는 디자인 패턴
	private static Member member;
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public static Member getInstance() {
		if(member == null) {
			Member.member = new Member();
		}
		return Member.member;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
	
}
