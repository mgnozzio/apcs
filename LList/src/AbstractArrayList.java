
public abstract class AbstractArrayList<T> {

	protected Object[] data;
	
	public abstract T get(int n);
	public abstract int size();
	
	public int indexOf(T o) {
		for(int i=0; i<size(); i++) {
			if(o.equals(get(i))) return i;
		}
		return -1;
	}
	
}
