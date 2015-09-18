// Test class for our new Clock class

public class ClockDriver {
  public static void main(String[] args) {
    Clock time = new Clock(); // object from clock class
    time.incrementSeconds();
    time.incrementSeconds();
    time.printTime();

    Clock time2 = new Clock(); // object from clock class
    time2.setTime(11,54,18);
    time2.setHours(12);
    time2.printTime();

  }
}
