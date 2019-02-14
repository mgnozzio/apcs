
public class LinkedList<T> implements APList<T> {

	/* The LinkedList class implements the APList
	 * interface through a series of linked nodes. This
	 * implementation makes it easy to add and remove 
	 * elements from our list, but accessing elements
	 * near the end of the list is slow.  
	 */
	
	/* A LinkedList keeps track of the first and last
	 * node of the list.  We also keep track of the size
	 * of the list.
	 */
	protected Node<T> first;
	protected Node<T> last;
	protected int size;
	
	public LinkedList() {
		/* To create an empty, we have nothing to do.
		 * This is the default constructor.
		 */
	}

	/* We implement a protected helper method to allow us
	 * to add new nodes to the list.  This method doesn't
	 * give us any real benefit in this class, but it
	 * makes our class more extensible (hence the helper
	 * method being protected instead of private).  
	 */
	protected void addN(Node<T> n) {
		/* Our list may be empty.  If so, we set 
		 * our first element to n. 
		 */
		if(first == null) first = n;
		else {
			/* Otherwise, we update the last node of
			 * the list to set our new node to be its 
			 * successor.
			 */
			last.setNext(n);
		}
		/* Finally, we update last, since our new node is now
		 * the last node in the list
		 */
		last = n;
		size = size+1;
	}
	
	/* Implementing the required add method is now just a 
	 * matter of writing a smaller wrapper method. The bulk
	 * of the work is done in our helper method.  
	 */
	public void add(T o) {
		/* First, we wrap the info passed in inside a Node */
		Node<T> n = new Node<T>(o);
		addN(n);
	}
	
	/* We implement a protected helper method to give us easy
	 * access to the nth node of the list.  We use protected instead
	 * of private so that subclasses can use this helper method also. 
	 */
	protected Node<T> getN(int index) {
		Node<T> n = first;
		for(int i=0; i<index; i++) {
			if(n.next() == null) throw new IndexOutOfBoundsException();
			else n = n.next();
		}
		return n;
	}
	
	/* The get method required by the APList interface uses
	 * our private method to navigate to the appropriate node.
	 */
	public T get(int index) {
		return getN(index).getInfo();
	}
	
	/* The remove method is similar to the get method, but instead
	 * of accessing, the nth element, we need to access the prior one.
	 * There is some special casing when removing the first or the last
	 * element. Like the get method, we break this up into a protected
	 * helper method, and then a public method that does some unwrapping.
	 */
	protected Node<T> removeN(int index) {
		/* We do this at the beginning so that we immediately
		 * raise an exception if the node requested is out of bounds.
		 */
		if(size == 0 || index < 0 || index >= size) throw new IndexOutOfBoundsException();
		
		Node<T> toRemove = null;
		Node<T> previous = null;
		if(index == 0) {
			/* Special case: We're removing the fist node. 
			 * All we need to do is adjust the first node */
			toRemove = first;
			first = toRemove.next();
			
		} else {
			/* Removing any other node is just a matter
			 * of changing the previous node's pointer.
			 */
			previous = getN(index-1);
			toRemove = previous.next();
			previous.setNext(toRemove.next());
		}
		
		if(index == size-1) {
			/* Special case: We're removing the last node.
			 * We still want to adjust references as above,
			 * but the previous node is now also the last node
			 */
			last = previous;
		}
		
		/* Lastly, adjust the size */
		size = size - 1;
		
		return toRemove;
	}
	
	public T remove(int index) {
		return removeN(index).getInfo();
	}
	
	/* This is a helper method used for subclassing purposes.
	 * It exposes the node at the end of the list. 
	 */
	protected Node<T> getLast() {
		return last;
	}
	
	/* The size method tells us the number of ndoes in the list.
	 */
	public int size() { return size; }
	
	/* The indexOf method does a sequential / linear search
	 * of the data
	 */
	public int indexOf(T o) {
		Node<T> n = getN(0);
		int i = 0;
		while(!o.equals(n.getInfo())) {
			if(n.next() == null) return -1;
			n=n.next();
			i++;
		}
		return i;
	}
	
}
