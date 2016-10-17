import java.util.Stack;

/**
 * Created by Abraao Mota on 17/10/2016.
 */
/*
 * Question 1.4 - Palindrome Permutator - Page 91 - Hints: 106, 121, 134, 136
 *
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need
 * to be limited to just dictionary words.
 *
 * EXAMPLE
 *
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 *
 */

/*
 * Intuition:
 * Keep a map of the alphabet to a count of each letter in the string.
 * Loop over the string; if a char is seen, add 1 to the character seen count. For a palindrome, all character counts
 * must be even with the possible exception of a character that is odd. This is to account for odd length strings.
 * To avoid looping over the character count array at the end of the iteration, keep track of how many odd characters
 * been seen at any time. If at the end this is greater than 1, return false
 *
 * Assume only alphabet for ease of use.
 *
 * Additional notes:
 * I want to be able to see the permutations. Implementing a 'isPalindrome' method, this uses a stack built by strings
 * from the chars given; if the pairs match, it discerns a palindrome in O(n) (with some space usage).
 */

public class PalindromePermutator {

    public boolean isPalindromePermutation(String s) {

        s = preprocessString(s);
        int[] seenCharacters = new int[26];
        int currentOddCharCount = 0;

        for (char c: s.toCharArray()) {
            int charPos = hashChar(c);
            seenCharacters[charPos]++;
            int currentCharCount = seenCharacters[charPos];
            if (currentCharCount % 2 != 0) {
                currentOddCharCount++;
            } else {
                currentOddCharCount--;
                if (currentOddCharCount < 0) currentOddCharCount = 0;
            }
        }

        if (currentOddCharCount > 1) {
            return false;
        } else return true;
    }

//    public String[] palindromePermutations(String s) {
//        return ["", ""];
//    }

    public boolean isPalindrome(String s) {
        Stack<String> charStack = new Stack<>();

        String[] charStrings = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charStrings[i] = charToString(s.toCharArray()[i]);
        }

        int halfway = s.length() / 2;
        boolean isOddLength = s.length() % 2 != 0;

        for (int j = 0; j < s.length(); j++) {
            if (j < halfway) {
                charStack.push(charStrings[j]);
            } else if (j == halfway && isOddLength) {
            } else {
                String stackHead = charStack.peek();
                if (stackHead.equals(charStrings[j])) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private String charToString(char c) {
        return "" + c;
    }

    private String preprocessString(String s1) {
        return s1.replaceAll("\\s","").toLowerCase();
    }

    private int hashChar(char c) {
        return (int) c - (int) 'a';
    }
}
