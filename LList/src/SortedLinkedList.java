import java.util.Random;

public class SortedLinkedList <T extends Comparable<T>> extends DoublyLinkedList<T> {

	/* The sorted linked list class is just a better array list.
	 * However, its add method is modified to ensure that
	 * elements are always added in sorted order. 
	 */
	
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
		DoublyLinkedNode<T> n = getR(0);
		DoublyLinkedNode<T> next = (DoublyLinkedNode<T>) getN(0);
		while(next.getInfo().compareTo(n.getInfo()) < 0) {
			next = next.next();
		}
		if(next != n) {
			DoublyLinkedNode<T> prev = next.previous();
			if(prev == null) first = n;
			else prev.setNext(n);
			next.setPrevious(n);
			n.setNext(next);
			last = n.previous();
			n.setPrevious(prev);
			 
		}
	}
	
	public static void main(String[] args) {
		SortedLinkedList<Integer> s = new SortedLinkedList<Integer>();
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
