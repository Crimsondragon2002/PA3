/*
* Author: Joshua Buscher
* Project: Programming assignment 3- complexity and sorting
* This method creates tools to allow for timing that is seperate from the helf function as a constructor is needed for timing implemenation
*/
public class WatchCheck 
{
	private final long beginCheck;
	/*
	* A constructor that starts a timing
	*/
	public WatchCheck()
	{
		beginCheck = System.nanoTime();
	}
	/*
	* using the time from the constructor, it finds the amount of time that has passed from the constuctor call to the present
	* @returns the time since the constructor was called
	*/
	public double timing()
	{
		long endCheck = System.nanoTime();
		Instant endCheck2 = Instant.now();

		return (((endCheck-beginCheck)/(1000000)));
		
	}
}
