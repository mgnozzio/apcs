/* This class implements the scheme we discussed in a previous
 * class wherein we double the size of the array whenever we need
 * to increase its size.  We also never shrink the array.  
 */
public class BetterArrayList<T> implements APList<T>{

	/* We could previously get the size from the array, but
	 * now we need to track it manually.
	 */
	private T[] data;
	private int size;
	
	/* We implement the default constructor to start off with 
	 * an array of size 8.  We also need to initialize size.
	 */
	public BetterArrayList() {
		data = (T[])new Object[8];
		size = 0;
	}
	
	/* We need to override all of the GArrayList's methods, but
	 * we still use inheritance to allow us to use a BetterArrayList
	 * whenever a GArrayList would be acceptable
	 */
	
	public T get(int index) {
		if(size == 0 || index < 0 || index >= size) throw new IndexOutOfBoundsException();
		return data[index];
	}
	
	public void add(T o) {
		if(size == data.length) {
			/* Double the size of our array before proceeding */
			T[] newList = (T[]) new Object[size*2];
			for(int i=0; i<size; i++) {
				newList[i] = data[i];
			}
			data = newList;
		}
		data[size] = o;
		size = size + 1;
	}
	
	public T remove(int index) {
		T toRemove = data[index];
		/* Shift everything down one, overwriting the removed object */
		for(int i=index; i<size-1; i++) {
				data[i] = data[i+1];
		}
		/* Clear out the now vacant spot */
		data[size-1] = null;
		size = size - 1;
		return toRemove;
	}
	
}
