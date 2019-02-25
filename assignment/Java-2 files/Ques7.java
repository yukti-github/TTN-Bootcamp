import java.util.Scanner;
public class Ques7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input seconds");
        long seconds= sc.nextLong();
        System.out.println(seconds+" seconds equals to:==>\n");
        ConvertSectoDay(seconds);
    }
    static void ConvertSectoDay(long n)
    {
        long day = n / (24 * 3600);

        n = n % (24 * 3600);
        long hour = n / 3600;

        n= n% 3600;
        long minutes = n / 60 ;

        n =n% 60;
        long seconds = n;

        System.out.println(day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }
}

