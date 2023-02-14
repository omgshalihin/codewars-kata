package breakCamelCase;

public class Solution2 {

    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.toLowerCase().charAt(i)) {
                sb.append(" " + input.charAt(i));
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
    }
}
