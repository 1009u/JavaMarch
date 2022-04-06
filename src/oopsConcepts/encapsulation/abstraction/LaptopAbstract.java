package oopsConcepts.encapsulation.abstraction;


public abstract class LaptopAbstract {
    String brand;
    int price;
     int ram;

   public LaptopAbstract(String brand, int price, int ram) {
      this.brand = brand;
      this.price = price;
      this.ram = ram;
   }

   public LaptopAbstract() {

   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public int getRam() {
      return ram;
   }

   public void setRam(int ram) {
      this.ram = ram;
   }
}
