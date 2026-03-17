package com.hdev.lang.ex3;

import java.util.Scanner;

public class A_WrapperService {
	
	
	public void A_juminCheck2(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		
		for(int i=0;i<data.length()-1;i++) {
			char ch = data.charAt(i);
			Integer.parseInt(String.valueOf(ch));
			// char형을 String형으로 변환하여 Integer.parseInt() 메서드에 전달
			Integer.parseInt(ch+""); 
			// char형을 String형으로 변환하여 Integer.parseInt() 메서드에 전달
		}
		
		
		
	}
	
//	------------------------------------------------------
	

	public void A_juminCheck(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		int num = 2;
		int sum = 0;
		for(int i=0;i<data.length()-1;i++) {
//			String s = data.substring(i,i+1);
//			if(i==6 ) {
//				continue;
//			}
			String s = data.substring(i, i+1);
			if(s.equals("-")) {
				continue;
			}
			int c = Integer.parseInt(s);
			sum = sum+c*num;
			num++;
			if(num==10) {
				num=2;
			}
			
		}//for 끝
		
		
		sum = sum%11;
		sum = 11 - sum;
		if(sum>9) {
			sum = sum%10;
		}
		int check = Integer.parseInt(data.substring(data.length()-1));
		if (sum==check) {
			System.out.println("올바른 번호다");
		}else {
			System.out.println("틀린번호다");
		}
	}

//	----------------------------------------------

	public void ageCountA2(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		// 나이를 계산
		int year = 2026;
		int birthYear = 0;

		System.out.println(data);
		int n = Integer.parseInt(data.substring(0, 2));
		System.out.println(n);
		int c = Integer.parseInt(data.substring(7, 8));
		System.out.println(c);
		if (c < 3) {
			n = 1900 + n;
		} else {
			n = 2000 + n;
		}

		year = year - n;

		System.out.println(year);
	}

//	----------------------------------------------	

	public void ageCountA1(Scanner sc) {
		System.out.println("생년월일을 입력 : xxxx-xx-xx");
		String data = sc.next();

		int year = 2026;

//	1. subString : 문자열에서 특정 위치의 문자열을 추출하는 메서드

		String r = data.substring(0, 4);
		// 0번 인덱스부터 4번 인덱스 전까지의 문자열을 추출

		System.out.println(r);
		// r : 0번 인덱스부터 4번 인덱스 전까지의 문자열을 가져옴

//	2. split : 특정 구분자로 문자열을 나누어서 배열로 만들어주는 메서드

		String[] ar = data.split("-");
		// "-"를 기준으로 문자열을 나누어서 배열로 만들어줌

		System.out.println(ar[0]);
		// ar[0] : 0번 인덱스에 있는 문자열을 가져옴

//	3. parseInt : 문자열을 정수로 변환하는 메서드

		int y = Integer.parseInt(ar[0]);
		// ar[0] : 0번 인덱스에 있는 문자열을 가져와서 정수로 변환

		year = year - y + 1;

		System.out.println(year);
	}

}
