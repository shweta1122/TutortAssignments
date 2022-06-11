
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Q7 {
    public static int lastValue() {
        System.out.println("Question 7");
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Integer[] what = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(what);
        Collections.sort(list);
        int number = list.get(list.size()/2);
        return number;

    }
}
