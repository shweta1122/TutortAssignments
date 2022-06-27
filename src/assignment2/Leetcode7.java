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

//class Solution {
//    public int majorityElement(int[] nums) {
//        int majority=nums[0];
//        int count=1;
//        for(int i=1; i<nums.length;i++){
//            if(majority== nums[i]){
//                count++;
//            }
//            else{
//                count--;
//                if(count==0){
//                    majority=nums[i];
//                    count=1;
//                }
//            }
//        }
//        return majority;
//    }
//}

