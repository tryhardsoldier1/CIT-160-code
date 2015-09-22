public class CellPhones {
    private String model; //attribute
    private String brand; //attribute

    public CellPhones(){  //default constructor
      model = "";
      brand = "";
      System.out.println("You've created a cell phone!");
    }

    public void printPhone(){ //another method
      System.out.println("You have a " + brand + " " + model);
    }

    public void setModel(String mod){ //setter or mutator
      model = mod;
    }

    public String getModel(){
      return model;
    }

    public void setBrand(String bran){ //setter or mutator
      brand = bran;
    }
}
