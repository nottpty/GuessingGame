import java.util.Scanner;

/**
 * The GameConsole class interacts with the user.
 * @author Patinya Yongyai
 *
 */
public class GameConsole {
	
	/**
	 * For control system of GuessingGame
	 * @param game
	 * @return
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
			game.count();
			System.out.println(game.getHint());
		}while(!game.guess(input));
		return 1;
	}
}
