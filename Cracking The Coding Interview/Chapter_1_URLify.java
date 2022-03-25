/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string.
 */
public class Chapter_1_URLify {
    public static void main(String[] args) {
        String firstCase = "Mr John Smith";

        String result = URLify(firstCase);
        System.out.println("The returned string result is: " + result);
    }

    public static String URLify(String firstCase) {

        firstCase = firstCase.replace(" ", "%20");
        return firstCase;
    }
}

