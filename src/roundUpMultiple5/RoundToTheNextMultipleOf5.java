package roundUpMultiple5;

public class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(roundToNext5(51));
    }
}
