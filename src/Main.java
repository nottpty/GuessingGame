/**
 * 
 * @author Patinya Yongyai
 *
 */
public class Main {
	/**
	 * Main for running GameConsole
	 * @param args
	 */
	public static void main(String[] args){
		GuessingGame game = new GuessingGame(100);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
