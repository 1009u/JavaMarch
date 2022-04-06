package java_8_important.sorting;

import model.Employees;

import java.util.ArrayList;

public class CollectionSorting {
    public static void main(String[] args) {
        ArrayList<Employees> employees=new ArrayList<>();
        employees.add(new Employees("Gulshan",748890,8));
        employees.add( new Employees("Subhendra", 89930,8));
        employees.add(new Employees("RituRaj",943000,2));
        System.out.println(employees);

    }
}
