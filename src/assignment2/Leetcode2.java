package assignment2;

public class Leetcode2 {

    public int[] getsumOf1DArray() {
        int number[] = {1, 2, 3, 4};
        for (int i = 1; i < number.length; i++) {
            number[i] = number[i - 1] + number[i];
        }
        return number;
    }
}
