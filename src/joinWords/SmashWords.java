package joinWords;

public class SmashWords {
    public static String smash(String... words) {
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(smash("you", " are ", "awesome"));


    }
}
