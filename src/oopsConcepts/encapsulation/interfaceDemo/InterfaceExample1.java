package oopsConcepts.encapsulation.interfaceDemo;

 interface InterfaceExample1 {

        int a = 10;
        void display();
 }
 // class in interface
class InterfaceRun implements InterfaceExample1{
     public void display(){
         System.out.println("Interface Example....");
     }


     public static void main(String[] args) {
         InterfaceRun obj=new InterfaceRun();
         obj.display();
         System.out.println(a);
     }
 }
