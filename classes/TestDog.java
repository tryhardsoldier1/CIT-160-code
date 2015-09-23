//Simple class to demonstrate difference between passing different types of data

class Dog{

    private String name;
    
    public Dog(){
        name = "";
    }
    
    public Dog(String s){
        name = s;
    }
    
    public void setName(String s){
        name = s;
    }

    public String getName(){
        return "Dog's name is " + name;
    }
}

public class TestDog{

    public static void main(String[] args){
        // creating the "Max" dog
        Dog aDog = new Dog("Max"); 
        System.out.println(aDog.getName());
    }
    
    public static String foo(String s){
        s = "Buster";
    }
	
	public static void foo2(Dog d) { 
    // change name to "Fuffy"
      d.setName("Fluffy");
    }
}


