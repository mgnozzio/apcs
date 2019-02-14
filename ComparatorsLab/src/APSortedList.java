import java.util.Comparator;
public class APSortedList implements APList{

	/* Write a class that keeps its elements in sorted order. 
	 * 
	 * Some questions to consider:  
	 * 
	 * Does it make sense to extend the APLinkedList or the APArrayList
	 * class?  Or would it be better to use one as an instance variable?
	 * 
	 * Since our data is sorted, we can theoretically use binary search
	 * to implement the indexOf method.  In practice, would this be
	 * advantageous?  (Hint: The answer depends on how you're storing the
	 * data)
	 * 
	 * What is computational complexity of your indexOf method, in big-O
	 * notation?
	 * 
	 */
	
	/* The constructor may take in a comparator that tells us how
	 * to sort the items.  
	 */
	public APSortedList(Comparator c) {
	}
	
	/* Or we can construct a new list without a comparator and
	 * sort items that are comparable based on their natural ordering.
	 */
	public APSortedList() {
	}
	
	/* This method may prove helpful in wrapping the differing
	 * behavior between the comparator case and the natural sorting
	 * case.
	 */
	private int compare(Object o1, Object o2) {
		return -1;
	}
	
	/* At a minimum, you will need to override the add method */
	public void add(Object o) {
	}
	
	/* You may be able to make use of existing code for these
	 * methods
	 */
	public Object get(int index) {return null;}
	public Object remove(int index) {return null;}
	public int indexOf(Object o) {return -1;}
	public int size() {return 0;} 
	public String toString() {return "Implement me";}
}
