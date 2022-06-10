import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static int returnNumberFromIndex() {
        System.out.println("Question 2");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        sc.nextLine();
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        return numbers[index];
    }
}
