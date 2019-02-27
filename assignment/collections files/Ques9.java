import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ques9 {

    public static void main(String args[]) {
        Date today = new Date();

        DateFormat df = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:SS z");
        //DateFormat df = new SimpleDateFormat("HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        System.out.println("Date in Indian Timezone (IST) : " + IST);

        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = df.format(today);
        System.out.println("Date in PST Timezone : " + PST);

        df.setTimeZone(TimeZone.getTimeZone("UK"));
        String UK = df.format(today);
        System.out.println("Date in UK Timezone : " +UK);


    }

}
