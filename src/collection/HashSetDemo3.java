package collection;

import model.Board;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        HashSet<Board> set= new HashSet<>();
        set.add(new Board("Nokia",6753) );
        set.add(new Board("Okaya",9870));
        set.add(new Board("Nokia",6753) );
        set.add(new Board("Okaya",9870));

        for (Board b:set){
            System.out.println(b.getBrand()+" "+b.getPrice());
        }
    }
}
