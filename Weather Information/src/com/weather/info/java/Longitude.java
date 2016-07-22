package com.weather.info.java;
/**
 * @author	Bekabil Tolassa
 * Date:	May 21, 2015
 * Class:	ICS 372
 * Program:	Assignment 1
 * Purpose:	This class Longitude is a subclass of an abstract class Position. 
 *			The data field is String. The purpose of this class is to represent
 *			a Longitude of a position and stores string representation of a Longitude.
 *			This class also illustrates the notion of toString() method.			
 */
public class Longitude extends Position{
	private String eastOrWest;
/**
 	* invokes super classe's constructor 
 	* initializes eastOrWest.
 	* @param degree, minute, and eastOrWest 	
*/		
	public Longitude(int degree, int minute, String eastOrWest) {
		super(degree, minute);
		this.eastOrWest = eastOrWest;
		
	}
/**
 	* overrides the toString() method of object 
 	* @param nothing
 	* @returns a string representation concatenating all elements.	
*/	
	@Override
	public String toString() {
		return "[longitude=Longitude: [degree=" + getDegree() + ", " + "minute="
				+ getMinute() + " EastOrWest=" + eastOrWest + "],";
		
	}

}
