package assignment1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q1 {
    public static int sum() {
        System.out.println("Question 1");
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        return IntStream.of(numbers).sum();


    }
}
