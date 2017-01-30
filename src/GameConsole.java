import java.util.Scanner;

/**
 * The GameConsole class interacts with the user.
 * @author Patinya Yongyai
 * @version 20.01.2017
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
		String titleString = "Guessing Game";
		String promptString = "Your guess?   ";
		System.out.println(titleString);
		System.out.println(game.getHint());
		do{
			System.out.print(promptString);
			input = scanner.nextInt();
			game.guess(input);
			System.out.println(game.getHint());
		}while(!game.getStatus());
		return 1;
	}
}
