package collection;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<String> car=new HashSet<>();
        car.add("suzuki");
        car.add("sedan");
        car.add("maruti");
        car.add("sedan");
        car.add("odi");
        car.add("sedan");
        for (String cars:car){
            System.out.println(cars);
        }
    }
}
