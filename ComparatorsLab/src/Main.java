
public class Main {

	public static void main(String[] args) {
		final int NUM = 10;
		APList l = new APArrayList();
		for(int i=NUM; i>0; i--) {
			l.add(i);
		}
		System.out.println("Testing APArrayList: "+l+": "+(l.indexOf(7)==3));
		
		l = new APLinkedList();
		for(int i=NUM; i>0; i--) {
			l.add(i);
		}
		System.out.println("Testing APLinkedList: "+l+": "+(l.indexOf(7)==3));
		
		l = new APSortedList();
		for(int i=NUM; i>0; i--) {
			l.add(i);
		}
		System.out.println("Testing APSortedList: "+l+": "+(l.indexOf(7)==6));

		l = new APSortedList(new ReverseComparator());
		for(int i=NUM; i>0; i--) {
			l.add(i);
		}
		System.out.println("Testing APSortedList(r): "+l+": "+(l.indexOf(7)==3));
		
	}
	
}
