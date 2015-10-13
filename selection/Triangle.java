import java.util.Scanner;  // Needed for the Scanner class

/**
 * Date: October 2015
 * Purpose: This program correctly identifies the type of triangle given the side lengths. 
 */

public class Triangle
{
   public static void main(String[] args)
   {
      int side1, side2, side3; // Three sides

      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      // Get a side1.
      System.out.print("Enter first side: ");
      side1 = keyboard.nextInt();
      
      // Get a side2
      System.out.print("Enter second side: ");
      side2 = keyboard.nextInt();

      // Get a side3
      System.out.print("Enter third side: ");
      side3 = keyboard.nextInt();

      //test to see if it is a valid triangle
	  //if it is valid, what kind of triangle is it?
   }
}
