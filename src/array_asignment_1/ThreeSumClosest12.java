package array_asignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest12 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=nums[0]+nums[1]+nums[n-1];
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<target){
                    left++;
                }else{
                    right--;
                }

                if(Math.abs(sum-target)<Math.abs(res-target))
                    res=sum;
            }
        }
        return res;
    }

}
