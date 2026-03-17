package com.hdev.lang;

public class StringMain3 {

	public static void main(String[] args) {
		//참조변수 : 실제 데이터를 가리키는 주소가 들어가 있는 변수?
		//참조변수를 출력하면 내부에 있는 toString()메서드가 호출
		
		String n1 = "abc";
		String n2 = "abc";
		String n3 = new String("abc");
		String n4 = new String("abc");
		System.out.println(n1);
		System.out.println(n3);
		System.out.println(n1==n2);
		System.out.println(n3==n4);
		System.out.println(n1==n3);
		System.out.println(n1.equals(n4));
		
		//문자열은 불변성
//		n3 = n3+" : "+n4+"1"+"2"+"3";
		
		n3=n3.trim();
		System.out.println(n3);
		
		StringBuffer sb = new StringBuffer();
		sb.append("1");
		sb.append(2);
		
		System.out.println(sb);
	}

}
