package java_8_important.sorting.sortingAgain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(4);
        num.add(23);
        num.add(32);
        num.add(22);

    List <Integer> sortedList=num.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
