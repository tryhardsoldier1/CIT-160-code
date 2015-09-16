// The following code calculates the volume of a sphere
// Date: 9/07/15

import javax.swing.*; //needed to use the GUI methods

public class VolumeCalcGUI{
  public static void main(String[] args) {
    double sphereDiam;
    double sphereRadius;
    double sphereVolume;
    String name;
    String diameter;

    //prompt for name
    name = JOptionPane.showInputDialog("Enter your name");

    diameter = JOptionPane.showInputDialog("Enter the diamater of a sphere:");
    sphereDiam = Double.parseDouble(diameter);
    sphereRadius = (sphereDiam / 2.0);

    // sphere volume is 3/4 * PI * the radius cubed
    // HOW DO WE ADD CONSTANT BELOW???
    // final double PI = 3.14;
    sphereVolume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( sphereRadius, 3 );

    JOptionPane.showMessageDialog(null, name + ", the volume is: " + sphereVolume);

    // WHAT IS MISSING AT THE END?????
    System.exit(0);
  }
}
