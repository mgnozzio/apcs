import java.util.Scanner;
import java.util.Random;

public class SilverDollarGame {

	/* This class only implements one method, the main method
	 * that actually runs the game.  It must do three things:
	 * 1. It must ask the players for a maximum number of coins.  
	 * 2. It must allow the players to play multiple games, until
	 * they decide they've played enough (use a sentinel loop).
	 * Each game should begin with a random number of coins.  
	 * Hint: use the swap algorithm to alternate between players
	 * 3. It must keep track of how many games have been played
	 * and the number of games won by each player. 
	 */
	
	public static void main(String[] args) {
		Random r = new Random();
		String playAgain = "yes";
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to the silver dollar game!");
		int maxCoins = 0;
		while(maxCoins <= 3) {
			System.out.println("Please enter a maximum number of coins (>3): ");
			maxCoins = s.nextInt();
		}
		HumanPlayer p1 = new HumanPlayer(s, 1);
		HumanPlayer p2 = new HumanPlayer(s, 2);
		int p1Wins = 0;
		int p2Wins = 0;
		do {
			int numCoins = r.nextInt(maxCoins-3)+3;
			CoinStrip board = new CoinStrip(numCoins);
			System.out.println("Initial Board: "+board);
			HumanPlayer currentPlayer = p2;
			HumanPlayer nextPlayer = p1;
			while(! board.gameOver()) {
				HumanPlayer temp = currentPlayer;
				currentPlayer = nextPlayer;
				nextPlayer = temp;
				currentPlayer.play(board);
			}
			if(currentPlayer == p1) p1Wins++;
			else p2Wins++;
			s.nextLine();
			System.out.println(currentPlayer + " wins! Play again (yes/no)?");
			playAgain = s.nextLine().trim().toLowerCase();
		} while (playAgain.equals("yes"));
		System.out.println("Player 1 won "+p1Wins+" games. Player 2 won "+p2Wins+"." );
	}
	
}
