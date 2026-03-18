package com.hdev.util;

import java.util.ArrayList;
import java.util.List;

public class ListMain1 {

	public static void main(String[] args) {
		//ArrayList 객체 생성
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		
		
		list.add(1, 0); // 1번 인덱스에 0을 추가(삽입)
		
		list.set(0, 100); // 0번 인덱스의 값을 100으로 변경(수정)
		
//		list.remove(1);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.clear();
		
		System.out.println(list.size());

	}

}
