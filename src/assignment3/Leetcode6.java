package assignment3;

import java.util.Arrays;

public class Leetcode6 {
    public int thirdMax(int[] nums) {
        int[] unique = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(unique);

        if (unique.length == 1) {
            return unique[0];
        }

        if (unique.length == 2) {
            return unique[1];
        }

        return unique[unique.length - 3];


    }
}
