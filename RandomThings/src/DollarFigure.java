
public class DollarFigure {

	public static void main(String[] args) {
		for (int row=0; row <7; row++) {
			String star1 = "";
			String dollars = "";
			for(int s1=0; s1<2*row; s1++){
				star1 += "*";
			}
			System.out.print(star1);
			for(int dol=0; dol<7-row; dol++) {
				dollars += "$";
			}
			System.out.print(dollars);
			for(int s2=0; s2<14-2*row; s2++){
				System.out.print("*");
			}
			System.out.println(dollars+star1);
		}
	}
}
