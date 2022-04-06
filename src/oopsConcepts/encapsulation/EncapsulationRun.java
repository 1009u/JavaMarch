package oopsConcepts.encapsulation;


public class EncapsulationRun {
    void Run(){
        System.out.println("This is EncapsulationRun Method...");
    }
    public static void main(String[] args) {
        EncapsulationRun obj=new EncapsulationRun();
        obj.Run();
        //we will create object of Encapsulation Demo
        EncapsulationDemo encap =new EncapsulationDemo();
        encap.setName("Devil");
        encap.setId_no(7);
        encap.setDepartment("Application Developer");

        //for print values
        System.out.println("Name...."+encap.getName());
        System.out.println("ID of Employee...."+encap.getId_no());
        System.out.println("Department of Employee..."+encap.getDepartment());
    }
}
