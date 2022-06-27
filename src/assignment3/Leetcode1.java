package assignment3;

import java.util.HashSet;

public class Leetcode1 {

    public static boolean isHappyNumber(int n) {

        HashSet<Integer> hs = new HashSet<>();

        while (true) {

            n = squareOfNumber(n);

            if (n == 1) {
                return true;
            }
            if (hs.contains(n)) {
                return false;
            }
            hs.add(n);

        }
    }


    public static int squareOfNumber(int n) {
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n = n / 10;
        }

        return squareSum;
    }
}
