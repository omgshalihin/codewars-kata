package arrayAddition;


import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static String ArrayAddition(int[] arr) {
        var maxNum = Arrays.stream(arr).max().getAsInt();
        System.out.println(maxNum);
        IntStream.range(0, arr.length).forEach(System.out::println);
        var sumAll = Arrays.stream(arr).sum();
        var difference = sumAll - maxNum - maxNum;
        System.out.println("difference: " + difference);
        var check = IntStream.range(0, arr.length).filter(index -> arr[index] == difference).findFirst().orElse(-1);
        System.out.println(check);
        if (difference == 0) {
            return "true";
        }
        if (check != -1) {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        System.out.println(ArrayAddition(new int[] {4,6,23,10,1,3}));
        System.out.println(ArrayAddition(new int[] {5,7,16,1,2}));
        System.out.println(ArrayAddition(new int[] {3,5,-1,8,12}));
        //        1. For input new int[] {10,20,30,40,100} the output was incorrect. The correct output is true
        System.out.println(ArrayAddition(new int[] {10,20,30,40,100}));
        //        2. For input new int[] {31,2,90,50,7} the output was incorrect. The correct output is true
        System.out.println(ArrayAddition(new int[] {31,2,90,50,7}));
    }
}
