package java_8_important.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Find_Duplicate_ByFilter {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(3,4,6,4,36,4,3,5,4);
        Set<Integer> duplicateNumber = new HashSet<>();
        Set<Integer> dupNum = numbers.stream().filter(integer -> !duplicateNumber.add(integer)).collect(Collectors.toSet());
        System.out.println(dupNum);
    }
}
