package Assignment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
//
//    @Id
//     @GeneratedValue(strategy = GenerationType.TABLE)
//    private Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "First_name")
    private String firstName;

    //@Transient
    @Column(name = "Last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "Date_of_Birth")
    @Temporal(TemporalType.DATE)
    private Date DOB;

    @Embedded
    Address address;

    //Solution-12
    @ElementCollection
    List<String> subjects= new ArrayList<String>();


    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    //Solution 15
//    @OneToOne
//    @JoinColumn(name = "Author_and_Book")
//    private Book book;
//
//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }

    //Solution 16 (One to many - unidirectional)
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(joinColumns=@JoinColumn(name = "author_id"),inverseJoinColumns=@JoinColumn(name = "book_id"))
    Collection<Book> books= new ArrayList<>();

    //(WITHOUT ADDITIONAL TABLE)
//    @OneToMany(mappedBy = "author",cascade = CascadeType.PERSIST)
//    Collection<Book> books = new ArrayList<Book>();


    //Solution 17(many to many)
//    @ManyToMany
//    Collection<Book> books= new ArrayList<>();

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Author(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                '}';
    }

    public Author() {
    }
}
