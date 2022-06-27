package assignment3;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Leetcode3 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }


        String sorted1 =
                Stream.of(s.split(""))
                        .sorted()
                        .collect(Collectors.joining());

        String sorted2 = Stream.of(t.split("")).sorted().collect(Collectors.joining());

        if (sorted1.equals(sorted2)) {
            return true;
        }
        return false;
    }
}
