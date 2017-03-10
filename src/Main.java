

import game.GuessingGame;
import ui.GameUI;

/**
 * A main class to create objects and run the program.
 * @author Patinya Yongyai
 * @version 20.01.2017
 */
public class Main {
	/**
	 * Main for running GameConsole
	 * @param args not used
	 */
	public static void main(String[] args){
		GuessingGame game = new GuessingGame(100);
		GameUI gui = new GameUI( game );
		gui.run();
	}
}
