//Author: You
//Purpose: This program calculates a person's dept-to-income ratio

public class DToIRatio
{
	public static void main(String[] args)
	{
		int ratio = 0;

		// step 1
		// debt per month is 1200
		// income per month is 2300
		// declare and initalize variables needed
		int debt = 1200;
		int income = 2300;

		// step 2
		// debt-to-income ratio is debt/income multiplied by 100, no decimal places please!
		// put equation below and store result in ratio
	  ratio = (int)((double)debt/income * 100);
		System.out.println("The debt-to-income ratio is: " + ratio + "%");
		// note: anything over 43% is not very good
	}
}
