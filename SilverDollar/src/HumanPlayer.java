import java.util.Scanner;
public class HumanPlayer {
	Scanner s;
	int num;
	
	/* The HumanPlayer constructor only needs to
	 * store the information that is passed into it.
	 */
	public HumanPlayer(Scanner s, int playerNumber) {
		this.s = s;
		this.num = playerNumber;
	}
	
	/* The play method takes in the board. It then
	 * repeatedly asks the user for a coin to move
	 * and a number of spaces to move it, until the
	 * user enters a valid move (as determined by the
	 * CoinStrip class).  Then, the player tells the
	 * board to perform the actual move.  
	 */
	public void play(CoinStrip board) {
		boolean legalMove = false;
		int toMove = 0;
		int numSpaces = 0;
		while (!legalMove) {
			System.out.println("Current Board: " + board);
			System.out.println("Which coin would you like to move? ");
			toMove = s.nextInt();
			System.out.println("How many spaces? ");
			numSpaces = s.nextInt();
			legalMove = board.isLegal(toMove, numSpaces);
			if(!legalMove) System.out.println("Please enter a legal move.");
		}
		board.move(toMove, numSpaces);
	}
	
	/* The toString method for the human player
	 * should return a print friendly representation
	 * of the player, including its player number. 
	 * For example: "Player 1"
	 */
	public String toString() {
		return "Player " + num;
	}
}
