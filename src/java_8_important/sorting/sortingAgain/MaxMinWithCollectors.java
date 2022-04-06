package java_8_important.sorting.sortingAgain;

import model.Employees;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
                                //incomplete
public class MaxMinWithCollectors {
    static List<Employees> employeesList = Arrays.asList(new Employees("Gaurav",5600,7679),
            new Employees("Sonu",67000,76));

    public static void main(String[] args) {

        Optional<Employees> maxSalaryEmp = employeesList.stream().max(Comparator.comparing(Employees::getSalary));
        System.out.println("Employee with maximum salary..."+(maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not applicable"));
    }
}
