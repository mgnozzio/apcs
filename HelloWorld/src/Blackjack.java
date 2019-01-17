import java.util.Scanner;
import java.util.Random;
public class Blackjack {
	
	public static String nextCard(Random r) {
		int i = r.nextInt(13) + 1;
		if(i == 1) return "A";
		else if (i==11) return "J";
		else if (i==12) return "Q";
		else if (i == 13) return "K";
		else return ""+i;
	}
	
	public static int cardValue(String card, int score) {
		if(card == "A" && score + 11 <= 21) return 11;
		else if(card == "A") return 1;
		else if (card == "J" || card=="Q" || card=="K") return 10;
		else return Integer.parseInt(card);
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int playerScore = 0;
		int dealerScore = 0;
		System.out.println("Welcome player!");
		String card = nextCard(r);
		System.out.println("Your first card is a " + card);
		playerScore += cardValue(card, playerScore);
		card = nextCard(r);
		playerScore += cardValue(card, playerScore);
		System.out.println("Your second card is a " + card + " (score = "+playerScore +")");
		card = nextCard(r);
		dealerScore += cardValue(card, dealerScore);
		System.out.println("The dealer shows " + card);
		do {
			System.out.println("Would you like another card? (Y/N)");
			card = nextCard(r);
			playerScore += cardValue(card, playerScore);
			System.out.println("Your next card is a " + card + " (score = "+playerScore +")");
		} while(s.nextLine().toLowerCase().startsWith("y") && playerScore < 21);
		if(playerScore > 21) {
			System.out.println("Bust!  You lose!");
		} else if(playerScore <= 21) {
			for(card=nextCard(r); dealerScore<17; card=nextCard(r)) {
				dealerScore += cardValue(card, dealerScore);
				System.out.println("Dealer hits and gets a "+card + " (score = " + dealerScore +")");
				if(dealerScore > 21) {
					System.out.println("Dealer busts!  You win!");
					break;
				}
			}
			if (dealerScore <= 21) {
				System.out.println("Dealer stands");
				if(playerScore > dealerScore) { 
					System.out.printf("You win! (%d vs. %d)\n", playerScore, dealerScore);
				} else {
					System.out.printf("You lose! (%d vs. %d) Better luck next time.", playerScore, dealerScore);
				}
			}
		}
	}
}
