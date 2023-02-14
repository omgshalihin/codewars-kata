package breakCamelCase;

public class Solution {
    public static String camelCase(String input) {

        String newInput = input.replaceAll("([A-Z])", " $1");
        System.out.println(newInput);

        return input;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }
}
