package java_8_important.sorting;


import java.util.*;
import java.util.stream.Collectors;

public class Find_Duplicate {
    public static void main(String[] args) {
        List<Integer> marks= Arrays.asList(2,2,2,4,3,5,3,6,3,2,5,6,7,6,3);
        Set<Integer> duplicateMarks= marks.stream().filter(integer-> Collections.frequency(marks, integer)>1).collect(Collectors.toSet());
        System.out.println(duplicateMarks);
    }
}
