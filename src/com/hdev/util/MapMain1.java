package com.hdev.util;

import java.util.HashMap;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a1", 5);
		map.put("a2", 7);
		
		System.out.println(map.get("a2"));
		System.out.println(map.size());
		
		

	}

}
