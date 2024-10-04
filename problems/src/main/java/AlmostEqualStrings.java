public class AlmostEqualStrings {
    /*Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.

Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.

The frequency of a letter x is the number of times it occurs in the string.*/
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] word1Chars = getPopulatedArrays(word1);
        int[] word2Chars = getPopulatedArrays(word2);
        for (int i = 0; i < 26; i++) {
            if (Math.abs(word1Chars[i] - word2Chars[i]) > 3) {
                return false;
            }
        }
        return true;
    }

    private int[] getPopulatedArrays(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

}

