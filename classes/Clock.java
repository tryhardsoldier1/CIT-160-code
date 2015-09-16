public class Clock
{
	//declare attributes
	private int hours;
	private int minutes;
	private int seconds;

	public Clock()   // default constructor
	{
		hours = 0;
		minutes = 0;
		seconds = 0;
	}//end of constructor

	public void printTime()
	{
		System.out.println(hours+":"+minutes+":"+seconds);
	}

	public void incrementSeconds()
	{
		seconds++;
	}

	public void setTime(int hrs, int mins, int secs)
	{
		hours = hrs;
		minutes = mins;
		secs = seconds;
	}

}//end of class
