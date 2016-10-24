/**
 * Created by Abraao Mota on 24/10/2016.
 */
/*
 * Question 1.6 - String Compression - Page 91 - Hints 92, 110
 *
 * Implement a method to perform basic string compression using the counts of repeated characters. For example, the
 * string 'aabbcccccaaa' would become a2b1c5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string. You can assume the string has only uppercase and lowercase
 * letters (a-z)
 *
 */

/*
 * Intuition:
 * Use a string builder for the compressed string and whenever a character read is done, add the number to it.
 *
 */

public class StringCompressor {

    public String compress(String s) {
        StringBuilder sb = new StringBuilder();
        char[] givenString = s.toCharArray();

        int currentCharCount = 0;
        char prevChar = '\u0000';
        for (int i = 0; i < s.length(); i++) {
            char currChar = givenString[i];
            if (prevChar == '\u0000') {
                sb.append(currChar);
                prevChar = currChar;
            } else if (prevChar == currChar) {
                prevChar = currChar;
            } else {
                sb.append(currentCharCount);
                sb.append(currChar);
                currentCharCount = 0;
                prevChar = currChar;
            }
            currentCharCount++;
        }
        sb.append(currentCharCount);

        if (sb.length() >= s.length()) {
            return s;
        } else {
            return sb.toString();
        }
    }
}
