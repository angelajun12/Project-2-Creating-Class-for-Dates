/**
 * Inhea (Angela) Jun
 * LAB D, Kiyoung Song
 * Project 2
 * 
 * This program is designed to:
 * 1. Append nodes to the end of a DateList.
 * 2. Insert nodes in sorted order to a DateList.
 * 3. Show a String representation of elements in a DateList.
 */

public class DateList {

	protected DateNode first;
	protected DateNode last;
	private int length;
	
	/**
	 * Creates a new DateList with first and last containing null
	 * and length containing the value 0.
	 * 
	 */
	public DateList(){
		first = new DateNode(null);
		last = first;
		length = 0;
	} // constructor
	
	/**
	 * Gets the number of data values currently stored in this DateList.
	 * 
	 * @return the number of elements in the list.
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * Appends a String data element to the end of this DateList.
	 * 
	 * @param d
	 *            the data element to be appended.
	 */
	public void append(Date212 d) {
		DateNode n = new DateNode (d);
		last.next = n;
		last = n;
		length++;
	}
	
	/**
	 * Inserts node in the proper position to keep the list sorted in order by date.
	 * 
	 * @param d
	 *            the data element to be inserted.
	 */
	public void insert(Date212 d){
		DateNode n = new DateNode(d);
		DateNode a = first, b = first.next;
		
		// while b is not pointing to the last element and b < n, shift pointers once to the right
		while ((b != null) && ((b.data).compareTo(n.data) < 0)){
			a = a.next;
			b = b.next;
		}
		
		// if b is not pointing to the last element and b > n, insert node before b
		if ((b != null) && (b.data).compareTo(n.data) > 0){
			a.next=n;
			n.next=b;
			length++;
		}
		
		// if b is not pointing to the last element and b == n, insert node after b
		else if ((b != null) && (b.data).compareTo(n.data) == 0){
			n.next = b.next;
			b.next = n;
		}
		
		// if b is null (no more items on the list), append the node to the end of the list
		if (b == null)
			append(n.data);
				
	}
	
	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character.
	 */
	public String toString() {
		DateNode p = first.next;
		String returnString = "";
		// while there are still elements in the list
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}
}
