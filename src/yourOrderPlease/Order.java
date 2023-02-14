package yourOrderPlease;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        String[] stringArray = words.split(" ");
        var apple = Arrays.stream(stringArray).sorted(Comparator.comparing(data -> data.replaceAll("[^0-9]", ""))).reduce((a,b) -> a + " | " + b).get();
        System.out.println(apple);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
