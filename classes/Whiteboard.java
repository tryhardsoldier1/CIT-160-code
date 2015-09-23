// Author: Alicia
// Date: 9/22/15
// Purpose:  User-defined class that represents a whiteboard
public class Whiteboard{
    private double length; //attributes
    private double width;

    public Whiteboard(){ //default constructor
      length = 0;
      width = 0;
      System.out.println("Thanks a creating a whiteboard!");
    }

    public void printInfo(){
      System.out.println("Len: " + length + " Wid: " + width);
    }

    public void setLength(double l){ //setter aka mutator
      length = l;
    }

    public double getLength(){ //getter aka accessor
      return length;
    }
}
