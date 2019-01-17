import java.util.Scanner;
import java.math.*;
/**
 * @author mgnozzio
 *
 */
public class PrePost {
	
	/**
	 * precondtion: x is non negative
	 * postcondtion: returns factorial
	 * @param x Some integer
	 * @return x factorial
	 *
	 */
	public static int factorial(int x) {
		int answer = 1;
		for(int i=x; i>0; i--) {
			answer *= i;
		}
		return answer;
	}
	
	public static int f(int x) {
		return (int)Math.random()/x;
	}
	
	public static void main(String[] args) {
		System.out.println("Input an integer: ");
		Scanner s = new Scanner(System.in);
		Integer x = s.nextInt();
		System.out.println("f("+x+")="+f(x));
	}

}
