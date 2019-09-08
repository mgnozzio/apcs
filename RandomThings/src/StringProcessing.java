import java.util.Scanner;

public class StringProcessing {
	public static void main(String[] args) {
		String s = "foo";
		String t = new String(s);
		System.out.println("s==t: "+(s==t));
		System.out.println("s.equals(t): "+s.equals(t));
		Integer i = 5;
		System.out.println(i.equals(5));
	}
}
