import java.util.Scanner;
public class Quadratic {

	/**
	 *  pre: s is an open scanner of System.in
	 *  post: prints the given message and reads in a double from s
	 * @param message The message to display
	 * @param s A scanner from which to read input
	 * @return The next double read from s
	 */
	public static double prompt(String message, Scanner s) {
		System.out.print(message + ": ");
		return s.nextDouble();
	}
	
	/**
	 * @param a The coeff. of the squared term of a quad. in standard form
	 * @param b The coeff. of the linear term of a quad. in standard form
	 * @param c The constant term of a quad. in standard form
	 * @return Returns the discriminant of the given quadratic
	 */
	public static double discriminant(double a, double b, double c) {
		return b*b - 4*a*c;
	}
	
	/**
	 * pre: s is either 1 or -1
	 * post: raises a IllegalArgumentException if s is not 1 or -1,
	 *       otherwise returns the solution to the given quad. equation
	 *       If the solution has only imaginary solutions, the s parameter
	 *       is ignored and a string representing both complex numbers is
	 *       returned. 
	 * @param a The coeff. of the squared term of a quad. in standard form
	 * @param b The coeff. of the linear term of a quad. in standard form
	 * @param c The constant term of a quad. in standard form
	 * @param s 1 to indicated the (-b + sqrt(b^2 - 4ac))/2a, -1 for (-b - sqrt(b^2 - 4ac))/2a
	 * @return
	 */
	public static String quadratic(double a, double b,double c,int s) {
		if (s != 1 && s != -1)
			throw new IllegalArgumentException();
		double d = discriminant(a, b, c);
		boolean imaginary = false;
		if(d < 0) {
			imaginary = true;
			d *= -1;
		}
		double r = -b / (2 * a);
		double i = Math.sqrt(d)/(2*a);
		if(imaginary)
			return r + " \u00B1 " + i + "i";
		else
			return Double.toString(r + s*i);
	}
	
	/**
	 * Prompts the user for the coefficients of a quadratic and
	 * computes the solution(s). If there is a double root, only one
	 * solution is displayed.  If there are imaginary roots, they are
	 * displayed together.  Otherwise, both solutions are shown. 
	 * @param args System arguments.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = prompt("A", s);
		double b = prompt("B", s);
		double c = prompt("C", s);
		String answer1, answer2;
		answer1 = quadratic(a, b, c, 1);
		answer2 = quadratic(a,b, c, -1);
		if(answer1.equals(answer2))
			System.out.println("The solution is: "+answer1);
		else
			System.out.println("Two real solutions: "+ 
					answer1 +", "+answer2);
		s.close();
	}
}
