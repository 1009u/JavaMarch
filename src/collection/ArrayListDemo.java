package collection;

import model.Employees;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Employees> employees = new ArrayList<>();
         Employees employees1= new Employees("Kem",2335,2);
         Employees employees2=new Employees("Rose",8477,1);

        employees.add(employees1);
        employees.add(employees2);

        //advance for_loop for print table
        for (Employees table: employees){
            System.out.println("Name of Employee :"+table.getName());
            System.out.println("Salary of Employee :"+table.getSalary());
            System.out.println("ID no. of Employee :"+table.getId_no());
        }
    }
}
