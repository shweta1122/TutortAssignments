package assignment3;


public class Main {

    public static void main(String[] args) {

        Leetcode1 leetcode1 = new Leetcode1();
        Leetcode2 leetcode2 = new Leetcode2();
        Leetcode3 leetcode3 = new Leetcode3();
        Leetcode4 leetcode4 = new Leetcode4();
        Leetcode5 leetcode5 = new Leetcode5();
        Leetcode6 leetcode6 = new Leetcode6();
        Leetcode7 leetcode7 = new Leetcode7();
        Leetcode8 leetcode8 = new Leetcode8();


        System.out.println(leetcode1.isHappyNumber(2));
        System.out.println(leetcode2.isPowerOfTwo(16));
        System.out.println((leetcode3.isAnagram("anagram", "nagaram")));
        System.out.println((leetcode4.isUgly(6)));
        System.out.println(leetcode5.reverseVowels("aA"));
        int arr[] = {1, 2};
        System.out.println(leetcode6.thirdMax(arr));
        System.out.println(leetcode7.findTheDifference("", "a"));
        System.out.println(leetcode8.addDigits(38));


    }
}
