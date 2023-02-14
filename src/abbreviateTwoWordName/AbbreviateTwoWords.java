package abbreviateTwoWordName;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] splitName = name.split(" ");
//        List<Character> nameList = Arrays.stream(splitName).map(data -> data.charAt(0)).toList();
        System.out.println(Arrays.toString(splitName));
        return (splitName[0].charAt(0) + "." + splitName[1].charAt(0)).toUpperCase();
//        return nameList.get(0) + "." + nameList.get(1);
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }
}
