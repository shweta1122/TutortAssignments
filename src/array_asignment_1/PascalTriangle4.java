package array_asignment_1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle4 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {

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


        return pascalTriangle;
    }
}
