package exceptions;


import java.util.ArrayList;
import java.util.List;

public class UncheckedNullExcep {
    public static void main(String[] args) {
        List <String> names=new ArrayList<>();
        names.add("Ritu");
        names.add("Shaildendra");
        System.out.println(names.get(2)); // it will show IndexOutOfBoundsException bcoz index 2 is not available
    }
}
