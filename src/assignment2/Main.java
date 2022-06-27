package assignment2;

public class Main {
    public static void main(String[] args) {
        Leecode1 leecode1 = new Leecode1();
        Leetcode2 leetcode2 = new Leetcode2();
        Leetcode3 leetcode3 = new Leetcode3();
        Leetcode8 leetcode8 = new Leetcode8();
        Leetcode6 leetcode6 = new Leetcode6();
        Leetcode5 leetcode5 = new Leetcode5();
        Leetcode7 leetcode7 = new Leetcode7();


        System.out.println(leecode1.getMaxSum());
        System.out.println(leetcode2.getsumOf1DArray());
        System.out.println(leetcode3.getCount());
        System.out.println(leetcode5.threeConsecutiveOdds());
        leetcode6.transpose();
        System.out.println(leetcode7.majorityElement());
        leetcode8.check();
    }
}
