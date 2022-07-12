package array_asignment_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII9 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        List<Integer> majorityElement = new ArrayList<>();
        for (int i :
                nums) {

            if (!hs.containsKey(i)) {
                hs.put(i, 1);
            }
            else{
                Integer value = hs.get(i);
                hs.replace(i, value+1);
            }

        }

        for (Integer key : hs.keySet()) {
            if (hs.get(key) > nums.length / 3) {
                majorityElement.add(key);
            }
        }

        return majorityElement;
    }

}
