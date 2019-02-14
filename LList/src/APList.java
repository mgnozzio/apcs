
public interface APList<T> {
	/* Our interace defines 3 methods.  Interfaces
	 * only declare method headers, so none are implemented
	 * here.  Classes that implement the APList interface
	 * are required to implement these methods. The interface
	 * allows for polymorphism, since by enabling us to use
	 * objects of different classes interchanably within our
	 * methods.  
	 */
	public void add(T o);
	public T get(int index);
	public T remove(int index);
	public int indexOf(T o);
	public int size();
}
