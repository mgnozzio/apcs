
public class Node<T> {
	/* The node class is the basic building block of a 
	 * linked list.  It stores arbitrary information 
	 * and has a pointer that allows us to chain to another
	 * piece of info.
	 */
	
	/* We have two instance variables: the info we need to store
	 * and a pointer to another node.
	 */
	private T info;
	private Node<T> next;
	
	public Node(T info) {
		/* We use the keyword "this" to disambiguate
		 * a local variable or parameter from an instance
		 * variable. 
		 */
		this.info = info;
		/* next is initialized to null by default but
		 * we include an explicit initialization to be
		 * thorough
		 */
		this.next = null;
	}
	
	/* This is a mutator method that updates the reference
	 * to another node. 
	 */
	public void setNext(Node<T> n) {
		this.next = n;
	}
	
	/* This is an accessor method that grabs the info stored
	 * in the node. 
	 */
	public T getInfo() {
		return this.info;
	}
	
	/* Finally, we have an accessor method to get the next node.
	 */
	public Node<T> next() {
		return this.next;
	}
}
