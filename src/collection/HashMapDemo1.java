package collection;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> wire=new HashMap<>();
        wire.put(1,"silver wire");
        wire.put(2,"copper wire");
        wire.put(3,"normal wire");

        System.out.println(wire.get(1));
        System.out.println(wire.get(2));
    }
}
