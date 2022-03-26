/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 */

package package3.LeetCode.EasyProblems;

public class RunningSumOf1D_1480 {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int runningSumValue = 0;

        for(int i = 0; i < nums.length; i++){
            runningSumValue += nums[i];
            runningSum[i] = runningSumValue;
        }
        return runningSum;
    }
}
