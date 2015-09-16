public class Ice03 {
  public static void main(String[] args){
    String obj1 = "Hi";
    String obj2 = "Hello World";

    int obj1Length = obj1.length();
    System.out.println("The length of Hi is: " + obj1Length);
    int obj2Length = obj2.length();
    System.out.println("The length of Hello World is: " + obj2Length);

    int indexOObj1 = obj1.indexOf('o');
    System.out.println("The o in Hi occurs at: " + indexOObj1);
    //System.out.println("The o in Hi occurs at: " + obj1.indexOf('o')); // we can write it this way instead

    int indexOObj2 = obj2.indexOf('o');
    System.out.println("The o in Hello World occurs at: " + indexOObj2);

    int indexOfNextO = obj2.indexOf("o",indexOObj2+1);
    System.out.println("The 2nd o in Hello World occurs at: " + indexOfNextO);

    String upper = obj1.toUpperCase();
    System.out.println("Uppercase obj1: " + upper);
    System.out.println("Uppercase obj2: " + obj2.toUpperCase());
    System.out.println("Lowercase obj1: " + obj1.toLowerCase());
    System.out.println("Lowercase obj2: " + obj2.toLowerCase());

    String world = obj2.substring(6); //holds world
    System.out.println("new string is " + obj1 + world);
    String newWorld = obj1 + world;
  }
}
