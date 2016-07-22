package com.weather.info.java;
/**
 * @author	Bekabil Tolassa
 * Date:	May 21, 2015
 * Class:	ICS 372
 * Program:	Assignment 1.
 * Purpose:	This is an interface WeatherRecord. 
 *			The purpose of this interface is to lay out a marker interface for a
 *			 WeatherInformation class and to store maximum and minimum temperatures.			
 */
public interface WeatherRecord {
/**
	* sets the maximum temperature
	* @param maxTemprature the new maximum temperature
*/
	public void setMaxTemperature(double maxTemperature);
/**
	* sets the minimum temperature
	* @param minTemprature the new minimum temperature
*/
	public void setMinTemperature(double minTemperature);
	
}
