
public class MinMax {
	
	int min;
	int max;
	
	public MinMax(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public static MinMax minMaxInArray(int[] array)
	{
		int min = array[0];
		int max = array[0];
		for(int i : array) {
			if (i > max) max = i;
			if (i < min) min = i;
		}
		return new MinMax(min, max);
	}

	public static void main(String[] args) {
		int[] a = {3, 6, 9, 1, 23, 18};
		int[] b = {3, 6, 9, 1, 29, 1};
		int[] c = {3, 6, 9, 1, 23, 8};
		int[] d = {3, 6, 9, 1, 23, 2};
		int[] e = {3, 6, 9, -1, 23, 18};
		MinMax[] m = new MinMax[5];
		m[0] = minMaxInArray(a);
		MinMax minMaxB = minMaxInArray(b);
		m[1] = minMaxB;
		m[2] = minMaxInArray(c);
		m[3] = minMaxInArray(d);
		m[4] = minMaxInArray(e);
		System.out.println("Min: " + m[0].min + " Max: " + m[0].max);
		System.out.println("Min: " + m[1].min + " Max: " + m[1].max);
		
	}
	
	
}
