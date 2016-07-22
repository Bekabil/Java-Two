package com.weather.info.java;
import java.util.ArrayList;
import java.util.List;
/**
 * @author	Bekabil Tolassa
 * Date:	May 21, 2015
 * Class:	ICS 372
 * Program:	Assignment 1
 * purpose:	This class is a driver class written to create objects of
 * 			 Latitude, Longitude, and WeatherRecord. This class generates some
 * 			 random data and test these objects. 
 *			The data field is ArrayList of Latitude, Longitude, and WeatherRecord			
 */
public class Driver {
/*
 	* latitudeObjects is to store degree, minute, and a latitude position.
 	* longitudeObjects is to store degree, minute, and a longitude position.
 	* weatherRecords is to store minimum and maximum temperature of a point, given
 	*  particular latitude and longitude positions.	
 */
	private ArrayList<Latitude> latitudeObjects = new ArrayList<Latitude>();
	private ArrayList<Longitude> longitudeObjects = new ArrayList<Longitude>();
	private ArrayList<WeatherRecord> weatherRecords = new ArrayList<WeatherRecord>();
	
/**
 	* creates objects of Latitude, Longitude, and WeatherRecord. 
 	* it generates random degree, minute, minimum, and maximum temperatures.
 	* it invokes toString() methods on weatherRecords object.
 	* @param nothing 	
*/
	public Driver() {
		final int MAXIMUM_SIZE = 10;
		//ten different points of Latitude objects will be created 
		for(int count = 1; count <= MAXIMUM_SIZE; count++) {
			if(30 % count  == 0) 
				latitudeObjects.add(new Latitude((int)(Math.random()*90),
						(int)(Math.random()*90),"N"));
				latitudeObjects.add(new Latitude((int)(Math.random()*90),
					(int)(Math.random()*90), "S"));
		}
		//ten different points of Longitude objects will be created 
		for(int count = 1; count <= MAXIMUM_SIZE; count++) {
			if(30 % count == 0) 
				longitudeObjects.add(new Longitude((int)(Math.random()*90), 
						(int)(Math.random()*90), "W"));
			 	longitudeObjects.add(new Longitude((int)(Math.random()*90), 
			 			(int)(Math.random()*90), "E"));
		}
		//positiveTemperature is used as a switcher
		boolean positiveTemperature = true;
		//loop through ten times and execute
		for(int count = 0; count < MAXIMUM_SIZE; count++) {
			double firstTemperature = 0;
			double secondTemperature = 0;
			
			//two temperatures are randomly generated if they are equal
			while(firstTemperature == secondTemperature){
				firstTemperature = (Math.random() * 100);
				secondTemperature = (Math.random() * 100);
			}
			//if not positive temperature, make the first temperature negative
			if(!positiveTemperature) {
				firstTemperature = firstTemperature * -1;
				positiveTemperature = !positiveTemperature;
			}
			else {
				positiveTemperature = !positiveTemperature;
			}
			//if the first temperature is less than the second, create
			//weather information as the first temperature been smaller.
			if(firstTemperature < secondTemperature){
				weatherRecords.add(new WeatherInformation(latitudeObjects.get(count), 
						longitudeObjects.get(count), firstTemperature, secondTemperature));
			}
			else {
				//otherwise, the first temperature is larger than the second, 
				//so, create weather information as the first temperature been larger.
				weatherRecords.add(new WeatherInformation(latitudeObjects.get(count),
						longitudeObjects.get(count), secondTemperature, firstTemperature));
			}
			
		}
		//loop through the weatherRecords and invoke the toString() method on each.
		for(int count = 0; count < weatherRecords.size(); count++)
			System.out.println(weatherRecords.get(count).toString());
	}
/**
 	* The program execution starts here. 
 	* no argument constructor of this class is invoked
 	* @param string array of args 	
*/
	public static void main(String[] args) {
		
		new Driver();
		
	}

}
