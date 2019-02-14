public class APLinkedList implements APList {

	private int size;
	private Node first;
	private Node last;
	
	public APLinkedList() {}
	
	public void add(Object o) {
		this.add(o, size);
	}
	
	public void add(Object o, int index) {
		Node n = new Node(o);
		addNode(n, index);
	}
	
	private void addNode(Node n, int index) {
		Node c = null;
		Node p = null;
		if(index != size) {
			c = getN(index);
			p = c.getPrev();
			c.setPrev(n);
		} else {
			p = last;
			last = n;
		}
		if(p != null) {
			p.setNext(n);
		} else {
			first = n;
		}
		n.setPrev(p);
		n.setNext(c);
		size++;
	}
	
	public Object get(int index) {
		return getN(index).getValue();
	}
	
	protected Node getN(int index) {
		if(size == 0 || index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		int i = 0;
		Node node = first;
		while(i < index) {
			node = node.getNext();
			i++;
		}
		return node;
	}
	
	public Object remove(int index) {
		return removeN(index).getValue();
	}
	
	private Node removeN(int index) {
		return last;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		String s = "[";
		int i=0;
		Node n = first;
		while(i<size) {
			s += n.getValue();
			n = n.getNext();
			if(n != null) s += ",";
			i++;
		}
		s += "]";
		return s;
	}
	
	public int indexOf(Object o) {
		// TODO:  Implement this method using sequential search
		return -1;
	}
	
	
	public static void main(String[] args) {
		final int NUM = 10;
		APList l = new APLinkedList();
		for(int i=0; i<NUM; i++) {
			l.add(i);
		}
		System.out.println(l);
	}
}
