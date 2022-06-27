package assignment3;

public class Leetcode8 {

    public int addDigits(int num) {


        int sum = 0;
        while (String.valueOf(num).length() != 1) {
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        return num;

    }


}
