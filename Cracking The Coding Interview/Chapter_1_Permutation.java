/**
 * Given two strings, write a method to decide if one is a permutation of the other
 */

import java.util.Arrays;

public class Chapter_1_Permutation {
    public static void main(String[] args) {
        String firstCase = "abc";
        String secondCase = "bac";

        boolean result = checkPermutation(firstCase, secondCase);
        System.out.println("Given the two string, it is " + result + " that these are permutations.");
    }

    public static boolean checkPermutation(String firstCase, String secondCase) {
        if(firstCase.length() != secondCase.length()) // this cannot be a permutation if the sizes aren't equal
            return false;

        char[] charArrayOne = firstCase.toCharArray();
        char[] charArrayTwo = secondCase.toCharArray();

        Arrays.sort(charArrayOne);
        Arrays.sort(charArrayTwo);

        for(int i = 0; i < charArrayOne.length; i++){
            if (charArrayOne[i] != charArrayTwo[i])
                return false;
        }
        return true;
    }
}
