package com.hdev.exception;

public class ExceptionEx {

	public void ex2() throws Exception {
		String s = "";
		String s2 = "def";
		String s3 = s+s2;
		if(s3.isEmpty()) {
			throw new Exception();
		}
		System.out.println(s3);
		
	}
	
	public void ex() throws ArithmeticException, Exception{
		int a = 10;
		int b = 0;
		int c = a/b;
		
	}
	
	
}
