package com.hdev.util.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetEx1 {

	public static void main(String[] args) {
		Random random = new Random();

		HashSet<Integer> set = new HashSet<>();

		while (set.size() < 6) {
			int n = random.nextInt(45) + 1;
			set.add(n);
		}
		
		
		Iterator<Integer> it = set.iterator();
	
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		System.out.println(set);

	}

}
