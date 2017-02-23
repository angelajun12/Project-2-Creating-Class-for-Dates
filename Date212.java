/**
 * Inhea (Angela) Jun
 * LAB D, Kiyoung Song
 * Project 2
 * 
 * This program is designed to:
 * 1. Receive a string of 8 digits and separate and store appropriate values for the year, month, and day entered.
 * 2. Check validity of the string entered.
 * 3. Compare one Date212 object to another Date212 object.
 * 4. Show a String representation of Date212 elements.
 */

public class Date212 {

	private int month;
	private int day;
	private int year;
	
	/**
	 * Three parameter constructor for the Date212 class
	 * that stores the month, day, and year from the 
	 * given date object.
	 * 
	 * @param n
	 *            The string of digits that will be separated into
	 *            year,month,day variables.
	 */
	public Date212(String n){
		this(Integer.parseInt(n.substring(0,4)), Integer.parseInt(n.substring(4,6)), Integer.parseInt(n.substring(6,8)));
	}
	
	/**
	 * Checks whether the year, month, and day entered is valid.
	 * If valid, values are assigned to the variables
	 * year is valid if less than or equal to 2016
	 * month is valid if less than or equal to 12
	 * day is valid if less than or equal to 31.
	 * 
	 * @param y
	 *            The data element representing the year.
	 * @param m
	 * 			  The data element representing the month.
	 * @param d
	 * 			  The data element representing the day.
	 */
	public Date212(int y, int m, int d){
		if (m <= 12)
			month = m;
		if (d <= 31)
			day = d;
		if (y <= 2016)
			year = y;
	}
	
	/**
	 * Compares one Date212 object to another.
	 * 
	 * @param other
	 *            the data element to be compared.
	 *            
	 * @return	0 if dates are equal
	 * 			negative if other value is greater than this value
	 * 			positive if other value is less than this value.
	 */
	public int compareTo(Date212 other) {
		
		int value = year - other.year;
		if (value == 0){
			value = month - other.month;
			if (value == 0)
				value = day - other.day;
		}
		return value;
	}
	
	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character.
	 */
	public String toString(){
		if (month < 10 && day > 9)
			return "0" + month + "/" + day + "/" + year;
		if (month > 9 && day < 10)
			return month + "/0" + day + "/" + year;
		if (month < 10 && day < 10)
			return "0" + month + "/0" + day + "/" + year;
		return month + "/" + day + "/" + year;
	}
	
	
}

