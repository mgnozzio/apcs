import java.util.Comparator;
public class ReverseComparator implements Comparator {

	/* This comparator reverses the natural order of comparison */
	
	public int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable) o1;
		Comparable c2 = (Comparable) o2;
		return c2.compareTo(c1);
	}
	
}
