public class DigitCountValue {
    //You are given a 0-indexed string num of length n consisting of digits.
    //
    //Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.
    //eg: 1210 num[0] = '1' the digit (i) 0 should occur the value 1 times
    // num[1] = '2' the digit 1 should occur 2 times
    //num[2] = '1' the digit 2 should ocucr once
    //num[3] = '0' 3 should occur 0 times, if all true return true else false
    //030: num[0] = 0, num[1] = 3, num[2] = 0; 0 should occur 0 times but is 2

    public boolean digitCount(String num) {

        for (int i=0; i<num.length(); i++) {

            int numTimesIShouldOccur = num.charAt(i) - '0';
            long totalOccuranceOfI = 0;
            for(int j = 0; j< num.length(); j++) {
                if (num.charAt(j) == i+'0') {
                    totalOccuranceOfI++;
                }
            }
            if (numTimesIShouldOccur != totalOccuranceOfI) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        DigitCountValue dcv = new DigitCountValue();
        System.out.println(dcv.digitCount("1210"));
    }
}
