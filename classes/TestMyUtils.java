// Class to test use of static methods

public class TestMyUtils{
	public static void main(String[] args)
	{
		int[] grades = new int[10];
		grades[0] = 80;
		grades[1] = 63;
		grades[2] = 99;
		grades[3] = 76;
		grades[4] = 88;
		grades[5] = 82;
		grades[6] = 84;
		grades[7] = 77;
		grades[8] = 96;
		grades[9] = 87;

		double average = MyUtils.mean(grades);

		System.out.println("the average grade is " + average);
		
	}
}