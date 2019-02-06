
public interface APList {
	/* Our interace defines 3 methods.  Interfaces
	 * only declare method headers, so none are implemented
	 * here.  Classes that implement the APList interface
	 * are required to implement these methods. The interface
	 * allows for polymorphism, since by enabling us to use
	 * objects of different classes interchanably within our
	 * methods.  
	 */
	public void add(Object o);
	public Object get(int index);
	public Object remove(int index);
}
