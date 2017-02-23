// import statements
import java.util.StringTokenizer;
import javax.swing.*;
import java.awt.*;

/**
 * Inhea (Angela) Jun
 * LAB D, Kiyoung Song
 * Project 2
 * 
 * This program is designed to:
 * 1. Initialize a GUI with two columns.
 * 2. Display the dates in two columns that are unsorted and sorted.
 * 3. Determine whether a String is a valid date.
 */

public class DateGUI {
	private static Container cPane;
	private static TextArea left, right;
	static JFrame myFrame;
	public static StringTokenizer myTokens;
	public static TextFileInput myFile;
	
	public static void main(String [] args){
		initialize();
	} // main
	
	/**
	* Initializes the GUI by creating a new JFrame.
	* Creates two separate columns, left and right.
	* Appends columns with "Unsorted" and "Sorted" labels.
	*/
	public static void initialize(){
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(100,100);//width, height);
		myFrame.setLocation(200,200);//x, y);
		myFrame.setLayout(new GridLayout(1,2));
		left = new TextArea();
		right = new TextArea();
		cPane = myFrame.getContentPane();
		cPane.add(left, BorderLayout.WEST);
		cPane.add(right, BorderLayout.EAST);
		left.append("Unsorted:\n\n");
		right.append("Sorted:\n\n");
	} // initialize
	
	/**
	* Displays the elements of the linked lists in the GUI.
	* Left side contains the unsorted dates.
	* Right side contains the sorted dates.
	* 
	* @param unsorted
	* 		Linked list containing unsorted dates.
	* @param sorted
	* 		Linked list containing sorted dates.
	*/
	public static void display(DateList unsorted, DateList sorted){

		DateNode p = unsorted.first.next;
		// while there are still elements in the list
  		while (p != null) {
    		left.append(p.data + "\n");
    		p = p.next;
  		}
  			
  		DateNode r = sorted.first.next;
  		// while there are still elements in the list
  		while (r != null) {
    		right.append(r.data + "\n");
    		r = r.next;
  		}
		
    	myFrame.pack();
    	myFrame.setVisible(true);
	}
	
	/**
	* Determines whether the input String is a valid date. It is valid if the String
	* contains exactly 8 digits, with the first four digits (year) less than 2017, 
	* the next two (month) less than 13, and the last two (day) less than 32.
	* 
	* @param line
	* 			String from the file to be checked.
	* 
	* @return	<code>true</code> if the parameter object contains exactly 8 digits,
	* 			with the first four digits (year) less than 2017, the next two (month) less than 13,
	*			and the last two (day) less than 32, <code>false</code> otherwise.
	* 
	*/
	public boolean isLegal(String line){
		// Checks if the input is 8 characters long
		if (line.length() != 8)
			return false;
		
		// If the input is 8 characters long, it is checked to see if all characters are digits
		for (int i = 0; i < 8; i++)
		{
			if (Character.isDigit(line.charAt(i)) != true)
				return false;
		}
		
		// Checks to see if the digits represent a valid date
		if (Integer.parseInt(line.substring(0, 4)) > 2016 || Integer.parseInt(line.substring(4, 6)) > 12 || Integer.parseInt(line.substring(6, 8)) > 31)
			return false;
		
		return true;
	} // isLegal
}

