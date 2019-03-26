package Service;

import Entity.Person;
import Repository.PersonRepository;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceJPA {
    @Autowired
    PersonRepository personRepository;

    // Solution-2,3

    public void AddingData() {
        Person person = new Person();
        person.setAge(20);
        person.setFirstName("yukti");
        person.setLastName("sharma");
        person.setSalary(94000);
        personRepository.save(person);

        Person person2 = new Person();
        person2.setAge(21);
        person2.setFirstName("nidhi");
        person2.setLastName("dixit");
        person2.setSalary(68890);
        personRepository.save(person2);
    }

    public void SavingByIterable() {
        Person person3 = new Person();
        person3.setAge(25);
        person3.setFirstName("Shivam");
        person3.setLastName("verma");
        person3.setSalary(24000);

        Person person4 = new Person();
        person4.setAge(17);
        person4.setFirstName("yukti");
        person4.setLastName("gupta");
        person4.setSalary(26890);

        Iterable<Person> persons = Arrays.asList(person3, person4);
        personRepository.save(persons);
    }

    public void FindAll() {
        Iterable<Person> personIterable = personRepository.findAll();
        System.out.println("\n\n" + personIterable + "\n\n");
    }


    public Boolean Exists(Integer id) {
        return personRepository.exists(id);
    }

    public Person FindOne(Integer id) {
        return personRepository.findOne(id);
    }

    public void Delete(Integer id) {
        personRepository.delete(id);
    }

    public void deleteWithEntity() {
        Person person8 = personRepository.findOne(1);
        personRepository.delete(person8);
    }

    //Question 4,5 -
    public Person findByFirstName(String name) {
        return personRepository.findByFirstName(name);
    }

    public Person findByLastName(String lname) {
        return personRepository.findByLastName(lname);
    }

    public Person findById(Integer id) {
        return personRepository.findById(id);
    }


    // Question 6 Use @Query to fetch firstname of the Person whose age is 25.

    public void findByAge(Integer age) {
        System.out.println(personRepository.findByAge(age));
    }

    //Q7- Use @Query to fetch firstname and lastname of the Person whose age is 25.
    public void findFirstNameAndLastNameByAge(Integer age) {
        for (Object[] result : personRepository.findFirstNameAndLastNameByAge(age)) {
            String firstName = (String) result[0];
            String lastName = (String) result[1];
            System.out.println("FirstName: " + firstName + ", LastName: " + lastName);
        }
    }

    //Q8 Get complete information of the Employee whose age is 25 using @Query.

    public void findPersonByAge(Integer age) {
        System.out.println("Person of age " + age + " =>" + personRepository.findPersonByAge(age));
    }

    //Q 9 Count Person where name is "Peter" using @Query.
    public void countByFirstName(String name) {
        System.out.println("Number of people with name " + name + " are= " + personRepository.countByFirstName(name));
    }

    //Ques10-
    public void sol10() {
        System.out.println("\n number of people with id=2 are "+personRepository.countById(2));
        System.out.println("\n finding distinct by first name "+personRepository.findDistinctByFirstName("yukti"));
        System.out.println("\n finding by first name or last name"+personRepository.findByFirstNameOrLastName("shivam","gupta"));
        System.out.println("\n find by first or last name "+personRepository.findByFirstNameAndLastName("nidhi","dixit"));
        System.out.println("\n people of age between 16 and 22 "+personRepository.findByAgeBetween(16,22));
        System.out.println("\n People of age greater than "+personRepository.findByAgeGreaterThan(21));
        System.out.println("\n Age in "+personRepository.findByAgeIn(Arrays.asList(10,20,22,21,24)));
        System.out.println("\n age less than 24 "+personRepository.findByAgeLessThan(24));
        System.out.println("\n name with like operator "+personRepository.findByFirstNameLike("yu%"));
        System.out.println("\n first name not yukti "+personRepository.findByFirstNameNot("yukti"));
        System.out.println("\n ignore case for first name"+personRepository.findByFirstNameIgnoreCase("yUKtI"));
    }

    public void Ques11()
    {
        System.out.println(personRepository.findByAgeGreaterThanOrderByIdDesc(25));
    }

   public void Ques12()
    {
        System.out.println(personRepository.findByAgeGreaterThan(20,new Sort(Sort.Direction.DESC,"age")));
    }

    public void findAllByPagination(){
        Page<Person> personPage = personRepository.findAll(new PageRequest(0,2));
        List<Person> personList = personPage.getContent();
        System.out.println("Page 0 : "+personList);

        personPage = personRepository.findAll(new PageRequest(1,2));
        personList = personPage.getContent();
        System.out.println("Page 1 : "+personList);
    }
}

