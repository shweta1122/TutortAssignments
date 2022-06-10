
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
        int i = 1;
        while (list.size() > 1) {
            if (i % 2 == 0) {
                list.remove(Collections.max(list));
            } else {

                list.remove(Collections.min(list));
            }
            i++;
        }
        return list.get(0);
    }
}
