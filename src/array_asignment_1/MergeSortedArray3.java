package array_asignment_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSortedArray3 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int index = 0;

        for (int i = nums1.length - 1; i > 0; i--) {
            if (nums1[i] == 0 && nums1[i - 1] != 0) {
                index = i;
                break;

            }
        }
        int index2 = 0;
        for (int i = index; i < nums1.length; i++) {

            if (index2 < nums2.length) {
                nums1[i] = nums2[index2];
                index2++;
            } else {
                break;
            }

        }


        Arrays.sort(nums1);
        List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());

        System.out.print(list);
    }

}
