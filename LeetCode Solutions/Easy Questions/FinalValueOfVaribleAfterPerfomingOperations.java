public class FinalValueOfVaribleAfterPerfomingOperations {
    public static void main(String[] args) {
        String[] arr = {"--X", "X++", "X++"};
        int result = finalValue(arr);

        System.out.println("The final value of X is = " + result);
    }

    public static int finalValue(String[] operations) {
        int valueOfX = 0;

        for(int i = 0; i < operations.length; i++){
            if(operations[i] == "--X" || operations[i] == "X--")
                valueOfX--;
            if(operations[i] == "++X" || operations[i] == "X++")
                valueOfX++;
        }
        return valueOfX;
    }
}
