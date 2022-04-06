package collection;

import java.util.Hashtable;

public class HashMapDemo {
    void Players_score(){
        Hashtable <Integer,String> score=new Hashtable<>();
        score.put(1,"199");
        score.put(2,"234");
        score.put(3,"Retired Heart");

        System.out.println(score.get(0)); // Note HashMap never show null key value it starts with index 1
        System.out.println(score.get(1));
        System.out.println(score.get(2));

    }
    public static void main(String[] args) {
        HashMapDemo obj=new HashMapDemo();
        obj.Players_score();

    }
}
