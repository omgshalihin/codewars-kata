package whoLikesIt;

public class Solution {

    // String... same as String[]

    public static String whoLikesIt(String... names) {
        final String Template1 = "%s likes this";
        final String Template2 = "%s and %s like this";
        final String Template3 = "%s, %s and %s like this";
        final String TemplateN = "%s, %s and %d others like this";

        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> String.format(Template1, names[0]);
            case 2 -> String.format(Template2, names[0], names[1]);
            case 3 -> String.format(Template3, names[0], names[1], names[2]);
            default -> String.format(TemplateN, names[0], names[1], names.length - 2);
        };
    }
}
