/**
 * @author Bekabil Tolassa
 * 
 * Class EnumeratedTypeDemo is written to learn about enum type.
 * The enum Day contains constant list of days which cannot be changed.
 * Different methods the enum type such as compareTo(), equals(), toString(), values(), ordinal(),
 * and name() are used to test the enum type by manipulating some data.
 *
 */
public class EnumeratedTypeDemo {
	
	private static enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
	
	public static void main(String[] args) {
		
		Day day0 = Day.SUNDAY;
		Day day2 = Day.TUESDAY;
		Day day5 = Day.FRIDAY;
		Day day4 = Day.THURSDAY;
		Day five = day5;
		Day four = day4;
		System.out.println("Length of Day is: " + Day.values().length);
		System.out.println("day 0's name is " + day0.name());
		System.out.println("day 0's ordinal is: " + day0.ordinal());
		System.out.println("day 2's toString returns: " + day2.toString());
		System.out.println("day 5 is: " + day5);
		System.out.println("day 5's ordinal is: " + day5.ordinal() + " which is " + day5);
		System.out.println("day 5 compare to five returns: " + day5.compareTo(five));
		System.out.println("day 5 equals day five returns: " + day5.equals(five));
		System.out.println("day 5 == five returns: " + (five == day5));
		System.out.println("day 4 compare to four returns: " + day4.compareTo(four));
		System.out.println("day 0 (SUNDAY) compare to day five (FRIDAY) returns: " + day0.compareTo(day5));
		System.out.println("day 5 (FRIDAY) compare to day 0 (SUNDAY) returns: " + day5.compareTo(day0));
		
	}

}
