
public interface APList {
	/* Our interace defines 5 methods.  Interfaces
	 * only declare method headers, so none are implemented
	 * here.  Classes that implement the APList interface
	 * are required to implement these methods. The interface
	 * allows for polymorphism, since by enabling us to use
	 * objects of different classes interchanably within our
	 * methods.  
	 */
	
	/* Add o to the the list. Specific implemenations may decide
	 * where the given object should be inserted.
	 */
	public void add(Object o);
	
	/* Get the element at the specified index */
	public Object get(int index);
	
	/* Remove the object at the given index from
	 * the list, and return it.
	 */
	public Object remove(int index);
	
	/* Return the index of the specified object,
	 * or -1 if the object is not in the list.
	 */
	public int indexOf(Object o);
	
	/* Return the size of the list */
	public int size();
}
