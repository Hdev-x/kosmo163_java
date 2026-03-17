package com.hdev.util.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {

	private String data;

	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
	}

	public StudentDTO[] init() {
		// data를 파싱 작업
		System.out.println("======================");
		StringTokenizer ss = new StringTokenizer(this.data, "-");
		StudentDTO[] dtos = new StudentDTO[3];
		int index = 0;

		while (ss.hasMoreTokens()) {
			StudentDTO dto = new StudentDTO();
			String s1 = ss.nextToken();
			String s2 = ss.nextToken();
			String s3 = ss.nextToken();
			String s4 = ss.nextToken();
			dto.setName(s1);
			dto.setKor(Integer.parseInt(s2));
			dto.setEng(Integer.parseInt(s3));
			dto.setMath(Integer.parseInt(s4));
			dtos[index] = dto;
			index++;
//			System.out.println(dto.getName()+" 학생 데이터 저장 완료");
//			System.out.println("======================");
		}

		return dtos;

	}

//	==========================================================

	// 학생검색

	public void search(StudentDTO[] dtos, StudentView sv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생의 이름을 입력하세요 : ");
		String findname = sc.next();

		StudentDTO result = null;

		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i].getName().equals(findname)) {
				result = dtos[i];
				break;
			}
		}
		if (result != null) {
			System.out.println(result.getName() + " 학생을 찾았습니다.");
		} else {
			System.out.println("해당 학생은 존재하지 않습니다.");
		}

	}
}
