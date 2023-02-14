package dnaToRnaConversion;

public class Bio {
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }

    public static void main(String[] args) {
        Bio b = new Bio();
        System.out.println(b.dnaToRna("CATCAT"));

    }
}
