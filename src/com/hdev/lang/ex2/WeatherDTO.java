package com.hdev.lang.ex2;

public class WeatherDTO {

	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(this.getCityName());
		return "";
		
		
	}
}
