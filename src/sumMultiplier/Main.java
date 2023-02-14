package sumMultiplier;

public class Main {
    public static String SumMultiplier(int[] arr) {
        int arrayLength = arr.length;
        int doubleSum = 0;
        int firstBigNum = 0;
        int secondBigNum = 0;

        for (int i = 0; i < arrayLength; i++) {
            doubleSum += arr[i] * 2;
            if (arr[i] > firstBigNum) {
                secondBigNum = firstBigNum;
                firstBigNum = arr[i];
            }
//            else if (arr[i] > secondBigNum) {
            else if (arr[i] > secondBigNum) {
            secondBigNum = arr[i];
            }
        }
        int arraySum = firstBigNum * secondBigNum;
        return arraySum > doubleSum ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(SumMultiplier(new int[]{2, 5, 6, -6, 16, 2, 3, 6, 5, 3}));
    }
}
