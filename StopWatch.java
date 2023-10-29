import java.time.Instant;
public class StopWatch 
{
	private long beginCheck = 0;
	public void WatchCheck()
	{
		beginCheck = System.nanoTime();
	}
	
	public long timing()
	{
		long endCheck = System.nanoTime();

		return (((endCheck-beginCheck)/(1000000)));
		
	}
}

