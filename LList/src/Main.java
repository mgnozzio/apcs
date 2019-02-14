/* This code demonstrates the principles of interfaces
 * and inheritance.  
 * 
 * The APList interface specifies methods
 * that all lists must implement.  
 * 
 * The LinkedList class is a
 * simple implementation that satisfies those requirements.  
 * 
 * The DoublyLinkedList class builds on the LinkedList class,
 * overriding methods where necessary and supplementing with
 * additional functionality. 
 * 
 * The DoublyLinkedList is-a LinkedList,
 * and LinkedLists are APLists.  Both use private Node variables
 * that encapsulate the storage and ordering of information.
 *  
 * In the case of the DoublyLinkedLists, our list is specifically
 * composed of DoublyLinkedNodes.  However, we need not rewrite
 * most of the LinkedList class, since DoublyLinkedNodes are a type
 * of Node.  Polymorphism allows us to use them wherever a more generic
 * Node is required.  
 * 
 * The GArrayList class is an alternative implementation of an
 * APList.  LinkedLists and GArrayLists can both be used wherever
 * APLists are required, but they may perform differently.  
 * 
 * The BetterArrayList class is yet another way to implement an APList.
 * It is similar to a GArrayList, but it uses a different scheme for 
 * resizing the underlying array.  We choose not to extend GArrayList in this
 * case, because there is no code worth inheretting. The APList interface
 * already ensures that we can use these two classes interchangably.  
 * 
 * 
 * Finally, the Queue class demonstrates the concept of a has-a
 * relationship.  This sort of relationship allows us to leverage
 * the features of another class (in this case, the LinkedList class)
 * without extending the class directly.  Here, extending the LinkedList
 * class would be inappropriate because we specifically do not want
 * to implement the APList interface.  
 */

import java.time.Instant;
import java.util.Random;

public class Main {
	
	/* The following code demonstrates all of the above classes in
	 * action.  
	 */
	public static void main(String[] args) {
		
		System.out.println("This code shows the relative peformance of our different classes.");
		System.out.println("It runs the same tests on GArrayLists, LinkedLists, DoublyLinkedLists, and BetterArrayLists.");
		System.out.println("The four classes can all be used interchangably, because they all implement APList.");
		System.out.println("Please be patient.  Tests may take several seconds to run.\n");

		
		APList<Integer> ga = new GArrayList<Integer> ();
		APList<Integer>  ll = new LinkedList<Integer> ();
		APList<Integer>  dl = new DoublyLinkedList<Integer> ();
		APList<Integer>  ba = new BetterArrayList<Integer> ();

		
		System.out.println("For GArrayList, the add test took " + timeAddToList(ga) + " seconds.");
		System.out.println("For LinkedList, the add test took " + timeAddToList(ll) + " seconds.");
		System.out.println("For DoublyLinkedList, the add test took " + timeAddToList(dl) + " seconds.");
		System.out.println("For BetterArrayList, the add test took " + timeAddToList(ba) + " seconds.");
		System.out.println();
		
		System.out.println("For GArrayList, the get test took " + timeGetFrom(ga) + " seconds.");
		System.out.println("For LinkedList, the get test took " + timeGetFrom(ll) + " seconds.");
		System.out.println("For DoublyLinkedList, the get test took " + timeGetFrom(dl) + " seconds.");
		System.out.println("For BetterArrayList, the get test took " + timeGetFrom(ba) + " seconds.");
		System.out.println();

		
		System.out.println("For GArrayList, the remove test took " + timeRemoveFrom(ga) + " seconds.");
		System.out.println("For LinkedList, the remove test took " + timeRemoveFrom(ll) + " seconds.");
		System.out.println("For DoublyLinkedList, the remove test took " + timeRemoveFrom(dl) + " seconds.");
		System.out.println("For BetterArrayList, the remove test took " + timeRemoveFrom(ba) + " seconds.");

		System.out.println();
	}
	
	public static final int NUM = 50000;
	
	public static long timeAddToList(APList<Integer> l) {
		long t1 = Instant.now().getEpochSecond();
		for(int i = 0; i<NUM; i++) {
			l.add(i);
		}
		return Instant.now().getEpochSecond() - t1;
	}
	
	public static long timeGetFrom(APList<Integer> l) {
		long t1 = Instant.now().getEpochSecond();
		Random r = new Random();
		for(int i = 1; i<NUM; i++) {
			// For performance benchmarking, we remove a random element of the list.  
			l.get(r.nextInt(i));
		}
		return Instant.now().getEpochSecond() - t1;
	}
	
	public static long timeRemoveFrom(APList<Integer> l) {
		long t1 = Instant.now().getEpochSecond();
		Random r = new Random();
		for(int i = NUM-1; i>NUM/2; i--) {
			// For performance benchmarking, we remove a random element of the list.  
			l.remove(r.nextInt(i));
		}
		return Instant.now().getEpochSecond() - t1;
	}
	
}
