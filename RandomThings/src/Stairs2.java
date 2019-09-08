
public class Stairs2 {

	public static final int WIDTH = 10;
	public static final int NUMSTAIRS = 5;
	
	public static void main(String[] args) {
		for(int currentStep = 0; currentStep<NUMSTAIRS; currentStep++) {
			for(int step=0; step<currentStep; step++) {
				printStairNoMan(step);
			}
			printStair(currentStep);
			for(int step=currentStep+1; step<NUMSTAIRS; step++) {
				printStairNoMan(step);
			}
			printStars(WIDTH + (WIDTH/2)*(NUMSTAIRS-1));
			System.out.println("*\n");
		}


		
		System.out.println("Please count this EC towards my test grade.");
	}
	
	public static void printStars(int num) {
		for(int i=0; i<num; i++) {
			System.out.print('*');
		}
	}
	
	public static void printSpaces(int num) {
		for(int i=0; i<num; i++) {
			System.out.print(' ');
		}
	}
	
	public static void printStairNoMan(int step) {
		// Line 1
		printSpaces((WIDTH/2)*(NUMSTAIRS-step-1));
		System.out.print("    ");
		printStars(6);
		printSpaces(WIDTH/2*step);
		System.out.println('*');
		
		// Line 2
		printSpaces((WIDTH/2)*(NUMSTAIRS-step-1));
		System.out.print("    ");
		System.out.print('*');
		printSpaces(WIDTH/2*(step+1));
		System.out.println('*');
		
		// Line 3
		printSpaces((WIDTH/2)*(NUMSTAIRS-step-1));
		System.out.print("    ");
		System.out.print('*');
		printSpaces(WIDTH/2*(step+1));
		System.out.println('*');
	}
	
	public static void printStair(int step) {
		// Line 1
		printSpaces((WIDTH/2)*(NUMSTAIRS-step-1));
		System.out.print(" o  ");
		printStars(6);
		printSpaces(WIDTH/2*step);
		System.out.println('*');
		
		// Line 2
		printSpaces((WIDTH/2)*(NUMSTAIRS-step-1));
		System.out.print("/|\\ ");
		System.out.print('*');
		printSpaces(WIDTH/2*(step+1));
		System.out.println('*');
		
		// Line 3
		printSpaces((WIDTH/2)*(NUMSTAIRS-step-1));
		System.out.print("/ \\ ");
		System.out.print('*');
		printSpaces(WIDTH/2*(step+1));
		System.out.println('*');
	}
	
}
