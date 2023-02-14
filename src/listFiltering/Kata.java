package listFiltering;

import java.util.List;
import java.util.stream.Stream;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(item -> item.getClass().getSimpleName().equals("Integer"))
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
}
