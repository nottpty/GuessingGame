import java.util.Random;
/**
 * Game of guessing a secret number.
 * @author Patinya Yongyai
 */

public class GuessingGame {
	private int upperBound;
	private int secret;
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
	 * @return
	 */
	public int getCount(){
		return counter;
	}
	
	/**
	 * 
	 */
	public void count(){
		++counter;
	}
	
	/**
	 * 
	 * @param number
	 * @return
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
