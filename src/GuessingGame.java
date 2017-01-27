import java.util.Random;
/**
 * Game of guessing a secret number.
 * @author Patinya Yongyai
 * @version 20.01.2017
 */

public class GuessingGame {
	private final int upperBound;
	private final int secret;
	private String hint;
	private int counter;
	
	/**
	 * Initialize a new game.
	 * @param upperBound is max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound){
		this.upperBound = upperBound;
		secret = getRandomNumber(upperBound);
		hint = "I'm thinking of a number between 1 and "+upperBound;
		counter = 1;	
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
	 * Check a number from user to show hint to user
	 * @param number is a number from user
	 * @return true if a number from user equal with secret number. Return false if a number from user not equal with a secret number.
	 */
	public boolean guess(int number){
		if(number == secret){
			setHint("\nCorrect. The secret is "+secret+".\nYou used "+getCount()+" guesses.");
			return true;
		}
		else if(number < secret){
			setHint("Sorry, your guess is too small.");
		}
		else{
			setHint("Sorry, your guess is too large.");
		}
                this.count();
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
