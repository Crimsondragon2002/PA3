public class WatchCheck 
{
	private final long beginCheck;
	public WatchCheck()
	{
		beginCheck = System.nanoTime();
	}
	public double timing()
	{
		long endCheck = System.nanoTime();
		Instant endCheck2 = Instant.now();

		return (((endCheck-beginCheck)/(1000000)));
		
	}
}
