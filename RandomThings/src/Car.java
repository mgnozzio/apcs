
import java.util.Scanner;
public class Car {

	public static final boolean HAS_ENGINE=true;
	
	public String make;
	public String model;
	public String color;
	
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public String toString() { 
		return "This car is a " + make + " " + model +", and it is " + color + ".";
	}
	
	public String makeAndModel() {
		return make + "  " + model;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What color car do you want?");
		String color = scanner.nextLine();
		System.out.println("What make car do you want?");
		String make = scanner.nextLine();
		System.out.println("What model car do you want?");
		String model = scanner.nextLine();
		Car c = new Car(make, model, color);
		System.out.println(Car.HAS_ENGINE);
		System.out.println(c);
		System.out.println(c.makeAndModel());
		
	}
	
}
