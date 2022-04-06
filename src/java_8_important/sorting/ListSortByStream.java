package java_8_important.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortByStream {

    public static void main(String[] args) {
        List<String> list_of_Student = Arrays.asList("Manish", "Kiran", "alex");
        List<String> sortedList = list_of_Student.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
