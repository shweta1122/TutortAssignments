package array_asignment_1;

import java.util.HashMap;

public class TwoSumII2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        int arr[] = new int[2];
        int i = 0;
        while (i < nums.length) {

            if (hs.containsKey(target - nums[i])) {
                arr[0] = hs.get(target - nums[i]) + 1;
                arr[1] = i + 1;
                return arr;
            }
            hs.put(nums[i], i);
            i++;
        }
        return arr;
    }
}

