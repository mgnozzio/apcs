
public class GArrayList<T> implements APList<T> {

	/* The GArrayList class is a naive implementation
	 * of the APList interface that uses arrays.  The underlying
	 * use of arrays makes it very expensive to add or remove
	 * elements from the list.  But accessing elements is very
	 * fast.  
	 */
	
	private T[] data;
	
	/* Our default constructor initializes our private
	 * instance variable.  
	 */
	public GArrayList() {
		data = (T[]) new Object[0];
	}
	
	/* To get an element, we simply look at the specified
	 * location in our data.  
	 */
	public T get(int index) {
		return data[index];
	}
	
	/* Resizing our underlying array is painful. We have to copy
	 * over elements from our old array to a new one, and then we
	 * update our instance variable.  
	 */
	
	public void add(T o) {
		T[] newList = (T[]) new Object[data.length + 1];
		for(int i=0; i<data.length; i++) {
			newList[i] = data[i];
		}
		newList[data.length] = o;
		data = newList;
	}
	
	public T remove(int index) {
		T o = data[index];
		T[] newList = (T[]) new Object[data.length-1];
		for(int i=0; i<index; i++) {
			newList[i] = data[i];
		}
		for(int i=index+1; i<data.length; i++) {
			newList[i-1] = data[i];
		}
		data = newList;
		return o;
	}
	
}
