import java.util.Arrays;

public class Point implements Comparable<Point> {

	private double x;
	private double y;
	
	/* Create a new point based on specified x and y coordinates */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/* The default constructor creates a point at the origin */
	public Point() {
		this(0,0);
	}
	
	public double getX() { return x;}
	public double getY() { return y;}
	
	public String toString() { 
		return ("("+x+","+y+")");
	}
	
	/* TODO: Implement the compare_to method so that points are sorted
	 * according to their x-coordinate
	 */
	public int compareTo(Point p) {
		return Double.compare(this.x, p.x);
	}
	
	public static void main(String[] args) {
		int num_points = 20;
		Point[] points = new Point[num_points];
		for(int i=0; i<num_points; i++) {
			double x = Math.sqrt(i);
			double y = Math.cos(i);
			points[i] = new Point(x,y);
		}
		Arrays.sort(points);
		for(Point p:points) System.out.println(p);
	}
	
}
