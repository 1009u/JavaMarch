package oopsConcepts.encapsulation.polimorphism;

public class MethodOveridingRun extends MethodOverridingDemo{
    void person(){
        System.out.println("He can go Office.");
    }

    public static void main(String[] args) {
        MethodOverridingDemo obj=new MethodOverridingDemo();
        obj.person();
        MethodOveridingRun obj2=new MethodOveridingRun();
        obj2.person();
    }

}
