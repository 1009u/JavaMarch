package collection;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> nameOfcountry = new Hashtable<>();
        nameOfcountry.put(7, "India");
        nameOfcountry.put(5, "England");
        nameOfcountry.put(3,"America");


        nameOfcountry.forEach((key, value) -> System.out.println(key + " " + value));

    }

}
