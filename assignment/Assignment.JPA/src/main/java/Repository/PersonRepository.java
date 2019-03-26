package Repository;

import Entity.Person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findByFirstName(String name);

    Person findByLastName(String lname);

    Person findById(Integer id);

    //Question 6
    @Query("SELECT firstName from Person where age=:age")
    String findByAge(@Param("age") Integer age);

    //Q7- Use @Query to fetch firstname and lastname of the Person whose age is 25.
    @Query("select firstName,lastName from Person where age = :age")
    List<Person[]> findFirstNameAndLastNameByAge(@Param("age") Integer age);


    //Q8 Get complete information of the Employee whose age is 25 using @Query.
    @Query("SELECT e from Person e where age=:age")
    Person findPersonByAge(@Param("age") Integer age);

    //Q9 Count Person where name is "Peter" using @Query.
    @Query("SELECT COUNT(*) FROM Person where firstName=:firstName")
    Integer countByFirstName(@Param("firstName") String firstName);


    //Q10- Implement following methods for Person repository: count
    Integer countById(Integer id);

    //Q10- Implement following methods for Person repository: distinct
    List<Person> findDistinctByFirstName(String firstName);

    //Q10- Implement following methods for Person repository: or
    List<Person> findByFirstNameOrLastName(String firstName, String lastName);

    //Q10- Implement following methods for Person repository: and
    List<Person> findByFirstNameAndLastName(String firstName, String lastName);

    //Q10- Implement following methods for Person repository: between
    List<Person> findByAgeBetween(int min, int max);

    //Q10- Implement following methods for Person repository: less than
    List<Person> findByAgeLessThan(int max);

    //Q10- Implement following methods for Person repository: greater than
    List<Person> findByAgeGreaterThan(int min);

    //Q10- Implement following methods for Person repository: like
    List<Person> findByFirstNameLike(String firstName);

    //Q10- Implement following methods for Person repository: not
    List<Person> findByFirstNameNot(String firstName);

    //Q10- Implement following methods for Person repository: in
    List<Person> findByAgeIn(List<Integer> ageList);

    //Q10- Implement following methods for Person repository: ignore case
    List<Person> findByFirstNameIgnoreCase(String firstName);


    //Ques 11- Get the persons greater than age 25 and sort them in descending order according to id by method query.
    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);


    //Ques 12 Do  the question above using the Sort class.
    List<Person> findByAgeGreaterThan(Integer age,Sort sort);

    //Ques 13 Apply Pagination on Person entities.
    Page<Person> findAll(Pageable pageable);
    }

