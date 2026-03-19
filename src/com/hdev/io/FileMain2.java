package com.hdev.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		String name = "suji";
		File file = new File("/Users/han/H/sub1/sub2/info.txt");
		System.out.println(file.exists());
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(name+"\n");
			fw.flush(); //buffer를 강제로 비우기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료");

	}

}
