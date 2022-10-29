package java_8_important.sorting.sortingAgain;

import model.Employees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class EmpMaxSalary {
    public static void main(String[] args) {
        ArrayList<Employees> employees =new ArrayList<>();
        employees.add(new Employees("Sailendra",56200,13));
        employees.add(new Employees("Sonu",6800,17));
        employees.add(new Employees("Ritu",89001,76));

       Optional<Object> maxSalary= employees.stream().max(Comparator.comparingInt(Employees::getSalary))
               .map(e->e.getSalary());




    }
}
