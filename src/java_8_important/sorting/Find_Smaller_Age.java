package java_8_important.sorting;

import model.Person;

import java.util.ArrayList;

public class Find_Smaller_Age {

    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Kiran",23,87943));
        personArrayList.add(new Person("Rahul",24,456632));
        personArrayList.add(new Person("Karl",21,43552));

        personArrayList.stream().filter(age -> (age.getAge()<22)).forEach(age -> System.out.println(age.getName()));
    }
}
