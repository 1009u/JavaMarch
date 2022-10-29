package collection;

import model.Person;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList <Person> arrayList=new ArrayList<>();
        arrayList.add(new Person("Kamal",32,3200));
        arrayList.add(new Person("manish",30,45890));

        for (Person var:arrayList){
            System.out.println(var.getName()+" "+var.getAge()+" "+var.getSalary());
        }
    }
}
