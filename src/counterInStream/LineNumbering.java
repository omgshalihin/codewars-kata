package counterInStream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LineNumbering {

    public static List<String> number (List<String> lines) {

        AtomicInteger counter = new AtomicInteger(1);

        List<String> numberingLines = lines.stream()
                .map(letter -> counter.getAndIncrement() + ": " + letter)
                .toList();

        return numberingLines;
    }

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
}
