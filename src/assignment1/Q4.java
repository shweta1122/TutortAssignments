package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public void printAlternate() {
        System.out.println("Question 4");
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i+=2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
