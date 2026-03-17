package com.hdev.util;

import java.util.StringTokenizer;

public class TokenMain1 {
	
	
	public void t2() {
		String str = "winter-20-iu-30-홍길동-520";
		
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a,b,c,d";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
		
		
	}

}
