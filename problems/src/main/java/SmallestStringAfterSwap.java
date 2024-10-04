import java.util.Arrays;

public class SmallestStringAfterSwap {
    /*3216. Lexicographically Smallest String After a Swap, Given a string s containing only digits, return the
lexicographically smallest string
 that can be obtained after swapping adjacent digits in s with the same parity at most once.

Digits have the same parity if both are odd or both are even. For example, 5 and 9, as well as 2 and 4, have the same parity, while 6 and 9 do not.*/
    public String getSmallestString(String s) {
        char[] sChar = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            int a = sChar[i] - '0';
            int b = sChar[i - 1] - '0';
            if ((a + b) % 2 == 0) {
                if (b - a > 0) {

                    sChar[i] = (char)(b + '0');
                    sChar[i-1] = (char)(a + '0');
                    return String.valueOf(sChar);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        SmallestStringAfterSwap swap =  new SmallestStringAfterSwap();
        System.out.println(swap.getSmallestString("001"));
    }
}
