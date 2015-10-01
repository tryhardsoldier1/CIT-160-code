// 9.29.15 Simple class to demonstrate difference between passing different types of data

class Grade{

    private double average;

    public Grade(){
        average = 0;
    }

    public Grade(double a){
        average = a;
    }

    public void setAverage(double a){
        average = a;
    }

    public void printAverage(){
        System.out.println("The average is " + average);
    }
}

public class TestGrade{

    public static void main(String[] args){
        // Scenario 1: Creating the grade object via default constructor
        Grade obj1 = new Grade(); // did this work?
        obj1.printAverage();

        // Scenario 2: What happens?
        double newAverage = 80;
        obj1.setAverage(80);
        obj1.printAverage();

        // Scenario 3: What happens when you use static methods (foo vs foo2)?
        foo(newAverage);
        System.out.println("After Foo: The average is " +newAverage);

        foo2(obj1);
        System.out.print("After Foo2: ");
        obj1.printAverage();
    }

    public static void foo(double a){
        a = 100; //try to change variable
    }

	  public static void foo2(Grade a) {
        a.setAverage(100); //try to change object
    }
}
