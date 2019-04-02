package demo.rest.restassignment.exceptions;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {

      //  message = "not a valid id of student";
        super(message);
    }

}