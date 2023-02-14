package reversedStrings;

public class Kata {
    public static String solution(String str) {

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

//        String newString = "";
//        int lastIndex = str.length() - 1;
//        while (lastIndex >= 0) {
//            newString = newString + str.charAt(lastIndex);
//            lastIndex--;
//        }
//        return newString;

    }

    public static void main(String[] args) {
        System.out.println(solution("tar"));
    }
}
