package com.SpringBoot.SpringBootAssignment.Service;

        import org.springframework.stereotype.Service;
        import com.SpringBoot.SpringBootAssignment.Entity.Student;
        import java.util.Arrays;
        import java.util.List;

@Service
public class StudentService {

    public static List<Student> getStudents(){
        return Arrays.asList(new Student("Yukti",101,"12th"),
                new Student("Rishabh",110,"11th"));
    }
}
