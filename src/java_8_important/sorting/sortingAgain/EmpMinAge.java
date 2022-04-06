package java_8_important.sorting.sortingAgain;


import model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpMinAge {
    public static void main(String[] args) {
        List<Person> person=new ArrayList<>();
        person.add(new Person("Mac",34,6577));
        person.add(new Person("Azad",43,9879));
        person.add(new Person("BheemRao",25,874994));

        Optional<Person> minAgeEmp = person.stream().collect(Collectors.minBy(Comparator.comparing(Person::getAge)));

    }
}
