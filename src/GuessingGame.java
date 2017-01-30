import java.util.Random;
/**
 * Game of guessing a secret number.
 * @author Patinya Yongyai
 * @version 20.01.2017
 */

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int counter;
	private boolean status;
	
	/**
	 * Initialize a new game.
	 * @param upperBound is max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound){
		this.upperBound = upperBound;
		secret = getRandomNumber(upperBound);
		hint = "I'm thinking of a number between 1 and "+upperBound;
		counter = 0;
		status = false;
	}
	
	/**
	 * 
	 * @return number of guesses
	 */
	public int getCount(){
		return counter;
	}
	
	/**
	 * For counting guesses from user
	 */
	public void count(){
		++counter;
	}
	
	/**
	 * Check status of guessing game.
	 * @return current status of guessing game. 
	 */
	public boolean getStatus(){
		return this.status;
	}
	
	/**
	 * Check a number from user to show hint to user
	 * @param number is a number from user
	 * @return true if a number from user equal with secret number. Return false if a number from user not equal with a secret number.
	 */
	public boolean guess(int number){
		count();
		if(number == secret){
			setHint("\nCorrect. The secret is "+secret+".\nYou used "+getCount()+" guesses.");
			status = true;
			return true;
		}
		else if(number < secret){
			setHint("Sorry, your guess is too small.");
		}
		else{
			setHint("Sorry, you're guess is too large.");
		}
		return false;
	}
	
	/**
	* Return a hint based on the most recent guess.
	* @return hint based on most recent guess
	*/
	public String getHint(){
		return hint;
	}
	
	/**
	 * Set a hint based.
	 * @param hint is hint from guess method
	 */
	protected void setHint(String hint){
		this.hint = hint;
	}
	
	/**
	* Create a random number between 1 and limit.
	* @param limit is the upper limit for random number
	* @return a random number between 1 and limit (inclusive)
	*/
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis( );
		Random rand = new Random( seed );
	return rand.nextInt(limit) + 1;
	}
}
