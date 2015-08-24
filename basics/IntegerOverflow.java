// Simple program demonstrating an integer overflow

public class IntegerOverflow {
  public static void main(String[] args){
    byte sheep = 127;
    System.out.println("I'm counting sheep and there are " + sheep + " of them. Baaa! ");
    sheep++;
    System.out.println("I'm counting sheep and there are " + sheep + " of them. Baaa! ");
  }
}
