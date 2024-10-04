public class MinimumSwapStringEquality {
    //You are given two strings s1 and s2 of equal length consisting of letters "x" and "y" only. Your task is to make these two strings equal to each other. You can swap any two characters that belong to different strings, which means: swap s1[i] and s2[j].
    //
    //Return the minimum number of swaps required to make s1 and s2 equal, or return -1 if it is impossible to do so.
    public int getMinimumSwaps(String s1, String s2) {

        int countXY = 0;
        int countYX = 0;
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (s1Chars[i] != s2Chars[i]) {
                if (s1Chars[i] == 'x') {
                    countXY += 1;
                } else {
                    countYX += 1;
                }
            }
        }
        if (countXY % 2 != countYX % 2) {
            return -1;
        }
        return countXY / 2 + countYX / 2 + countXY % 2 + countYX % 2;

    }


    public static void main(String[] args) {
        MinimumSwapStringEquality ms = new MinimumSwapStringEquality();
        System.out.println(ms.getMinimumSwaps("xy", "yx"));
    }
}
