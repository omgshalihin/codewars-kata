package speedUnit;

public class Cockroach {

    public int cockroachSpeed(double x) {
        int secondsInHour = 3600;
        int cmInKm = 100000;
        return (int) (x * cmInKm / secondsInHour);
    }

    public static void main(String[] args) {
        Cockroach c = new Cockroach();
        System.out.println(c.cockroachSpeed(1.08));
    }
}

//public class Cockroach{
//    public int cockroachSpeed(double kph){
//        int secondsInHour = 3600;
//        int cmInKm = 100000;
//        int centimetresPerSecond = (int) (kph * cmInKm / secondsInHour);
//        return centimetresPerSecond;
//    }
//}