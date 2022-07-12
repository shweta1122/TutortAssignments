package array_asignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateImage {
    public void rotate(int[][] matrix) {

        int count = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][count];
                matrix[j][count] = temp;
            }
            count--;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int[] data :
                matrix) {

            List<Integer> tempList = Arrays.stream(data).boxed().toList();

            list.add(tempList);
        }

        System.out.println(list);
        // transpose then flip
//        {
//            int n = matrix.length;
//
//            for(int i = 0; i < n; i++)
//            {
//                for(int j = i; j < n; j++)
//                {
//                    int temp = matrix[i][j];
//                    matrix[i][j] = matrix[j][i];
//                    matrix[j][i] = temp;
//                }
//            }
//
//            for(int i = 0; i < n; i++)
//            {
//                for(int j = 0; j < n/2; j++)
//                {
//                    int temp = matrix[i][j];
//                    matrix[i][j] = matrix[i][n-j-1];
//                    matrix[i][n-j-1] = temp;
//                }
//            }
//        }
//        List<List<Integer>> list = new ArrayList<>();
//
//        for (int[] data :
//                matrix) {
//
//            List<Integer> tempList = Arrays.stream(data).boxed().toList();
//
//            list.add(tempList);
//        }
//
//        System.out.println(list);
    }


}
