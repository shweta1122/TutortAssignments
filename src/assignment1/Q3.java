package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public int getCount() {
        System.out.println("Question 3");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i = 0;
        while (numbers[i] <= number) {
            i++;
        }
        return i;
    }
}
