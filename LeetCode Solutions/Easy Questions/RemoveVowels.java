package package3.LeetCode.EasyProblems;

/**
 * Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
 */

import java.util.Arrays;
import java.util.Hashtable;

public class RemoveVowels {
    public static void main(String[] args) {
        String testCase = "leetcodeisacommunityforcoders";
        String testCase2 = "";

        String result = removeVowels(testCase, testCase2);
        System.out.println("The returned string is: " + result);
    }

    public static String removeVowels(String testCase, String testCase2) {
        String vowelsRemoved = testCase.replaceAll("[aeiou]", "");
        System.out.println("here " + vowelsRemoved);
        return vowelsRemoved;
    }
}
