import java.util.Arrays;
import java.util.Comparator;
public class YComparator implements Comparator<Point>{

	public int compare(Point p1, Point p2) {
		return Double.compare(p1.getY(), p2.getY());
	}
	
	public static void main(String[] args) {
		int num_points = 20;
		Point[] points = new Point[num_points];
		for(int i=0; i<num_points; i++) {
			double x = Math.sqrt(i);
			double y = Math.cos(i);
			points[i] = new Point(x,y);
		}
		YComparator yComp = new YComparator();
		Arrays.sort(points, yComp);
		for(Point p:points) System.out.println(p);
	}
	
}
