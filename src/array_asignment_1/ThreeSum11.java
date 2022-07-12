package array_asignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum11 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);


        List<List<Integer>> outerList = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        if (!outerList.contains(list)) {
                            outerList.add(list);
                        }
                        k--;

                    } else if (nums[i] + nums[j] + nums[k] > 0) {
                        k--;
                    } else {
                        j++;
                    }

                }
            }
        }

        return outerList;
    }
}
