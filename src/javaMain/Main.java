package javaMain;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> findDuplicates = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34).toList();
        List<Integer> removeDuplicates = Stream.of(4, 5, 7, 8, 99, 100, 101, 33, 32, 4, 4).toList();
        List<Integer> maxNumber = Stream.of(3, 90, 350, 5).toList();
        List<Integer> maxMin = Stream.of(6, 8, 3, 5, 1, 9).toList();

        System.out.print("Find duplicates: ");
        System.out.println(findDuplicates.stream().filter(number -> Collections.frequency(findDuplicates, number) > 1).collect(Collectors.toSet()));

        System.out.print("Remove duplicates: ");
        System.out.println(removeDuplicates.stream().distinct().collect(Collectors.toList()));

        System.out.print("Max: ");
        System.out.println(maxNumber.stream().max(Comparator.comparing(Integer::valueOf)).get());

        System.out.print("Min / Max: ");
        IntSummaryStatistics stats = maxMin.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats.getMin() + " / " + stats.getMax());

    }
}
