
public class DoublyLinkedNode extends Node {

	/* A DoublyLinkedNode is just like a node, except
	 * that it also keeps track of its predecessor.
	 * We extend the Node class to avoid redundancy.
	 */
	
	private DoublyLinkedNode previous;
	
	/* Since Node does not provide a default constructor
	 * we need to implement our own constructor here and
	 * call Node's constructor explicitly  
	 */
	public DoublyLinkedNode(Object o) {
		super(o);
	}
	
	/* Node's accessor and mutator methods are inherrited,
	 * so we only need to implement an accessor and mutator
	 * for our new instance variable.  However, we choose to
	 * override the accessor method to cast our Node to a 
	 * DoublyLinkedNode.
	 */
	public DoublyLinkedNode next() {
		/* The use of super here allows us to call
		 * our super class's next method.  We then
		 * manipulate the result.  
		 */
		return (DoublyLinkedNode) super.next();
	}
	
	public DoublyLinkedNode previous() { return previous; }
	public void setPrevious(DoublyLinkedNode p) { previous = p; }
}
