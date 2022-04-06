package java_8_important.sorting.sortingAgain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSort {

    public static void main(String[] args) {
        List<String > Name=new ArrayList<>();
        Name.add("Abirami Sriramulu");
        Name.add("Vijay Xess");

        List <String> sortedList= Name.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
