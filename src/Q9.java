import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q9 {
    public static int sumOfNNumbers() {
        System.out.println("Question 9");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n * (n + 1) / 2;


    }
}
