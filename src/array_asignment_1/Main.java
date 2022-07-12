package array_asignment_1;

public class Main {

    public static void main(String[] args) {
        TwoSum1 twoSum1 = new TwoSum1();
        TwoSumII2 twoSumII2 = new TwoSumII2();
        MergeSortedArray3 mergeSortedArray3 = new MergeSortedArray3();
        BuySellStock6 buySellStock6 = new BuySellStock6();
        PascalTriangle5 pascalTriangle5 = new PascalTriangle5();
        BuySellStock27 buySellStock27 = new BuySellStock27();
        MajorityElementII9 majorityElementII9 = new MajorityElementII9();
        ThreeSum11 threeSum11 = new ThreeSum11();
        RotateImage img = new RotateImage();

//        int arr[] = {-1, 0};
//
//
//        int result1[] = twoSum1.twoSum(arr, 0);
//        int result2[] = twoSumII2.twoSum(arr, -1);
//
//        for (int s : result2) {
//            System.out.println(s);
//        }
//
        int nums1[] = {-2, 0, 1, 1, 2};
//        int nums2[] = {1, 2, 2};
//
//        mergeSortedArray3.merge(nums1, 3, nums2, 3);

//        int prices[] = {7,1,5,3,6,4};
//        System.out.println(buySellStock27.maxProfit(prices));

//        System.out.println((pascalTriangle5.getRow(3)));

//        int majorityElement[] = {1,2};
//        System.out.println(majorityElementII9.majorityElement(majorityElement));

//        System.out.println(threeSum11.threeSum(nums1));
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        img.rotate(matrix);
    }


}
