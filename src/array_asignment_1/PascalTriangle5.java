package array_asignment_1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle5 {

    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();

        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
                }


            }
            pascalTriangle.add(row);


        }


        return pascalTriangle.get(rowIndex);

    }
}
