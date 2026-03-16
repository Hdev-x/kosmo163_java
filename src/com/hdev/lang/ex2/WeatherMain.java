package com.hdev.lang.ex2;

public class WeatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherMaker wm = new WeatherMaker();
		WeatherDTO [] ar = wm.init();
		
		for(int i=0;i<ar.length;i++) {
			ar[i].toString();
		}
				

	}

}
