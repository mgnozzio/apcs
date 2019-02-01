
public abstract class Animal implements FarmObject {
	
	private boolean carnivorous; 
	
	public Animal(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

	public Animal() {
		this.carnivorous = false;
	}
	
	public boolean isCarnivorous() { return this.carnivorous; };
	
	public abstract String makesSound();
	
}
