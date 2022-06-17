package assignment2;

import java.util.Arrays;
import java.util.List;

public class leetcode8 {


    public void check() {
        int arr[] = {0, 1, 0, 3, 12};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    arr[j] = arr[j] ^ arr[j + 1];

                    arr[j + 1] = arr[j] ^ arr[j + 1];

                    arr[j] = arr[j] ^ arr[j + 1];
                }

            }

        }

        List<Integer> list = Arrays.stream(arr).boxed().toList();
        System.out.println(list);
    }

}
