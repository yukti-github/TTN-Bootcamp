import Config.PersistenceContext;
import Entity.Person;
import Repository.PersonRepository;
import Service.ServiceJPA;
import org.hibernate.annotations.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
        ServiceJPA servicejpa = context.getBean(ServiceJPA.class);

        //Solution-2,3  Perform all the methods inside CrudRepository for Person Class

        servicejpa.AddingData();
        servicejpa.SavingByIterable();
        servicejpa.FindAll();
        System.out.println(servicejpa.FindOne(1));
        System.out.println(servicejpa.Exists(2));
//        servicejpa.Delete(2);
//        servicejpa.deleteWithEntity();


        //Ques 4- For class Person find person declare methods in repository to find person by firstname, lastname and Id.
        //Ques 5 - Use the methods declared above to fetch the person.

        System.out.println("\nfinding by firstname " + servicejpa.findByFirstName("nidhi"));
        System.out.println("\nfinding by last name " + servicejpa.findByLastName("sharma"));
        System.out.println("\nfinding by id " + servicejpa.findById(4));


        //Ques 6- Use @Query to fetch firstname of the Person whose age is 25.
        servicejpa.findByAge(25);

        //Q7- Use @Query to fetch firstname and lastname of the Person whose age is 25.
        servicejpa.findFirstNameAndLastNameByAge(25);

        //Q8 Get complete information of the Employee whose age is 25 using @Query.
        servicejpa.findPersonByAge(25);

        //Ques9 Count Person where name is "Peter" using @Query.
        servicejpa.countByFirstName("Peter");

        //Ques 10-
        servicejpa.sol10();

        servicejpa.Ques11();

        servicejpa.Ques12();

        servicejpa.findAllByPagination();
    }
}
