public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,7}, {7,1,3}, {1,9,5}};
        int result = whoseTheRichest(arr);
        System.out.println("The richest person has a sum of " + result + " in their account.");
    }

    private static int whoseTheRichest(int[][] arr) {
        int runningSum = 0;
        int comparisonRunningSum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                comparisonRunningSum += arr[i][j];
            }
            if (comparisonRunningSum > runningSum)
                runningSum = comparisonRunningSum;
                comparisonRunningSum = 0;
        }
        System.out.println("Value of running sum =" + runningSum);
        return runningSum;
    }
}
