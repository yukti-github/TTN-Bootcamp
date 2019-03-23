package Assignment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    //Ques-16(Bidirectional)
    @ManyToOne
    Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

//    @ManyToMany(mappedBy = "books")
//    List<Author> personList = new ArrayList<Author>();
//    public List<Author> getPersonList() {
//        return personList;
//    }
//    public void setPersonList(List<Author> personList) {
//        this.personList = personList;
//    }
}
