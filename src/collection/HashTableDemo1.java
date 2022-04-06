package collection;


import java.util.Hashtable;

public class HashTableDemo1 {
    public static void main(String[] args) {
        Hashtable<String,String> grade = new Hashtable<>();
        grade.put("d","Mohit");
        grade.put("a","RituRaj");
        grade.put("c","Sonu");
        grade.put("b","Ravindra");

        grade.forEach((key , value) -> System.out.println(key+" "+value));
    }
}
