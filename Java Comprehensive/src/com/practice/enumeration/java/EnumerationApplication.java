/**
 * @author Bekabil Tolassa
 * 
 * This class EnumerationApplication is written to test the enum type PeopleEnumeration.
 * enum type PeopleEnumeration will be created and its data will be displayed to the console.
 * Each constants of names data will which can be manipulated and modified within this class
 * using get and set methods. Once again, these constants the names of people cannot be changed but
 * their contents can be changed using getters and setters. This class also prints out data of each constants.
 */

package com.practice.enumeration.java;
import java.util.EnumSet;

public class EnumerationApplication {

	public static void main(String[] args) {
		
		
		System.out.println("Number of people in our record are: " + PeopleEnumeration.values().length + " members so far...");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Name:\t\tProfession:\tAge:\tAddress:");
		for(PeopleEnumeration people: PeopleEnumeration.values())
			System.out.printf("%s\t%s\t%d\t%s\n", people, people.getDescription(), people.getAge(), people.getAddress());

		System.out.println("\nAnd now view certain range of some member's information...");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Name:\t\tProfession:\tAge:\tAddress:");
		for(PeopleEnumeration people: EnumSet.range(PeopleEnumeration.TiezazuTilahun, PeopleEnumeration.MeleseFeyissa))
		System.out.printf("%s\t%s\t%d\t%s\n", people, people.getDescription(), people.getAge(), people.getAddress());
		System.out.println();
		System.out.println("Some member's information has been changed or updated...");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Name:\t\tProfession:\t\t\tAge\tAddress:");
		PeopleEnumeration changeOfAddress = PeopleEnumeration.TiezazuTilahun;
		//System.out.println(PeopleEnumeration.TiezazuTilahun);
		System.out.println();
		changeOfAddress.setAddress("Gulele, Addis Ababa, Ethiopia");
		changeOfAddress.setProfession("Computer Security Consultant");
		changeOfAddress.setAge(60);
		System.out.printf("%s\t%s\t%d\t%s\n", changeOfAddress, changeOfAddress.getDescription(), changeOfAddress.getAge(), changeOfAddress.getAddress());
	
	}

}
