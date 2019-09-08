import java.util.Scanner;
public class Foo {
	
	public static boolean isPrime(int x) {
		for(int i=1; i<x/2; i++) {
			if(x%2==0) return false;
		}
		return true;
	}
	
	public static int largestPrimeFactor(int x) {
		for(int a=x; a>0; a--) {
			if(x%a==0 && isPrime(a)) return a;
		}
		throw new ArithmeticException("Something's gone horribly wrong");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.
	}
}
