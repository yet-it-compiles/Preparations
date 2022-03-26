/**
 * Reverse an array of integers.
 */

package package3;

import java.util.ArrayList;
import java.util.List;

public class ArraysDS {
    public static void main(String[] args) {

    }
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> myArray = new ArrayList<Integer>();

        for (int i = a.size() - 1; i >= 0; i--){
            myArray.add(a.get(i));
        }
        return myArray;

    }
}
