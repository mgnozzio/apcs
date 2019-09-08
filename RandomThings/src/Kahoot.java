public class Kahoot {
	
	public final double PI = 3.1415;
	public final double SQRT2 = 1.414;

	public void method1() {
		final double PI = 3.14;
		final double SQRT2 = 1.41;
		System.out.print(PI + SQRT2);
	}

	public void method2() {
		System.out.print((PI + SQRT2));
	}

	public void method3(){
        System.out.print(PI + " " + SQRT2);
	}

	public static void main(String[] args) {
		Kahoot k = new Kahoot();
		k.method1();
	}
}




