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
                new GameConsole().play(new GuessingGame(100));
	}
}
