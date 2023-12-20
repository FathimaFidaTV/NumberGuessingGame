package numberGame;
import java.util.Scanner;
public class NumberGuessGame {
     public static void main(String[] args) {
		int randomNumber = (int) (Math.random()* 100) + 1;
		boolean hasWon = false;
		System.out.println("I have randomly chosen a number between 1 and 100\n" +"Take a guess let's go:");
		
		
		Scanner scan = new Scanner(System.in);
		for(int i=10; i >0; i--) {
			System.out.println("You have " +i +" guess(es) left. Choose:");
			int guess = scan.nextInt();
			System.out.println("your guess was: " +guess);
			if(randomNumber < guess) {
				System.out.println("It's smaller than this");
			}else if(randomNumber > guess) {
				System.out.println("It's greater than this");
			}else {
				hasWon = true;
				break;
			}
		}
		if(hasWon) {
			System.out.println("CONGRATULATIONS....YOU WON!!!");
		}
		else{
			System.out.println("OOPS!YOU LOST ...BETTER LUCK NEXT TIME");
		}
		
	}
}
