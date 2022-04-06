package java_8_important.sorting;

import model.Person;

import java.util.ArrayList;

public class Find_Greater_Age {
    public static void main(String[] args) {
        ArrayList<Person> person=new ArrayList<>();
        person.add(new Person("John",33,899839));
        person.add(new Person("JayDeep",65,4525667));
        person.add(new Person("Ritu",23,45352));

        person.stream().filter(Age->(Age.getAge()>32)).forEach(Age -> System.out.println(Age.getName()));
    }
}
