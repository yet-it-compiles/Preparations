public class BuildArrayFromPermutation_1920 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3};

        for (int i = 0; i < myArray.length - 1; i++){
            System.out.println(myArray[myArray[i]]);
        }

    }
}
