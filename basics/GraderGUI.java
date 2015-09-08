//Author: Alicia McNett
//Purpose:  This program will allow the user to enter as many grades as they want
//and will print the average grade

import javax.swing.*;

public class GraderGUI
{
	public static void main(String[] args)
	{

		double average;
		int flag = 0, total = 0;
		int numGrades =0;

		while(flag >= 0) // loop until the user enters -1
		{
			total = total + flag;
			numGrades++;
			String str = JOptionPane.showInputDialog("Enter a grade, or a negative grade to quit");
			flag = Integer.parseInt(str);
		}

		if(numGrades-1 != 0) // if more than one grade was entered
		{
			System.out.println("total: "+total +" numGrades: " + numGrades);
			average = (total)/(numGrades-1);
		}
		else
			average = 0;

		JOptionPane.showMessageDialog(null,"This is the average: "+ average);

		System.exit(0); // exit cleanly
	}
}
