
public class RandomWalk {
	public static void randomWalk(){
	    int pos = 0;
	    int max = pos;
	    System.out.println("position = "+pos);
	    while(pos > -3 && pos <3){
	        if(Math.random() > 0.5){
	            pos--;
	        } else {
	            pos++;
	            if(pos > max) max = pos;
	        }
	        System.out.println("position = "+pos);
	    }
	    System.out.println("max position = "+max);
	}
	
	public static void main(String[] args) {
		randomWalk();
	}
}
