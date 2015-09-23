public class WhiteboardTest{
  public static void main(String[] args){
    Whiteboard obj1 = new Whiteboard(); //create obj
    Whiteboard obj2 = new Whiteboard();
    obj1.printInfo(); // method call
    obj2.printInfo(); // method call
    obj1.setLength(4.0);
    obj1.printInfo();
    System.out.println("Obj1 length is " + obj1.getLength() );
  }
}
