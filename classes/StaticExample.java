class Stars {
	public static void printIt(){
		System.out.println("*****");
	}
}

public class StaticExample{
	public static void main(String[] args){
		Stars.printIt();
		Stars.printIt();
		Stars.printIt();
	}
}
