import java.util.*;

public class Q8 {
    public static List<Integer> sortedRemovedList() {
        System.out.println("Question 8");
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Integer[] what = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        List<Integer> list =  new ArrayList<>(Arrays.asList(what));
        Collections.sort(list);
        list.remove(list.size()-1);
        list.remove(list.size()-2);
        return list;


    }

}
