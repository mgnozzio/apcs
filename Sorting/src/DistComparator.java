import java.util.Arrays;
import java.util.Comparator;

public class DistComparator implements Comparator<Point> {

	private static double getDistance(Point p) {
		double x = p.getX();
		double y = p.getY();
		return Math.sqrt(x*x+y*y);
	}
	
	public int compare(Point p1, Point p2) {
		double d1 = getDistance(p1);
		double d2 = getDistance(p2);
		return Double.compare(d1, d2);
	}
	
	public static void main(String[] args) {
		int num_points = 20;
		Point[] points = new Point[num_points];
		for(int i=0; i<num_points; i++) {
			double x = Math.sqrt(i);
			double y = Math.cos(i);
			points[i] = new Point(x,y);
		}
		DistComparator dComp = new DistComparator();
		Arrays.sort(points, dComp);
		for(Point p:points) System.out.println(p);
	}
}
