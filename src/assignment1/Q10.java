package assignment1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q10 {
    public static String checkIfFascinating() {
        System.out.println("Question 10");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiply2 = n * 2;
        int multiply3 = n * 3;
        String number = Integer.toString(n) + Integer.toString(multiply2) + Integer.toString(multiply3);
        String number2 = Stream.of(number.split(""))
                .sorted().distinct()
                .collect(Collectors.joining());
        number2.replaceAll("0", "");
        if (number2.length() == 9) {
            return "Fascinating";
        } else {
            return " Not : Fascinating";
        }


    }
}
