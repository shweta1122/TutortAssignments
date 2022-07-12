package array_asignment_1;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] <= target) {
                        if (nums[i] + nums[j] == target) {
                            arr[0] = i;
                            arr[1] = j;
                            return arr;
                        }

                    }
                }
            }
        }
        return arr;


//        better approach using hashmap
//
//        for(int i=0;i<nums.length;i++) // we iterate through num array
//        {
//            if(hm.containsKey(target - nums[i])) // we check for if at any index we have value that can make our target in hashmap, if found we keep value as below and key as index of that ele
//            {
//                res[1]=i;
//                res[0]=hm.get(target - nums[i]);
//                return res; // return res array
//            }
//            hm.put(nums[i],i); // if not found then also we need to keep value & index at hashmap for future checking
//        }
//        return res; // else return no pair found
    }
}
