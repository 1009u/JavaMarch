package oopsConcepts.encapsulation.polimorphism;

public class MethodOverloadingDemo {
    void add(int a){
        System.out.println(a);

    }

    void add(int a, int b){
        int sum=a+b;
        System.out.println("Addition a and b...."+sum);
    }

    void add(int a, int b, int c){
        int sum2=a+b+c;
        System.out.println("Addition a,b,c ..."+sum2);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo object=new MethodOverloadingDemo();
        object.add(23);
        object.add(65,89);
        object.add(34,55,89);
    }
}
