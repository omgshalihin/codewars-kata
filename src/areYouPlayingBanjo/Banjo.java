package areYouPlayingBanjo;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        System.out.println(name);
        return name.startsWith("R") || name.startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Martin"));

    }
}
