package com.weather.info.java;
/**
 * @author	Bekabil Tolassa
 * Date:	May 21, 2015
 * Class:	ICS 372
 * Program:	Assignment 1
 * Purpose:	This class Position is an abstract class. 
 *			The data fields are integers. The purpose of this class is
 *			to store the degree and minute of either a longitude or a latitude.
 *			This class also illustrates the notion of an ADT and the toString().			
 */
public abstract class Position {
/*
 	* degree and minute are to store degree and minute of
 	* either a longitude or a latitude. 	
*/
	private int degree;
	private int minute;
/**
 	* initializes degree and minute.
 	* @param nothing 	
*/
	public Position() {
		this.degree = 0;
		this.minute = 0;
	}
/**
 	* initializes degree and minute.
 	* @param new degree and new minute values 	
*/
	public Position(int newDegree, int newMinute) {
		this.degree = newDegree;
		this.minute = newMinute;
	}
/**
 	* getter method to return hidden data
 	* @param nothing
 	* @returns degree of this object.	
*/	
	protected int getDegree() {
		return degree;
	}
/**
 	* getter method to return hidden data
 	* @param nothing
 	* @returns minute of this object.	
*/	
	protected int getMinute() {
		return minute;
	}
/**
 	* overrides the toString() method of object 
 	* @param nothing
 	* @returns a string representation concatenating all elements.	
*/
	@Override
	public String toString() {
		return "degree=" + this.degree + ", " + " minute=" + this.minute;
		
	}
	
}
