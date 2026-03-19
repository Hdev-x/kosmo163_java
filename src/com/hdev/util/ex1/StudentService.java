package com.hdev.util.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {

	private String data;
	private Scanner sc;

	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
		this.sc = new Scanner(System.in);
	}

	File file = new File("/Users/han/H/sub1/sub2/info.txt");

	public void backup(ArrayList<StudentDTO> ar) {
		// 학생들의 정보를 info.txt 저장하기
		System.out.println(file.exists()); // 파일이 존재하는지 확인

		try {
			FileWriter fw = new FileWriter(file, false);// true : 기존 파일에 이어쓰기, false : 기존 파일 덮어쓰기
			for (int i = 0; i < ar.size(); i++) {
				fw.write(ar.get(i).getName() + "-" 
						+ ar.get(i).getKor() + "-" 
						+ ar.get(i).getEng() + "-"
						+ ar.get(i).getMath() + "\n");
				fw.flush();// buffer를 강제로 비우기
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//--------------------------------------------------------------------	

	public ArrayList<StudentDTO> init() {
		// info.txt의 내용을 출력

		ArrayList<StudentDTO> list = new ArrayList<>();
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader br = new BufferedReader(filereader);
			String s = null;
			while ((s = br.readLine()) != null) {
				String[] ar = s.split("-");
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(ar[0]);
				studentDTO.setKor(Integer.parseInt(ar[1]));
				studentDTO.setKor(Integer.parseInt(ar[2]));
				studentDTO.setKor(Integer.parseInt(ar[3]));
				list.add(studentDTO);
				for (int i = 0; i < ar.length; i++) {

					System.out.println(ar[i]);

				}

//				System.out.println(s);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

//	-----------------------------------------------

	public ArrayList<StudentDTO> initold() {
		// data를 파싱 작업
		System.out.println("======================");
		StringTokenizer ss = new StringTokenizer(this.data, "-");
		ArrayList<StudentDTO> dtos = new ArrayList<>();
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

			dtos.add(dto);
//			System.out.println(dto.getName()+" 학생 데이터 저장 완료");
//			System.out.println("======================");
		}

		return dtos;

	}

//	==========================================================

	// 학생검색

	public StudentDTO search(ArrayList<StudentDTO> ar) {

		System.out.println("검색할 학생의 이름을 입력하세요 : ");
		String findname = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getName().equals(findname)) {
				System.out.println("-------------------");
				return ar.get(i);
			}
		}

		return null;

	}

//	==========================================================	

	// 학생정보추가
	// 이름, 국어, 영어, 수학 점수를 입력받아서 학생정보를 추가하는 메소드

	public void add(ArrayList<StudentDTO> stAdd) {
		// 1. [준비] 필요한 도구와 빈 객체(도시락 통) 생성

		StudentDTO student = new StudentDTO();

		// 2. [입력] 사용자로부터 데이터 수집
		System.out.println("--- 새로운 학생 정보 입력 ---");

		System.out.print("이름 : ");
		String addname = sc.next();

		System.out.print("국어 점수 : ");
		int addkor = sc.nextInt();

		System.out.print("영어 점수 : ");
		int addeng = sc.nextInt();

		System.out.print("수학 점수 : ");
		int addmath = sc.nextInt();

		// 3. [저장] 수집한 데이터를 객체에 담고 리스트에 추가
		student.setName(addname);
		student.setKor(addkor);
		student.setEng(addeng);
		student.setMath(addmath);

		stAdd.add(student); // 리스트(냉장고)에 최종 저장

		// 4. [확인] 사용자에게 결과 알림
		System.out.println("\n[알림] " + addname + " 학생의 정보가 저장되었습니다.");
		System.out.println("================================");
	}

//	==========================================================	

	// 학생의 이름을 입력해서 일치하는 학생의 정보를 삭제
	// delete

	public void delete(ArrayList<StudentDTO> ar) {
		System.out.println("학생의 이름 입력");
		String name = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getName().equals(name)) {
				ar.remove(i);
				return;
			}
		}

	}

}
