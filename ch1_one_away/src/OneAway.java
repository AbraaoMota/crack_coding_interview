import static java.lang.StrictMath.abs;

/**
 * Created by Abraao Mota on 24/10/2016.
 */
/*
 * Question 1.5 - One Away - Page 91 - Hints 23, 97, 130
 *
 * There are three types of edits that can be performed on strings: insert a character, remove a character, or replace
 * a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
 *
 * EXAMPLE
 *
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 *
 */
/*
 * Intuition:
 * Only consider strings with length difference < 2
 * If they are length difference 1, set difference of the content of the 2 should be only 1 element.
 * If they are equal length, only one difference is allowed.
 *
 */
public class OneAway {

    public boolean check(String s1, String s2) {

        int arrayLenDiff = s1.length() - s2.length();
        int strLengthDifference = abs(arrayLenDiff);

        if (strLengthDifference >= 2) {
            return false;
        }

        char[] longerArray;
        char[] shorterArray;
        if (arrayLenDiff >= 0) {
            longerArray = s1.toCharArray();
            shorterArray = s2.toCharArray();
        } else {
            longerArray = s2.toCharArray();
            shorterArray = s1.toCharArray();
        }

        int longIndex = 0, i = 0;
        boolean differenceSeen = false;
        while (i < shorterArray.length) {
            char shortChar = shorterArray[i];
            char longChar = longerArray[longIndex];
            if (shortChar != longChar) {
                if (differenceSeen) {
                    return false;
                } else {
                    differenceSeen = true;
                    if (strLengthDifference > 0) {
                        i--;
                    }
                }
            }
            longIndex++;
            i++;
        }
        return true;
    }
}
