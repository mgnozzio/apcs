import java.util.Scanner;
public class PFunctions {
	
	public static int f(int x) {
		if(x <= 0 || x >= 5) { 
			return Math.abs(2*x);
		} else {
			return 2*x+1;
		}	
	}
	
	public static int g(int x, int y) {
		if(y=0)
		return (x+y)/y;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Input x: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = f(x);
		System.out.println("f("+x+")="+y);
		System.out.println("Input z: ");
		int z = s.nextInt();
		double a = g(x,z);
		System.out.println("g("+x+","+z+")="+a);

	}

}
