package assignment3;

public class Leetcode2 {

    public boolean isPowerOfTwo(int n) {

        double d = (double) n;
        double a = 0;
        int count = 0;
        while (a <= d) {


            a = Math.pow(2, count);
            if (a == d) {
                return true;
            }
            count += 1;
        }

        return false;
    }
}
