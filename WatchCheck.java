public class WatchCheck 
{
	private final long beginCheck;
	public WatchCheck()
	{
		beginCheck = System.currentTimeMillis();
	}
	public double timing()
	{
		long endCheck = System.currentTimeMillis();
		return ((endCheck-beginCheck));
	}
}
