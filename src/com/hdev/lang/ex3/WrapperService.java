package com.hdev.lang.ex3;

import java.util.Scanner;

public class WrapperService {

	public void juminCheck(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();

		data = data.replace("-", "").replace(" ", "");
		String[] num = data.split("");

	
		int total = 0;
		int weight = 2;
		int[] nums = new int[12];

		for (int i = 0; i < num.length - 1; i++) {
			nums[i] = Integer.parseInt(num[i]);

			total = total + nums[i] * (weight);

			weight++;
			if (weight > 9) {
				weight = 2;
			}
		}
		nums[12] = Integer.parseInt(num[12]);

		total = total%11;
		total = 11 - total;
		if(total>9) {
			total = total%10;
		}
		int check = Integer.parseInt(data.substring(data.length()-1));
		if (total==check) {
			System.out.println("올바른 번호다");
		}else {
			System.out.println("틀린번호다");
		}

		System.out.println(total);

	}

//	---------------------------------------------

	public void ageCount2(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		// 나이를 계산
		int year = 2026;
		int birthYear = 0;

		data = data.replace("-", "").replace(" ", "");

		if (data.length() >= 6) {
			String yyPart = data.substring(0, 2);
			int yy = Integer.parseInt(yyPart);

			if ((year - 2000) < yy) {
				birthYear = 1900 + yy;
			} else {
				birthYear = 2000 + yy;
			}

			int age = year - birthYear + 1;
			System.out.println(age + "세");

		} else {
			System.out.println("6자리 숫자로 입력해주세요.");
		}
	}

//	----------------------------------------------

	public void ageCount(Scanner sc) {
		System.out.println("생년월일을 입력 : xxxx-xx-xx");
		String data = sc.next();
		int year = 2026;
		// 대략적인 나이를 계산

		try {
//		1. 입력받은 문자열에서 -와 공백 제거하기
			data.replace("-", "").replace(" ", "");

//		[추가] 길이 검증 : 생년월일 8자리가 아니면 예외를 강제로 발생시킴
			if (data.length() != 8) {
				throw new Exception("입력 형식이 잘못되었습니다. 생년월일을 xxxx-xx-xx 형식으로 입력해주세요.");
			}

//		2. 연도 4자리 추출
//		사용자가 "950101"처럼 짧게 입력할 경우를 대비해 substring하기 전에 길이를 체크하는 것이 좋다
			String yearPart = data.substring(0, 4);

//		3. 문자열을 숫자로 변환하기(여기서 형식이 틀리면 NumberFormatException이 발생할 수 있다)
			int birthYear = Integer.parseInt(yearPart); // 문자열을 숫자로 변환

			if (birthYear > year || birthYear < 1900) { // 생년이 현재 연도보다 크거나 너무 과거인 경우 예외를 강제로 발생시킴
				throw new Exception("입력한 생년이 현재 연도보다 큽니다. 올바른 생년을 입력해주세요.");
			}

//		4. 나이 계산하기
			int age = year - birthYear + 1; // 한국 나이 계산법

//		5. 결과 출력하기
			System.out.println("당신의 나이는 : " + age);

		} catch (Exception e) {
			System.out.println("입력 형식이 잘못되었습니다. 생년월일을 xxxx-xx-xx 형식으로 입력해주세요.");
		}

	}

}
