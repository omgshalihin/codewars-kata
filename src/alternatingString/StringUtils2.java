package alternatingString;

public class StringUtils2 {

    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.toUpperCase().charAt(i)) {
                sb.append(string.toLowerCase().charAt(i));
            } else {
                sb.append(string.toUpperCase().charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello WORLD"));
    }
}
