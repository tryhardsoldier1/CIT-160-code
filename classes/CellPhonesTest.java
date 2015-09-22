public class CellPhonesTest{
  public static void main(String[] args){
      CellPhones bobs = new CellPhones();
      bobs.setModel("6s"); //setter aka mutator
      bobs.setBrand("iPhone"); //setter
      String model = bobs.getModel();
      bobs.printPhone();

      CellPhones anns = new CellPhones();
      anns.setModel("Galaxy s6");
      anns.setBrand("Android");
      anns.printPhone();
  }
}
