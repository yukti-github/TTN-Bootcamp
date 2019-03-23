package Assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Author person=new Author();
        person.setFirstName("Yukti");
        person.setLastName("Sharma");
        person.setAge(20);

        //Ques-3
        person.setDOB(new SimpleDateFormat("dd-MMMM-yyyy").parse("18-April-1998"));

        Author person2= new Author("Radha","Jain",21);
        person2.setDOB(new SimpleDateFormat("dd-MMMM-yyyy").parse("15-April-1998"));



        //Question4
        Author author1 = new Author();
        author1.setFirstName("Priya");
        author1.setLastName("Saxena");
        author1.setAge(21);
        author1.setDOB(new SimpleDateFormat("dd-MMMM-yyyy").parse("10-March-1998"));

        Author author2 = new Author();
        author2.setFirstName("Neeta");
        author2.setLastName("Saxena");
        author2.setAge(21);
        author2.setDOB(new SimpleDateFormat("dd-MMMM-yyyy").parse("02-May-1997"));
//
//        Author author3 = new Author();
//        author3.setFirstName("Harshi");
//        author3.setLastName("Goyal");
//        author3.setAge(20);
//        author3.setDOB(new SimpleDateFormat("dd-MMMM-yyyy").parse("10-april-1998"));
//
//        Author author4 = new Author();
//        author4.setFirstName("Neetu");
//        author4.setLastName("Rani");
//        author4.setAge(21);
//        author4.setDOB(new SimpleDateFormat("dd-MMMM-yyyy").parse("04-june-1997"));

        //Solution-11

        Address address1= new Address(101,"Vijaynagar","U.P.");
        person.setAddress(address1);
        person2.setAddress(address1);

        Address address2= new Address(102,"Sec-2","U.P.");
        author1.setAddress(address2);

        Address address3= new Address(103,"sec-21","M.P");
        author2.setAddress(address3);


        //Solution-13

        List<String> subjects1= Arrays.asList("hindi","english","math");
        author1.setSubjects(subjects1);
        person.setSubjects(subjects1);

        List<String> subjects2= Arrays.asList("maths","science","computer");
        author2.setSubjects(subjects2);
        person2.setSubjects(subjects2);

        //Solution 15

        Book book1= new Book();
        book1.setBookName("Alice in wonderland");
        Book book2= new Book();
        book2.setBookName("Jungle safari");
        Book book3= new Book();
        book3.setBookName("Paradise");
        Book book4= new Book();
        book4.setBookName("Indiam culture");
        Book book5= new Book();
        book5.setBookName("Indian history");
        Book book6= new Book();
        book6.setBookName("Dancing Lion");
//        author1.setBook(book1);
//        person.setBook(book2);
//        author2.setBook(book3);
//        person2.setBook(book4);


   //     Solution 16 (Unidirection)

        author1.setBooks(Arrays.asList(book1,book2));
        author2.setBooks(Arrays.asList(book3));
        person.setBooks(Arrays.asList(book4,book5));
        person2.setBooks(Arrays.asList(book6));

//        Solution 16 (Bidirectional)

        book1.setAuthor(author1);
        book2.setAuthor(author1);
        book3.setAuthor(author2);
        book4.setAuthor(person);
        book5.setAuthor(person);
        book6.setAuthor(person2);

        //Solution 17
//         author1.getBooks().add(book1);
//         person2.getBooks().add(book1);
//         book2.getPersonList().add(author2);
//        book2.getPersonList().add(author1);
//        book3.getPersonList().add(person);
        //book2.setPersonList(Arrays.asList(person,author2));

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();

        //Create
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(book5);
        session.save(book6);


        session.persist(author1);
        session.persist(author2);
        session.persist(person);
        session.persist(person2);

//        session.save(person);
//        session.save(person2);
//        session.save(author1);
//        session.save(author2);
//        session.save(author3);
//        session.save(author4);


        //Read
        System.out.println("\n*********\n"+session.get(Author.class,1)+"\n*********\n");
        Author author= session.get(Author.class,1);

        //Update
//        author.setFirstName("Rama");
//        session.update(author);

        //Delete
//        session.delete(person2);

        session.getTransaction().commit();

        session.close();

        System.out.println("\n\nData for id=1 is "+author);

    }
}
