/**
 * @author Bekabil Tolassa
 * 
 * This enum PeopleEnumeration type is written in the form of a class.
 * PeopleEnumeration contains some list of names as constant which cannot be changed.
 * Each constants of names are consist of three data which can be manipulated and modified outside
 * of this enum type using get and set methods. Remember these constants cannot be changed but
 * their contents can be changed. Constructor PeopleEnumeration is used to set the three private
 * data fields. Different set and get methods are used to manipulate and print out their data.
 */

package com.practice.enumeration.java;

public enum PeopleEnumeration {
	
	//nine constant objects with 3 data fields should be declared first 	
	EyuChufa("Prophet", 27, "Wolayita, Ethiopia"), 
	TiezazuTilahun("Sr. Computer Security Expert", 55, "Burnsiville, MN, USA"),
	TayeYami("Sr. Pastor and teacher", 57, "Shorview, MN, USA"),
	AlehubelMamo("Jr. Pastor and preacher", 55, "Woodbury, MN, USA"),
	JijoNamera("Computer programmer and Chor leader", 34, "Little Canada, MN, USA"),
	MeleseFeyissa("Data entery and musical instrument", 42, "Apple Valley, MN, USA"),
	NatiAbebe("Assembly, Web developer, musical instrument, and photography", 43, "Little Canada, MN, USA"),
	DinbashaFite("Teacher", 56, "Gulisso, Wollega, Ethiopia"),
	BekabilTolassa("Jr. Programmer", 49, "Maplewood, MN, USA");
	
	//three private variables
	private String description;
	private int age;
	private String address;
	
	//construct this PeopleEnumeration
	PeopleEnumeration(String description, int age, String address) {
		this.description =  description;
		this.age = age;
		this.address = address;
	}
	
	public String getDescription() {
		return description;
	}
	public int getAge() {
		return age;
	}
	public String getAddress(){
		
		return address;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	public void setProfession(String newDescription) {
		this.description = newDescription;
	}
	public void setAge(int newAge){
		this.age = newAge;
	}
	
}
