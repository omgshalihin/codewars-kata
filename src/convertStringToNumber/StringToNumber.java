package convertStringToNumber;

public class StringToNumber {

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
    }
}
