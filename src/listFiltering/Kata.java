package listFiltering;

import java.util.List;
import java.util.stream.Stream;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
//        // My Solution
//        return list.stream()
//                .filter(item -> item.getClass().getSimpleName().equals("Integer"))
//                .toList();

        // Better Solution
        return list.stream()
                .filter(item -> item instanceof Integer)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
}
