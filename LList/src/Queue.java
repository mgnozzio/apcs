/* A queue is a special kind of list.  Elements that
 * are added to the queue have to come out in the same
 * order that they were put in.  Consequently, we don't
 * want to support methods like get and remove.  We may,
 * however, want to reuse the code that we wrote for our
 * LinkedList class.  The solution is a has-as relationship
 * (rather than straight inheritance).  Our queue will have
 * a LinkedList instance variable 
 */
public class Queue {

	private LinkedList l;
	
	public Queue() {
		l = new LinkedList();
	}
	
	public void add(Object o) {
		l.add(o);
	}
	
	public Object remove() {
		return l.remove(0);
	}
	
}
