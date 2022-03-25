package package3.LeetCode;

import java.util.Arrays;

public class ContainsDuplicates_217 {
    public static void main(String[] args) {
	        int[] problemArray = {1,2,3,1};
            boolean result = solution(problemArray);

        System.out.println("The Solution is: " + result);
    }

    public static boolean solution(int[] problemArray){
        Arrays.sort(problemArray);  // sorts the array to: 1,1,2,3
        // Checks to see if the first value, is the equal to the value next to it, and if so return true.
        for (int startingIndex = 0; startingIndex < problemArray.length - 1; startingIndex++)
            if(problemArray[startingIndex] == problemArray[startingIndex+1])
                return true;

        return false;
    }
}
