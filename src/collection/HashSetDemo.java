package collection;

import java.util.HashSet;

public class HashSetDemo {
    void duplicateValue(){
        HashSet<Integer> age=new HashSet<>();
        age.add(43);
        age.add(22);
        age.add(43);
        age.add(88);
        age.add(32);
        age.add(21);
        age.add(32);

        for (Integer ages:age){
            System.out.println(ages);
        }
    }
    public static void main(String[] args) {
      HashSetDemo object=new HashSetDemo();
      object.duplicateValue();
    }
}
