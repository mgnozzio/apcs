
public class ForLoops {
	public static void main(String[] args) {
		for(int leftColumn=2; leftColumn <=6; leftColumn++) {
			System.out.print(leftColumn + ": ");
			int tickUp = 1;
			for(int counter=6; counter >=1; counter --) {
				for (int print=counter-1; counter >=1; counter --) {
					tickUp *= leftColumn;
					System.out.print(" " + tickUp);
				}
			}
			System.out.println();
		}
	}
}
