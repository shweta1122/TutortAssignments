import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public boolean checkIfReverseArrayEqual() {
        System.out.println("Question 5");
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers2 = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers2[i] = numbers[i];

        }
        if (Arrays.equals(numbers, numbers2)) {
            return true;
        } else {
            return false;
        }

    }
}
