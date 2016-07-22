package com.weather.info.java;
/**
 * @author	Bekabil Tolassa
 * Date:	May 21, 2015
 * Class:	ICS 372
 * Program:	Assignment 1
 * Purpose:	This class Latitude is a subclass of an abstract class Position. 
 *			The data field is String. The purpose of this class is to represent
 *			a latitude of a position and stores string representation of a latitude.
 *			This class also illustrates the notion of toString() method.			
 */
public class Latitude extends Position {
/*
 	* northOrSouth is to store a latitude position.	
*/
	private String northOrSouth;
/**
 	* invokes super classe's constructor 
 	* initializes northOrSouth.
 	* @param degree, minute, and northOrSouth 	
*/	
	public Latitude(int degree, int minute, String northOrSouth) {
		super(degree, minute);
		this.northOrSouth = northOrSouth;
	}
/**
 	* overrides the toString() method of object 
 	* @param nothing
 	* @returns a string representation concatenating all elements.	
*/
	@Override
	public String toString() {
		return "WeatherInformation [latitude=Latitude: [degree=" + getDegree() 
				+ "," + " minute=" + getMinute() + " NorthOrSouth=" 
				+ northOrSouth + "],\n";
		
	}
	
}
