package com.hdev.lang;

public class StringMain2 {

	public static void main(String[] args) {
		String str = "Hello World";
		char ch = str.charAt(0);
		
		int idx = str.indexOf("l");
		System.out.println(idx);
		
		idx = str.lastIndexOf("l");
		System.out.println(idx);
		
		//1이 총 몇개 인지 구하자
		int count = 0;                          //indexOf는 찾는 문자열이 없으면 -1을 반환한다
		boolean flag = true;                    //flag는 while문이 계속 돌아야 하는지 여부를 판단하는 변수
		int index = -1;                         //index는 찾는 문자열이 있는 위치를 저장하는 변수
		while (flag) {                          //flag가 true인 동안 계속 반복한다
			index = str.indexOf("l", index+1);  //indexOf는 찾는 문자열이 있는 위치를 반환한다. index+1은 이전에 찾은 문자열의 다음 위치부터 검색을 시작한다
			if (index != -1) {                  //index가 -1이 아니면 찾는 문자열이 있다는 뜻이다
				count++;                        //count를 1 증가시킨다
			}else {                             //index가 -1이면 찾는 문자열이 없다는 뜻이다
				flag = false;                   //flag를 false로 설정하여 while문을 종료한다
				break;                          //break는 while문을 즉시 종료하는 명령어이다. flag를 false로 설정하여 while문이 더 이상 반복되지 않도록 하는 것과 같은 효과를 가진다
			} 
		} //while문이 종료된 후 count에는 찾는 문자열이 총 몇개 있는지가 저장되어 있다
		
		System.out.println(count);
		
		String st = "한화, 기아, 삼성, 롯데, 키움, SSG, 두산, LG, NC, KT";
		
		String [] teams = st.split(",");
		
		for(int i=0;i<teams.length;i++) {
			System.out.println(teams[i]);
		}
		
		System.out.println(teams[1].trim().equals("기아"));
		
		
	}

}
