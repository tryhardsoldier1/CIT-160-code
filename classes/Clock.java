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
		System.out.println("All zeros set!");
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
		seconds = secs;
	}

	// mutator aka setter
	public void setHours(int hrs){
		hours = hrs;
	}

	// mutator aka setter
	public void setMinutes(int mins){
		minutes = mins;
	}

	// mutator aka setter
	public void setSeconds(int secs){
		seconds = secs;
	}

}//end of class
