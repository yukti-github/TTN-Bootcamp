import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ques8 {
    public static void main(String[] args) {
        Calendar date= Calendar.getInstance();
        //date.set(2016,2,21);
        date.set(2016,Calendar.MARCH,21);
        SimpleDateFormat date2 = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(date2.format(date.getTime()));

    }
}
