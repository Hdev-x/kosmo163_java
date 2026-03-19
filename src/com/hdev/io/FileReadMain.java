package com.hdev.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadMain {

	public static void main(String[] args) {
		
		File file = new File("/Users/han/H/sub1/sub2/msg.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
			String s = br.readLine();
			if(s==null) {
				break;
			}
			
			System.out.println(s);
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
