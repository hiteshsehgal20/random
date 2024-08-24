
/*
Given two strings a and b, return the minimum number of times you should repeat string a so that
string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.
Notice: string "abc" repeated 0 times is "",  repeated 1 time is "abc" and repeated 2 times is "abcabc".
Example 1:
Input: String_x = "abcd",  String_y = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating String_x three times "abcdabcdabcd", String_y is a substring of it. */
public class RepeatStringForSubstring {
    public int getNumberOfTimesAStringRepeatsToCreateASubstringNaive(String pattern, String bigString) {
        StringBuilder firstStringBuilder = new StringBuilder(pattern);
        for(int i=1; i <= bigString.length()/ pattern.length() +2; i++){
            if (firstStringBuilder.toString().contains(bigString)) {
                return i;
            }
            firstStringBuilder.append(pattern);
        }

        return -1;
    }


}
// what if the alphabets are completely different:

//"cdabcdabcdabcdabcdabcdab"
//"abcd"