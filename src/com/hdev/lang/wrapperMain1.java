package com.hdev.lang;

public class wrapperMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "123";
		Integer integer = new Integer(n); //dfrecated : 더 이상 사용되지 않는 메서드
		
		integer = Integer.valueOf(n);
		Long l = Long.valueOf(n);
		System.out.println(integer+1);
		
		//auto-boxing, auto-unboxing
		int num=3;
		integer = num; //auto-boxing : 기본형을 참조형으로 자동 변환
		num = integer; //auto-unboxing : 참조형을 기본형으로 자동 변환
		
		long number = 3L;
		integer = (int)number; //auto-unboxing이 일어나고, 그 결과를 int로 강제 형변환한다
//		num = l; //auto-unboxing이 일어나고, 그 결과를 int로 강제 형변환한다. 하지만 l은 long 타입이므로 int로 변환할 수 없다. 따라서 컴파일 에러가 발생한다
//		Parsing : 문자열을 숫자로 변환하는 과정
		num=integer.parseInt("123"); //static 메서드이므로 클래스 이름으로 호출한다. parseInt는 문자열을 int로 변환하는 메서드이다

		
	}

}
