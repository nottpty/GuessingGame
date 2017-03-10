package ui;
import java.util.Scanner;

import game.GuessingGame;

/**
 * The GameConsole class interacts with the user.
 * @author Patinya Yongyai
 * @version 1.02.2017
 */
public class GameConsole {
	
	/**
	 * For control system of GuessingGame
	 * @param game for calling some method from GuessingGame
	 * @return the solution (the guessed secret)
	 */
	public int play(GuessingGame game){
		Scanner scanner = new Scanner(System.in);
		int input;
		boolean gameOver = false;
		String titleString = "Guessing Game";
		String promptString = "Your guess?   ";
		System.out.println(titleString);
		System.out.println(game.getHint());
		while(!gameOver){
			System.out.print(promptString);
			input = scanner.nextInt();
			gameOver = game.guess(input);
			System.out.println(game.getHint());
		}
		return 1;
	}
}
