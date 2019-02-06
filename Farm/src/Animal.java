
public abstract class Animal implements FarmObject {
	
	private boolean carnivorous; 
	
	public Animal(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

	public Animal(String name) {
		this.carnivorous = false;
	}
	
	public boolean isCarnivorous() { return this.carnivorous; };
	
	public abstract String makesSound();
	
}
