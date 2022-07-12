package array_asignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1;j<n;j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                else{
                    int left = j+1,right = n-1;

                    while(left < right){

                        long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                        if(sum > target) right--;
                        else if(sum < target) left++;

                        else{
                            ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                            if(nums[left] == nums[right]) break;
                            else{
                                int x = nums[left];
                                int y = nums[right];

                                while(nums[left] == x) left++;
                                while(nums[right] == y) right--;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

}
