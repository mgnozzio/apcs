import java.util.ArrayList;
import java.util.Random;
public class CoinStrip {

	/* Create an array list to represent the board
	 * and create an instance variable to store
	 * the number of coins.
	 */
	
	/* The Coin strip constuctor should accept
	 * a parameter specifying the number of coins
	 * to use in the game (>3).  Then, it 
	 * should initialize the board, placing the coins
	 * randomly.  The size of the board is not fixed 
	 * in advance. Iteratively add slots to the board as 
	 * needed, flipping a coin to determine if a coin 
	 * will appearin that slot.  Stop when you've put down 
	 * the number of coins that you've randomly selected.   
	 * pre: numSpaces > 3
	 */
	public CoinStrip(int numCoins) {
	}
	
	/* This method should determine whether or not
	 * a coin (identified by its label, not its index)
	 * can be legally moved numSpaces to the left.  
	 * A move is not legal if the coin does not exist,
	 * if the coin lands on another coin, if the coin hops
	 * over another coin, or if the coin moves over the 
	 * board. The method returns true if the specified move
	 * is legal and false otherwise. 
	 */
	public boolean isLegal(int coin, int numSpaces) {
	}
	
	/* This method checks to see if there are any more
	 * valid moves.  It returns false if all the coins
	 * have moved as far to the left as possible.  
	 * Otherwise it returns true.
	 */
	public boolean gameOver() {
	}
	
	/* This method actually manipulates the underlying
	 * board.  It performs the specified move, removing
	 * the coin from its previous slot and moving it to
	 * a new one.  (Hint: use set rather than remove)
	 */
	public void move(int coin, int numSpaces) {
	}
	
	/* This method renders the board as a string
	 * that can be printed nicely to the console. 
	 */
	public String toString() {
	}
	
}
