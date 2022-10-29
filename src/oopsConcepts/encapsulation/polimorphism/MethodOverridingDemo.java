package oopsConcepts.encapsulation.polimorphism;

public class MethodOverridingDemo {
    void person(){
        System.out.println("He can Run.");
    }
    public static void main(String[] args) {
        MethodOverridingDemo obj=new MethodOverridingDemo();
        obj.person();
    }
}
