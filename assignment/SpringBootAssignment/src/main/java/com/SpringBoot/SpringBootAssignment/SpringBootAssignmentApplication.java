package com.SpringBoot.SpringBootAssignment;

import com.SpringBoot.SpringBootAssignment.Entity.Database;
import com.SpringBoot.SpringBootAssignment.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAssignmentApplication {

    @Bean
    User user(){
        return new User("YuktiSharma","1234");
    }

    @Bean
    Database database(){
        return new Database();
    }


    public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}

}
