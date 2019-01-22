
public class Rectangle extends Quadrilateral {

	private static final double A = Math.PI/2;
	private double h;
	private double w;
	
	public Rectangle(double h, double w) {
		super(h,A,w,A,h,A,w,A);
		this.h = h;
		this.w = w;
	}
	
	public double getArea() {
		return h*w*Math.PI;
	}

	public void draw() {
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		double a = Math.PI/2;
		Quadrilateral q = new Rectangle(4, 4);
		System.out.println("The area of q is "+q.getArea()+
				" and the perimeter is " + q.getPerimeter());
		if(q instanceof Rectangle) {
			Rectangle r = (Rectangle)q;
			r.draw();
		}
	}
}
