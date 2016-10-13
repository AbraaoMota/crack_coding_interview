/**
 * Created by Abraao Mota on 13/10/2016.
 */
/*
 * Question 1.2 - Check permutation - Page 90 - Hints 1, 84, 122, 131
 *
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 */

/*
    Intuition: Try and hash each character as in 1.1. Count each character seen in an array to symbolise count of chars
    in first string.
    When going through the second string, generate character hash and check array at that place. If the count is greater
    than 0, decrease count and move onto next element. If 0, stop and return false.
    Assume alphabet only for ease of hash function.

    Complexity:

    if s1 length = n, s2 length = m,
    O(m + n)
    However, solution uses up space.
 */

public class CheckPermutation {
    public boolean isPermutation(String s2, String s1) {
        int[] seenChars = new int[26];

        if (s2.length() != s1.length()) return false;

        for (char c : s1.toCharArray()) {
            int arrayPosition = hashChar(c);
            seenChars[arrayPosition]++;
        }

        for (char c : s2.toCharArray()) {
            int arrayPosition = hashChar(c);
            if (seenChars[arrayPosition] == 0) {
                return false;
            } else {
                seenChars[arrayPosition] -= 1;
            }
        }
        return true;
    }

    private int hashChar(char c) {
        return (int) c - (int) 'a';
    }
}
