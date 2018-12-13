package yo;

public class LikesStatistic {
    public static void main(String[] args) {
        long likesCount = 102;
        long likesCount1 = 102;
        int registrationYear = 2014;
        int registrationYear1 = 2018;
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = (double) likesCount / (currentYear - registrationYear + 1) ;
        double likesPerYear1 = (double) likesCount1 / (currentYear - registrationYear1 + 1);

        System.out.println(likesPerYear + " likes / year" );
        System.out.println(likesPerYear1 + " likes / year" );
    }
}