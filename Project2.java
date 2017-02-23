// import statement
import java.util.StringTokenizer;

/**
 * @author Inhea (Angela) Jun
 * LAB D, Kiyoung Song
 * Project 2
 * 
 * This program is designed to:
 * 1. Read in lines from an input file.
 * 2. Determine validity of date inputs: must be 8 digits, year <= 2016, month <= 12, day <= 31.
 * 3. Store valid dates to linked lists list1 (original order) and list2 (sorted order).
 * 4. Print invalid inputs to the console.
 * 5. Display the dates in original and sorted order in a GUI.
 * 
 */
public class Project2 {
	
	static DateList list1 = new DateList();
	static DateList list2 = new DateList();

	public static StringTokenizer myTokens;
	public static TextFileInput myFile;
	public static String line;
	public static Date212 d;
	public static DateGUI dates;
	public static int length = 0;
	
	public static void main(String [] args){
		DateGUI.initialize();
		readInput("dates.txt");
		DateGUI.display(list1, list2);
	} 	
	
	/**
	* Takes in a file of inputs and if they are appropriate dates, 
	* adds (unsorted) to one linked list, list1
	* adds (sorted) to another linked list, list2.
	* Invalid entries are printed to the console.
	* 
	* @param	file
	* 			the inputs that will be added to the linked lists.
	*/
	public static void readInput(String file){
		dates = new DateGUI();
		myFile = new TextFileInput(file);
		line = myFile.readLine();
		myTokens = new StringTokenizer(line,",");
		String token = "";
		
		// continues to run while there are still elements in the input
		while(line != null){
			myTokens = new StringTokenizer(line,",");

			// continues to run while there are still elements in the line
			while (myTokens.hasMoreTokens()){
				token = myTokens.nextToken();
				
				// If input is valid, it is added to list1 (unsorted) and to list2 (sorted)
				if (dates.isLegal(token))
				{
					d = new Date212(token);
					list1.append(d);
					list2.insert(d);
					length++;
				} 
				// If input is invalid, it is not added to the lists and instead is printed to the console
				else
					System.out.print(token + "\n");
			} //while
			
			line = myFile.readLine();
	    } // while
		
	    myFile.close();
	} // readInput

}
