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
	
	private Comparator comp;
	private APLinkedList data;
	
	/* The constructor may take in a comparator that tells us how
	 * to sort the items.  
	 */
	public APSortedList(Comparator c) {
		this();
		this.comp = c;
	}
	
	/* Or we can construct a new list without a comparator and
	 * sort items that are comparable based on their natural ordering.
	 */
	public APSortedList() {
		data = new APLinkedList();
	}
	
	private int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		if(this.comp != null) return comp.compare(c1,c2);
		else return c1.compareTo(c2);
	}
	
	public void add(Object o) {
		int i = 0;
		int size = data.size();
		if(size > 0 ) {
			Node n = data.getN(0);
			while(i<size && compare(n.getValue(), o) < 0) {
				n = n.getNext();
				i = i+1;
			}
		}
		data.add(o,i);
	};
	
	public Object get(int index) {return data.get(index);};
	public Object remove(int index) {return data.remove(index);};
	public int indexOf(Object o) {return data.indexOf(o);};
	public int size() {return data.size();} ;
	public String toString() {return data.toString();};
}
