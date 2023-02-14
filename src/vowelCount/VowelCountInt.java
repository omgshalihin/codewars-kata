package vowelCount;

public class VowelCountInt {

    public static String VowelCount(String str) {
        return Integer.toString(str.replaceAll("[^aeiou]", "").length());
    }

    public static void main(String[] args) {
        System.out.println(VowelCount("All cows moo"));
    }


}
