/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 * target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] myArray = {11, 6, 7, 2, 15};
        int target = 9;

        int[] result = twoSum(myArray, target);
        System.out.println("The two indices which add to " + target + " is " + Arrays.toString(result));
        System.out.println(result[0] + " and " + result[1]);
    }

    private static int[] twoSum(int[] myArray, int target) {
        Hashtable<Integer, Integer> myHashTable = new Hashtable<>();
        int equation;

        for (int index = 0; index < myArray.length; index++) {
            equation = target - myArray[index];

            if (myHashTable.containsKey(equation))
                return new int[]{myHashTable.get(equation), index};

            myHashTable.put(myArray[index], index);
        }
        return null;
    }
}
