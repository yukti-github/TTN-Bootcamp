package com.demo.thymleafProject.Repository;

import org.springframework.data.repository.CrudRepository;
import com.demo.thymleafProject.Entity.User;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    Optional<User> findById(Integer id);
}