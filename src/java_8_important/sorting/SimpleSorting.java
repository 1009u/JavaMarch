package java_8_important.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleSorting {
    public static void main(String[] args) {
        List <String> cities=new ArrayList<>();
        cities.add("Kanpur");
        cities.add("Pune");
        cities.add("Jaipur");

        Collections.sort(cities);
        for (String var:cities){
            System.out.println(""+var);
        }

    }
}
