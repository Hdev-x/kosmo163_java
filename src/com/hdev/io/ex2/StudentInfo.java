package com.hdev.io.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.hdev.util.ex1.StudentDTO;

public class StudentInfo {

	public ArrayList<StudentDTO> init() {
		// info.txt의 내용을 출력
		File file = new File("/Users/han/H/sub1/sub2/info.txt");
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
				for(int i=0;i<ar.length;i++) {
				
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

}
