package com.hdev.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("/Users/han/H/study");
		
		boolean check = file.exists();
		check = file.isDirectory();
		System.out.println(check);
		
		file.mkdir();
		
		file = new File("/Users/han/H");
		
		String [] list = file.list();
		
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		
		file = new File(file, "study");
	
		file.delete();
		
//		file = new File("/Users/han/H","study2");
//		
//		list = file.list();
//
//		for(int i=0;i<list.length;i++) {
//			File f = new File(file, list[i]);
//			f.delete();
//		}
//		file.delete();
		
		file = new File("/Users/han/H/sub1/sub2");
		
		file.mkdirs();
	}
	

}
