package collection;


import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(67);
        numbers.add(64);
        numbers.add(28);
        numbers.add(12);
        System.out.println(numbers);


        //for String value
        TreeSet<String> names=new TreeSet<>();
        names.add("Thiruvananthapuram");
        names.add("Prabhas");
        names.add("Ajay");
        System.out.println(names);
    }
}
