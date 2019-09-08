import java.util.Scanner;
public class Stairs {

	public static final int WIDTH = 10;
	
	int numstairs;
	
	public Stairs(int num) {
		numstairs = num;
	}
	
	public String toString() {
		String s = "";
		for(int step=0; step<numstairs; step++) {
			s += printStair(step, numstairs);
		}
		s += printStars(WIDTH + (WIDTH/2)*(numstairs-1));
		s += '*';
		return s;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many stairs?");
		int numstairs = s.nextInt();
		Stairs st = new Stairs(numstairs);
		System.out.print(st);
	}
	
	public static String printStars(int num) {
		String s = "";
		for(int i=0; i<num; i++) {
			s += '*';
		}
		return s;
	}
	
	public static String printSpaces(int num) {
		String s = "";
		for(int i=0; i<num; i++) {
			s += ' ';
		}
		return s;
	}
	
	public static String printStair(int step, int numstairs) {
		String s = "";
		// Line 1
		s += printSpaces((WIDTH/2)*(numstairs-step-1));
		s += " o  ";
		s += printStars(6);
		s += printSpaces(WIDTH/2*step);
		s += "*\n";
		
		// Line 2
		s += printSpaces((WIDTH/2)*(numstairs-step-1));
		s +="/|\\ ";
		s +='*';
		s += printSpaces(WIDTH/2*(step+1));
		s +="*\n";
		
		// Line 3
		s += printSpaces((WIDTH/2)*(numstairs-step-1));
		s +="/ \\ ";
		s +='*';
		s += printSpaces(WIDTH/2*(step+1));
		s +="*\n";
		return s;
	}
	
}
