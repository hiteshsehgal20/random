public class Tester {
    public static void main(String[] args) {
        RepeatStringForSubstring rsfm = new RepeatStringForSubstring();
        //System.out.println(rsfm.getNumberOfTimesAStringRepeatsToCreateASubstringNaive("bcabc", "abcabcabcabcabcabcabc"));
        //abcdabd length = 7
        //ABCABCDABABCDABCDABD length = 20/7
        FibonacciSeries fib = new FibonacciSeries();
        //System.out.println(fib.getFibonacciByRecursion(50));
        System.out.println(fib.getFibEfficient(50));
    }
}