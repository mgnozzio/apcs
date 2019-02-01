
public class Pig extends Animal {
	
	private boolean dirty;
	
	public Pig(boolean isDirty) {
		// default constructor is invoked implicitly
		this.dirty = isDirty;
	}
	
	public Pig(boolean isCarnivorous, boolean isDirty) {
		// a different constructor may be invoked explicitly
		// instead of the default constructor
		super(isCarnivorous);
		this.dirty = isDirty;
	}
	
	public Pig() {
		// the default constructor may be invoked explicitly
		// if you'd like
		super();
		this.dirty = false;
	}
	
	public boolean isDirty() {
		return this.dirty;
	}
	
	public String makesSound() {
		return "oink";
	}
	
	public static void main(String[] args) {
		Animal a = new Pig(true);
		System.out.println("This animal says " + a.makesSound());
		if(a.isCarnivorous()) {
			System.out.println("The animal is carnivorous.");
		}
	}
	
}
