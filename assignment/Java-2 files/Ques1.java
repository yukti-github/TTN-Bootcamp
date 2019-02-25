import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Student {

    void studentInfo(String name, int s_id, String city);

    void batchInfo(String batch);
}

public abstract class Ques1 implements Student {
    String name;
    int s_id;
    String city;
    String batch;

    @Override
    public void studentInfo(String n, int s, String c) {
        name = n;
        s_id = s;
        city = c;
        System.out.println("Student name is " + name + " ," +
                " \nStudent id is: " + s_id + " \nStudent belongs to: " + city);
    }

    @Override
    public void batchInfo(String b) {
        batch = b;
        System.out.println(name + " is of batch:- " + batch);
    }

    abstract public void BookDetails(int bookid, String bookName);
}

class Library extends Ques1 {
    String book;
    int bookid;

    @Override
    public void BookDetails(int bookid, String bookName) {
        book = bookName;
        this.bookid = bookid;
        System.out.println("Book issued is:-\nBook id- " + bookid + "\nName:- " + book);
    }

    public void dateissued(String date2) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter.parse(date2);
            System.out.println("Date of issue is: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}

class Main {

    public static void main(String[] args) {
        Library obj = new Library();
        obj.studentInfo("Yukti", 1121, "delhi");
        obj.batchInfo("B.Tech-IT-2019");
        obj.BookDetails(101, "DigitalLogic");
        obj.dateissued("31/03/2015");


    }
}
