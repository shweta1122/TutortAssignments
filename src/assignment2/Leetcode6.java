package assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Leetcode6 {

    public void transpose() {

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};
        int transposed[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i <matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        Integer[][] result = Stream.of(transposed)
                .map(array -> IntStream.of(array).boxed().toArray(Integer[]::new))
                .toArray(Integer[][]::new);
        List<List<Integer>> arr = Arrays.stream(result)
                .map(Arrays::asList)
                .collect(Collectors.toList());

        System.out.println(arr);

    }
}
