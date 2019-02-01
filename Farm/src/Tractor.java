
public class Tractor implements FarmObject {
	
	public String makesSound() {
		return "rumble";
	}
	
	public static void main(String[] args) {
		FarmObject f = new Tractor();
		FarmObject g  = new Cat();
		System.out.println("Something on the farm goes " + f.makesSound());
		System.out.println("Something else on the farm goes " + g.makesSound());

	}

}
