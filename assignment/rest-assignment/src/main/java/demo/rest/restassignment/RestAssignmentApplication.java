package demo.rest.restassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "demo.rest.restassignment.repositories")
@EntityScan(basePackages = {"demo.rest.restassignment.entities"})
public class RestAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAssignmentApplication.class, args);
	}

}
