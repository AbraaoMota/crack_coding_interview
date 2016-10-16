/**
 * Created by Abraao Mota on 13/10/2016.
 */
/*
 * Question 1.3 - URLify - Page 90 - Hints 53, 118
 *
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
 * at the end to hold the additional characters, and that you are given the 'true' length of the string.
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place)
 *
 * EXAMPLE
 *
 * Input: "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 *
 */

/*
 * Intuition: parse string from argument into char array. loop over; convert whitespace to '%20', join array of chars.
 * Ignore any other arguments to the program.
 */



public class Urlify {

    public String getLink(String input) {
        String url = "";
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                url = url.concat("%20");
            } else {
                url = url.concat("" + c);
            }
        }
        return url;
    }
}
