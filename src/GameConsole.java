import java.util.Scanner;
import static java.lang.System.out;

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
		boolean gameOver = false;
		String titleString = "Guessing Game";
		String promptString = "Your guess?   ";
		out.println(titleString);
		out.println(game.getHint());
		while(!gameOver){
			out.print(promptString);
			input = scanner.nextInt(); scanner.nextLine();	//Feed scanner's issue
			gameOver = game.guess(input);
			out.println(game.getHint());
		}
		scanner.close();
		return 1;
	}
}
