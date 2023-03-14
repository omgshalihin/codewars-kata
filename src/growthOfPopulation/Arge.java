package growthOfPopulation;

import java.util.stream.IntStream;

public class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
//        int countYears = 1;
//        int population = p0;
//        int increment = (int) (population*(percent/100) + aug);
//        int populationGrowth = population + increment;
//        while (populationGrowth < p) {
//            System.out.println("hey");
//            countYears ++;
//            population = populationGrowth;
//            increment = (int) (population*(percent/100) + aug);
//            populationGrowth = population + increment;
//        }
//        return countYears;
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }
}
