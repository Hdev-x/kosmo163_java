package com.hdev.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a1", 5);
		map.put("a2", 7);
		
		System.out.println(map.get("a2"));
		System.out.println(map.size());
		
		//반복문 사용
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			System.out.println("key : " +k);
			System.out.println(map.get(k));
		}

	}

}
