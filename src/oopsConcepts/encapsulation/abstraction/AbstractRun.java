package oopsConcepts.encapsulation.abstraction;

public  class AbstractRun extends LaptopAbstract{

    public void Greet(){
        System.out.println("Good AfterNoon..");
    }
    public static void main(String[] args) {
 AbstractRun obj =new AbstractRun();
 obj.Greet();

    }
}
