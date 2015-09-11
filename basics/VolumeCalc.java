// The following code calculates the volume of a sphere
// Date: 9/07/15

import java.util.Scanner; //needed to create keyboard object below

public class VolumeCalc{
  public static void main(String[] args) {
    double sphereDiam;
    double sphereRadius;
    double sphereVolume;
    String name;

    // Use scanner class to create an object called keyboard
    // This will allow us to read content from the command line (standard input)
    Scanner keyboard = new Scanner(System.in);

    // Prompt for your name on the line below
    System.out.print("Please enter your name ");

    // Retrieve and store the name on the line below
    name = keyboard.next();

    System.out.print("Enter the diamater of a sphere:");
    sphereDiam = keyboard.nextDouble();
    sphereRadius = (sphereDiam / 2.0);

    // sphere volume is 3/4 * PI * the radius cubed
    sphereVolume = ( 4.0 / 3.0 ) * 3.14 * Math.pow( sphereRadius, 3 );

    // add the name to the existing line of code below (ex: Bob, the volume is...)
    System.out.println(name + ", the volume is: " + sphereVolume);
  }
}
