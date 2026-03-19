package com.hdev.io.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		// 키보드로부터 입력받은 메세지
		// sub2\msg.txt 파일에 저장
		// 입력시 exit를 입력하면 쓰지않고 프로그램이 종료
		
		Scanner sc = new Scanner(System.in);
		String exit = "exit";
		File file = new File("/Users/han/H/sub1/sub2/msg.txt");
		boolean check = true;
		
		while(check) {
			System.out.println("입력");
		String masage = sc.next();
		
		if(masage.equalsIgnoreCase("EXIT")) {
			break;
		}
			try {
				FileWriter fw = new FileWriter(file, true);
				fw.write(masage+"\n");
				fw.flush(); //buffer를 강제로 비우기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("종료");

	}

}
