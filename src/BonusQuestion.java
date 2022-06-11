import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BonusQuestion {
    public static int minNumberToBalance() {
        System.out.println("Question 1");
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] a = new int[(numbers.length + 1) / 2];
        int[] b = new int[numbers.length - a.length];
        for (int i = 0; i < numbers.length; i++)
        {
            if (i < a.length) {
                a[i] = numbers[i];
            }
            else {
                b[i - a.length] = numbers[i];
            }
        }

        if (IntStream.of(a).sum() > IntStream.of(b).sum()) {
            return IntStream.of(a).sum() - IntStream.of(b).sum();
        } else {
            return IntStream.of(b).sum() - IntStream.of(a).sum();
        }


    }
}
