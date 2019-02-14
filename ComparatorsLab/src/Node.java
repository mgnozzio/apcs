
public class Node {
	
	private Node prev;
	private Node next;
	private Object value;
	
	public Node(Object value, Node prev, Node next) {
		this.prev = prev;
		this.next = next;
		this.value = value;
	}
	
	public Node(Object value) {
		this(value, null, null);
	}
	
	public Node getPrev() {return prev; }
	public Node getNext() { return next; }
	public Object getValue() { return value; }

	public void setPrev(Node prev) { this.prev = prev; }
	public void setNext(Node next) {this.next = next;}
}
