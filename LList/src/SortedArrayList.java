import java.util.Random;
public class SortedArrayList<T extends Comparable<T>> extends BetterArrayList<T> {

	/* The sorted array list class is just a better array list.
	 * However, its add method is modified to ensure that
	 * elements are always added in sorted order. 
	 * 
	 * Additionally, it overrides the indexOf method to 
	 * use a more efficient binary search.
	 */
	
	public int indexOf(T o) {
		return indexOf(o, 0, size()-1);
	}
	
	public int indexOf(T o, int min, int max) {
		int midpoint = (min + max)/2;
		T val = get(midpoint);
		int comp = o.compareTo(val);
		if (comp == 0) {
			return midpoint;
		} else if (min == max) {
			return -1;
		} else if (comp < 0) {
			return indexOf(o, min, midpoint-1);
		} else {
			return indexOf(o, midpoint+1, max);
		}
	}
	
	private int getIndex(T o) {
		return getIndex(o, 0, size()-1);
	}
	
	private int getIndex(T o, int min, int max) {
		int midpoint = (min + max)/2;
		T val = get(midpoint);
		int comp = o.compareTo(val);
		if (comp == 0) {
			return midpoint;
		} else if (min == midpoint) {
			if(comp < 0) {
				// Should insert at this index
				return min;
			} else {
				return min + 1;
			}
		} else if (comp < 0) {
			return getIndex(o, min, midpoint-1);
		} else {
			return getIndex(o, midpoint+1, max);
		}
	}
	
	public void add(T o) {
		super.add(o);
		// o is at the end of the list.  We need to move it
		// into place.
		int index = getIndex(o);
		for(int i=size()-1; i>index; i--) {
			data[i] = data[i-1];
		}
		data[index] = o;
	}
	
	public static void main(String[] args) {
		SortedArrayList<Integer> s = new SortedArrayList<Integer>();
		s.add(50);
		Random r = new Random();
		int size = 10;
		for(int i=0;i<size;i++) {
			s.add(r.nextInt(100));
		}
		for(int i=0; i< size; i++) {
			System.out.println(s.get(i));
		}
		System.out.println(s.indexOf(50));
	}
	
}
