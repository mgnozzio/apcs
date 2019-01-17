import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) {
			String input = s.nextLine();
			String[] words = input.split(" ");
			System.out.println("There are "+words.length+" words in the line.");
		}
		s.close();
		System.out.println("Done!");
	}
}
