/**
 * Inhea (Angela) Jun
 * LAB D, Kiyoung Song
 * Project 2
 * 
 * This program is designed to:
 * 1. Create a DateNode constructor.
 * 2. Create protected variables data, next that can be accessed by other classes.
 */


public class DateNode {
	protected Date212 data;
	protected DateNode next;
	
	/**
	 * Creates a new node with the data that was given.
	 * 
	 * @param d
	 *            the data element to be appended.
	 */
	public DateNode(Date212 d){
		data = d;
	    next = null;
	} // constructor

}
