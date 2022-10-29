package oopsConcepts.encapsulation.polimorphism;

public class MethodOveriding extends  MethodOverloadingDemo {

    int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
         MethodOveriding obj=new MethodOveriding();
         obj.add(9,67);    // by the overLoading
        int  division = obj.divide(78,3);
        System.out.println("Overriding class's Division a and b :"+division);
        MethodOverloadingDemo obj2=new MethodOverloadingDemo();
        int addition =obj2.add(23,343,65);
        System.out.println(addition);

    }
}

