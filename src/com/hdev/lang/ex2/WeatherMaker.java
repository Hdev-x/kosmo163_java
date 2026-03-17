package com.hdev.lang.ex2;

public class WeatherMaker {
	
	private String info;
	
	public WeatherMaker() {    //(기본)생성자
		this.info = "서울/12/25.2/대전/3/65.2/대구/56/85.9";
	}

	public WeatherDTO [] init() {
		//info데이터를 파싱해서 결과물을 리턴
		String [] ar = this.info.split("/");
		WeatherDTO [] weathers = new WeatherDTO[3];
		
		for(int i=0;i<ar.length;i++) {
//			WeatherDTO w = new WeatherDTO();
//			w.setCityName(ar[i]);
//			weathers[i]=w;
			
			weathers[i] = new WeatherDTO();
			weathers[i].setCityName(ar[i]);
		}
		
		return weathers;
		
	}
	
}
