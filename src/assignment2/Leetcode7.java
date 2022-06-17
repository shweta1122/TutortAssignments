package assignment2;

public class Leetcode7 {
    public int majorityElement() {
        int[] nums = {6, 5, 5};
        int maxCount = nums.length / 2;
        int returnNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            int tempCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    tempCount++;
                }
            }
            if (tempCount > maxCount) {
                return nums[i];
            }
        }
        return returnNumber;
    }
}
