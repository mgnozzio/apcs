import java.util.ArrayList;
import java.util.Random;
public class CoinStrip {

	ArrayList<Integer> board;
	int numCoins;
	
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
		board = new ArrayList<Integer>();
		Random r = new Random();
		this.numCoins = numCoins;
		int coinIndex = 1;
		for(int i=0; coinIndex <= numCoins; i++) {
			if(r.nextBoolean()) {
				board.add(coinIndex);
				coinIndex++;
			}
			else {
				board.add(0);
			}
		}
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
		int oldIndex = board.indexOf(coin);
		if(oldIndex<0 || oldIndex-numSpaces<0) return false;
		for(int i=oldIndex-1; i>=oldIndex-numSpaces; i--) {
			if(board.get(i) != 0) return false;
		}
		return true;
	}
	
	/* This method checks to see if there are any more
	 * valid moves.  It returns false if all the coins
	 * have moved as far to the left as possible.  
	 * Otherwise it returns true.
	 */
	public boolean gameOver() {
		for(int i=0; i<numCoins; i++) {
			if(board.get(i) == 0) return false;
		}
		return true;
	}
	
	/* This method actually manipulates the underlying
	 * board.  It performs the specified move, removing
	 * the coin from its previous slot and moving it to
	 * a new one.  (Hint: use set rather than remove)
	 */
	public void move(int coin, int numSpaces) {
		int oldIndex = board.indexOf(coin);
		board.set(oldIndex-numSpaces, coin);
		board.set(oldIndex,0);
	}
	
	/* This method renders the board as a string
	 * that can be printed nicely to the console. 
	 */
	public String toString() {
		String s = "";
		for(int i : board) {
			if(i==0) s += " _ ";
			else s+= " " + i + " ";
		}
		return s;
	}
	
}
