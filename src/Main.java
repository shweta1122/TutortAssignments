public class Main {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();
        Q3 q3 = new Q3();
        Q4 q4 = new Q4();
        Q5 q5 = new Q5();
        Q6 q6 = new Q6();
        Q7 q7 = new Q7();
        Q8 q8 = new Q8();
        Q9 q9 = new Q9();
        Q10 q10= new Q10();
        BonusQuestion question=new BonusQuestion();


        System.out.println("The sum of number is " + q1.sum());
        System.out.println("The element of a index is "+ q2.returnNumberFromIndex());
        System.out.println("The count is"+q3.getCount());
        q4.printAlternate();
        System.out.println("The element os same index is "+q5.getSameElementAsIndex());
        System.out.println("The PERFECT is" + q6.checkIfReverseArrayEqual());
        System.out.println("The lst number is" + q7.lastValue());
        System.out.println("The sorted list after removing two max element is" + q8.sortedRemovedList());
        System.out.println("The sum os N number is" + q9.sumOfNNumbers());
        System.out.println("The number is" + q10.checkIfFascinating());
        System.out.println("The min to balance array is" + question.minNumberToBalance());




    }


}