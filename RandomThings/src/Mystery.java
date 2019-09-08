public class Mystery {
	public static final int MAGIC=3;
	
	public static double mutate(String x){
		return mutate(x, MAGIC);
	}
	
	public static int mutate(String x, int y) {
		if(x.length() > 3 && x.length() < 6) return 45;
		if(x.length() > 2 || x.length() < 7) return 3456;
		return  Integer.parseInt("2" + y + 8);
	}
	
	public static void main(String[] args) {
		String h = "hello";
		System.out.println(mutate(h));
	}
}
