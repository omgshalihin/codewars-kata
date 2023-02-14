public class sumOfPositive {
    public static int sum(int[] arr){
        int result = 0;
        for (int num : arr) {
            if (num > 0) {
                result += num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3}));
    }
}
