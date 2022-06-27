package assignment3;

public class Leetcode5 {
    public String reverseVowels(String s) {

        String reversed = "";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (isVowel(ch[i])) {
                if (isVowel(ch[j])) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i += 1;
                    j -= 1;

                } else {
                    j -= 1;
                }
            } else {
                i++;
            }
        }

        for (char c : ch
        ) {
            reversed += c;
        }

        return reversed;
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}
