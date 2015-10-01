public class UseClock{
  public static void main(String[] args) {
    Clock clk = new Clock();
    clk.incrementSeconds();
  //  clk.seconds++; won't work due to access modifier
    clk.printTime();
    Clock clk2 = new Clock();
    clk2.setTime(5, 49, 32);
    clk2.printTime();
    clk2.setHours(5);
    clk2.printTime();

  }
}
