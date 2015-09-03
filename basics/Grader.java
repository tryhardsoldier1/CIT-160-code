// Simple grader program
// September 2nd, 2015
// Author: Alicia McNett

public class Grader {
  public static void main(String[] args){
    int grade1 = 79;
    int grade2 = 80;
    int grade3 = 80;
    double average = ((grade1 + grade2 + grade3) / 3.0);
    int roundedAverage = (int)Math.round(average);
    System.out.println("The average is " + roundedAverage);

    int random = (int)(Math.random()*10+1);
    System.out.println("Random number is " + random);
  }
}
