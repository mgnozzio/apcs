
public class Cat extends Animal {

	public Cat() {
		super(true);
	}
	
	public String makesSound() { return "meow"; }
	
	public static void main(String[] args) {
		Animal a = new Cat();
		System.out.println("This animal says " + a.makesSound());
		if(a.isCarnivorous()) {
			System.out.println("The animal is carnivorous.");
		}
	}
	
}
