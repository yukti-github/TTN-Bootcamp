package demo.rest.restassignment.repositories;

import demo.rest.restassignment.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}