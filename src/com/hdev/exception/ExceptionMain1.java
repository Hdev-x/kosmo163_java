package com.hdev.exception;

public class ExceptionMain1 {

	public static void main(String[] args) {
		ExceptionEx e1 = new ExceptionEx();
		
//		e1.ex();
		
		int a = 10;
		int b = 2;
		try {
			int c = a/b;
			String str=null;
			
			str.charAt(0);
			System.out.println(args[0]);
			
			
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}finally {
			
		}
	
		System.out.println("종료합니다");
		
		
	}

}
