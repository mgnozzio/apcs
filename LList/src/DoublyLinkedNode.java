
public class DoublyLinkedNode<T> extends Node<T> {

	/* A DoublyLinkedNode is just like a node, except
	 * that it also keeps track of its predecessor.
	 * We extend the Node class to avoid redundancy.
	 */
	
	private DoublyLinkedNode<T> previous;
	
	/* Since Node does not provide a default constructor
	 * we need to implement our own constructor here and
	 * call Node's constructor explicitly  
	 */
	public DoublyLinkedNode(T o) {
		super(o);
	}
	
	/* Node's accessor and mutator methods are inherrited,
	 * so we only need to implement an accessor and mutator
	 * for our new instance variable.  However, we choose to
	 * override the accessor method to cast our Node to a 
	 * DoublyLinkedNode.
	 */
	public DoublyLinkedNode<T> next() {
		/* The use of super here allows us to call
		 * our super class's next method.  We then
		 * manipulate the result.  
		 */
		return (DoublyLinkedNode<T>) super.next();
	}
	
	public DoublyLinkedNode<T> previous() { return previous; }
	public void setPrevious(DoublyLinkedNode<T> p) { previous = p; }
}
