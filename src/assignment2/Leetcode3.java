package assignment2;

public class Leetcode3 {

    public int getCount() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        char arr[] = stones.toCharArray();
        int count = 0;
        for (Character ch : arr
        ) {
            if (jewels.contains(Character.toString(ch))) {
                count++;
            }
        }
        return count;
    }
}
