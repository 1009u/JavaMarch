package oopsConcepts.encapsulation.polimorphism;

public class MethodOveriding extends  MethodOverloadingDemo {

    int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
         MethodOveriding obj=new MethodOveriding();
         obj.add(9);    // by the overLoading
        int  division = obj.divide(78,3);
        System.out.println(division);
    }
}

