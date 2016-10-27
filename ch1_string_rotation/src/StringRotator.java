import java.util.Arrays;

/**
 * Created by Abraao Mota on 27/10/2016.
 */
/*
 * Question 1.9 - String Rotation - Page 91 - Hints - 34, 88, 104
 *
 * Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings
 * s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring
 *
 * Example  - "waterbottle" is a rotation of "erbottlewat"
 *
 */

/*
 * Intuition:
 * Attach s1 to itself twice, check the resulting string to see if s2 is a substr
 * If it's a substr, you can see s2 within s1 repeated.
 *
 */
public class StringRotator {

    public boolean checkForRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0 || s2.length() == 0) {
            return false;
        }

        String repeatedS1 = s1 + s1;
        return isSubstring(repeatedS1, s2);
    }

    private boolean isSubstring(String s1, String s2) {
        return s1.toLowerCase().contains(s2.toLowerCase());
    }
}
