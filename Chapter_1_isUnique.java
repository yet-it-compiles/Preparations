/**
 * Question: Implement an algorithm to determine if a string has all unique characters.
 */

package package3;
import java.util.*;

public class Chapter_1_isUnique {
    public static void main(String[] args) {
        String firstCase = "Dedication";
        String secondCase = "Jess";

        boolean result = isUnique(firstCase, secondCase);
        boolean hashedResult = isUniqueHashTableSolution(firstCase, secondCase);
        System.out.println("This is the result of isUnique: " + result);
        System.out.println("This is the result of isUniqueHashTableSolution: " + hashedResult);
    }

    /*
    Iterates through each character of the passed string, and checks to see if there is are any duplicates.
     */
    public static boolean isUnique(String firstCase, String secondCase){
        for(int startingIndex = 0; startingIndex < secondCase.length(); startingIndex++){
            for(int nextIndex = startingIndex+1; nextIndex < secondCase.length(); nextIndex++){
                if(secondCase.charAt(startingIndex) == secondCase.charAt(nextIndex)) {
                    System.out.println("Success! The duplicate letter was: " + secondCase.charAt(startingIndex));
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Iterates through each character of the passed in String, and assigns the character to a key, then checks to see if
    that key already exists in the HashTable.
     */
    public static boolean isUniqueHashTableSolution(String firstCase, String secondCase){
        Hashtable<Character, Integer> myHashTable = new Hashtable();
        for(int i = 0; i < secondCase.length(); i++){
            if(myHashTable.containsKey(secondCase.charAt(i)))
                return true;

            myHashTable.put(secondCase.charAt(i), i);
        }
        return false;
    }
}
