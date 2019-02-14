public class APArrayList implements APList {

	protected Object[] data;
	protected int size;
	
	public APArrayList() {
		data = new Object[8];
		size = 0;
	}
	
	public void add(Object o) {
		this.add(o,size);
	}
	
	public void add(Object o, int index) {
		if(size == data.length) {
			/* Double the size of our array before proceeding */
			Object[] newList = new Object[size*2];
			for(int i=0; i<size; i++) {
				newList[i] = data[i];
			}
			data = newList;
		}
		/* Shift everything up one to free up the given index */
		for(int i=size; i>index; i--) {
				data[i] = data[i-1];
		}
		data[index] = o;
		size = size + 1;
	}
	
	public Object remove(int index) {
		Object toRemove = data[index];
		/* Shift everything down one, overwriting the removed object */
		for(int i=index; i<size-1; i++) {
				data[i] = data[i+1];
		}
		/* Clear out the now vacant spot */
		data[size-1] = null;
		size = size - 1;
		return toRemove;
	}
	
	public Object get(int index) {
		return data[index];
	}
	
	public int size() { return size; }
	
	public String toString() {
		String s = "[";
		int i=0;
		while(i<size) {
			s += data[i];
			if(i < size-1) s += ",";
			i++;
		}
		s += "]";
		return s;
	}
	
	public int indexOf(Object o){
		// TODO: Implement using sequential search
		for(int i=0; i<size; i++) {
			if(o.equals(data[i])) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		final int NUM = 10;
		APList l = new APArrayList();
		for(int i=NUM; i>0; i--) {
			l.add(i);
		}
		System.out.println(l);
	}
}
