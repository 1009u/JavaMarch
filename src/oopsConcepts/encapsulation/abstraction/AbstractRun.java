package oopsConcepts.encapsulation.abstraction;

public  class AbstractRun extends LaptopAbstract{

    public void Greet(){
        System.out.println("Good AfterNoon..");
    }
    public static void main(String[] args) {
 AbstractRun o =new AbstractRun();
 o.Greet();
 LaptopAbstract obj=new LaptopAbstract() {
     @Override
     public String getBrand() {
         return super.getBrand();
     }

     @Override
     public void setBrand(String brand) {
         super.setBrand(brand);
     }

     @Override
     public int getPrice() {
         return super.getPrice();
     }

     @Override
     public void setPrice(int price) {
         super.setPrice(price);
     }

     @Override
     public int getRam() {
         return super.getRam();
     }

     @Override
     public void setRam(int ram) {
         super.setRam(ram);
     }

     @Override
     public int hashCode() {
         return super.hashCode();
     }

     @Override
     public boolean equals(Object obj) {
         return super.equals(obj);
     }

     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }

     @Override
     public String toString() {
         return super.toString();
     }

     @Override
     protected void finalize() throws Throwable {
         super.finalize();
     }
 };

    }
}
