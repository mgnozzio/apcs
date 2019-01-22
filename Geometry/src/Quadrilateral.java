
public class Quadrilateral {

	private double s1;
	private double s2;
	private double s3;
	private double s4;
	private double a1;
	private double a2;
	private double a3;
	private double a4;
	
	public Quadrilateral(double s1,
			double a1,
			double s2,
			double a2,
			double s3,
			double a3,
			double s4,
			double a4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}
	
	public double getPerimeter() {
		return s1 + s2 + s3 + s4;
	}
	
	public double getArea() {
		double t1 = s1 * s2 * Math.sin(a1) / 2;
		double t2 = s2 * s3 * Math.sin(a3) / 2;
		return t1 + t2;
	}
	
	public static void main(String[] args) {
		double a = Math.PI/2;
		Quadrilateral q = new Quadrilateral(4,a,4,a,4,a,4,a);
		System.out.println("The area of q is "+q.getArea()+
				" and the perimeter is " + q.getPerimeter());
		}
}
