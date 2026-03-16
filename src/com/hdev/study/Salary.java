package com.hdev.study;

public class Salary {

	
	
	public void test(int [] nums) {
		nums = new int[2];
		nums[0] = 9;
	}
	
	// 급여계산
	// 의료0.03, 고용0.02, 국민0.01, 산재0.01
	// 원천징수0.033
	// make

	public void make(int s, boolean check) {
		System.out.println("급여 계산");

		if (check) {
			double t1 = s * 0.03;
			double t2 = s * 0.02;
			double t3 = s * 0.01;
			double t4 = s * 0.01;
			double total = s - t1 - t2 - t3 - t4;
			System.out.println("실급여 : " + total);
		} else {
			double total = s - s * 0.033;
			System.out.println("실급여 : " + total);
		}
			
		s=0;
		
	}

}
