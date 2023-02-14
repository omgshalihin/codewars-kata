package centuryFromYear;

public class Solution {
    public static int century(int number) {
        return (number+99)/100;
    }

    public static void main(String[] args) {
        System.out.println(century(1));
    }
}
