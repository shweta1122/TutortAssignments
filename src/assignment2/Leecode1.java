package assignment2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Leecode1 {
    public static int getMaxSum() {
        System.out.println("Leetcode 1");
        int[][] numbers = {{1, 2, 3}, {3, 2, 1}};
        Integer[][] result = Stream.of(numbers)
                .map(array -> IntStream.of(array).boxed().toArray(Integer[]::new))
                .toArray(Integer[][]::new);
        int sum = 0;
        List<List<Integer>> list = Arrays.stream(result)
                .map(Arrays::asList)
                .toList();
        for (List<Integer> data :
                list
        ) {
            int eachSum = data.stream().mapToInt(number -> (int) number).sum();
            if (eachSum > sum) {
                sum = eachSum;
            }
        }

        return sum;


    }
}
