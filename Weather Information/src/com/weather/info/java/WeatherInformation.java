package com.weather.info.java;
/**
 * @author	Bekabil Tolassa
 * Date:	May 21, 2015
 * Class:	ICS 372
 * Program:	Assignment 1.
 * Purpose:	This class WeatherInformation implements WeatherRecord interface. 
 *			The data fields are double, Latitude, and Longitude. 
 *			The purpose of this class is to implement methods in WeatherRecord
 *			 interface and to store the maximum and minimum temperature of  
 *		     a point on the earth.	
 *			This class also illustrates the notion of the toString() method.			
 */
public class WeatherInformation implements WeatherRecord {
/*
 	* latitude is to store latitude of a position.
 	* longitude is to store longitude of a position.
 	* minTemperature is to store minimum temperature of a point on earth.
 	* maxTemperature is to store maximum temperature of a point on earth. 	
 */	
	private Latitude latitude;
	private Longitude longitude;
	private double minTemperature;
	private double maxTemperature;
/** 
 	* initializes latitude, Longitude, minTemperature, and maxTemperature.
 	* @param latitude, Longitude, minTemperature, and maxTemperature 	
*/	
	public WeatherInformation(Latitude latitude, Longitude longitude, 
		double minTemperature, double maxTemperature) {
		
		//data fields of this object are set to new value.
		this.latitude = latitude;
		this.longitude = longitude;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
	}
/**
 * sets the maximum temperature of this object
 * @param maxTemprature the new maximum temperature
 * @return nothing
*/
	@Override
	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
/**
 * sets the minimum temperature of this object
 * @param minTemprature the new minimum temperature
 * @return nothing
*/
	@Override
	public void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}
/**
	* overrides the toString() method of object 
	* @param nothing
	* @returns a string representation concatenating all elements.	
*/
	@Override
	public String toString() {
		return "WeatherInformation ["+ latitude.toString() + longitude.toString() 
			+ "\n"+ "maxTemperature=" + maxTemperature + ", minTemperature=" 
			+ minTemperature + "]"; 
	}

}