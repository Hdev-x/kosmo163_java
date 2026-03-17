package com.hdev.lang.ex2;

public class WeatherDTO {

	private String cityName;
	private int temperature;
	private double humidity;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

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
