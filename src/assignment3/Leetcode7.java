package assignment3;

import java.util.Arrays;

public class Leetcode7 {

    public char findTheDifference(String s, String t) {

        if (t.length() == 1) {
            return t.charAt(0);
        }

        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        String s1 = String.valueOf(ch1);

        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        String s2 = String.valueOf(ch2);

        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s2.charAt(i);
            }
        }
        return s2.charAt(s2.length() - 1);
    }
}
