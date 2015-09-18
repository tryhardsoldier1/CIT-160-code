//A driver class for our Clock class

public class ClockTest{
  public static void main(String[] args){
      Clock obj1 = new Clock();
      obj1.incrementSeconds();
      obj1.printTime();
      Clock obj2 = new Clock();
      obj2.setTime(10:12:55);
      obj2.printTime();
  }
}
