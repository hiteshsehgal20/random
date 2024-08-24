public class Tester {
    public static void main(String[] args) {
        RepeatStringForSubstring rsfm = new RepeatStringForSubstring();
        System.out.println(rsfm.getNumberOfTimesAStringRepeatsToCreateASubstringNaive("ABCDABD", "ABCABCDABABCDABCDABD"));
        //abcdabd length = 7
        //ABCABCDABABCDABCDABD length = 20/7

    }
}