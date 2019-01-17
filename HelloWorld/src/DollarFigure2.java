
public class DollarFigure2 {

	public static void main(String[] args) {
		for(int row=0; row<7; row++) {
			printStars(2*row);
			printDollars(7-row);
			printStars(14-2*row);
			printDollars(7-row);
			printChar('*',2*row);
			System.out.println();

		}
	}
	
	public static void printStars(int numStars) {
		for(int star=0; star<numStars; star++) {
			System.out.print("*");
		}
	}
	
	public static void printDollars(int numDollars) {
		for(int dol=0; dol<numDollars; dol++) {
			System.out.print("$");
		}
	}
	
	public static void printChar(char c, int numDollars) {
		for(int dol=0; dol<numDollars; dol++) {
			System.out.print(c);
		}
	}
}
