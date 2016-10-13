/*
 * Question 1.1 - Is unique? - Page 90 - Hints 44, 117, 132
 *
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 */

/*
    Intuition: Use an array of booleans / bit map to represent what characters have been seen, tick
    those that have been seen as true, if seen more than once then stop and flag as false.

    This assumes only the alphabet is used. Could probably change hash easily for all available chars.

 */

import java.util.Arrays;

class IsUnique {

    public boolean isUniqueCheck(String s) {
        if (s.length() > 0) {
            boolean[] alphabetSeen = new boolean[26];
            fillBooleanArray(alphabetSeen, false);

            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                int seenIndex = hashChar(currentChar);

                if (alphabetSeen[seenIndex]) {
                    return false;
                } else {
                    alphabetSeen[seenIndex] = true;
                }
            }
            return true;
        }
        return true;
    }

    private int hashChar(char currentChar) {
        return ((int) currentChar - (int) 'a');
    }

    private void fillBooleanArray(boolean[] array, boolean bool) {
        Arrays.fill(array, bool);
    }
}
