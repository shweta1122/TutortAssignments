package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public int getSameElementAsIndex() {
        System.out.println("Question 5");
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==i+1){
                return  i+1;
            }
        }
        return 00;
    }
}
