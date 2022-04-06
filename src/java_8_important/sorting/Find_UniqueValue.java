package java_8_important.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_UniqueValue {
    public static void main(String[] args) {
        List <String> names= Arrays.asList("Raj","Alex","Ali","Raj","Alex");
        Set<String> name=names.stream().distinct().collect(Collectors.toSet());
        System.out.println(name);
    }
}
