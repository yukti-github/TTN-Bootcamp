import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ques5 {
    public static void main(String[] args) {
        Student e1 = new Student("yukti", 60.0, 20.0);
        Student e2 = new Student("Shivam", 100.0, 21.0);
        Student e3 = new Student("Rahul", 70.0, 19.0);
        Student e4 = new Student("Rishabh", 78.5, 18.0);
        Student e5 = new Student("Anky", 78.5, 21.0);

        List<Student> StudentList = new ArrayList<Student>();
        StudentList.add(e1);
        StudentList.add(e2);
        StudentList.add(e3);
        StudentList.add(e4);
        StudentList.add(e5);


        for (Student stu:StudentList)
            System.out.println("Name is- "+stu.Name+"\tAge is- "+ stu.Age+"\tMarks are- "+stu.Score);


        Collections.sort(StudentList,new SortingMarks());
        System.out.println("\nSorted Students on basis of marks are-\n");

        for (Student stu:StudentList)
            System.out.println("Name is- "+stu.Name+"\tAge is- "+ stu.Age+"\tMarks are- "+stu.Score);
    }
}


class Student{
    String Name;
    Double Score;
    Double Age;


    public Student(String Name, Double score, Double age) {
        this.Name = Name;
        Score = score;
        Age = age;
    }

    @Override
    public String toString() {
        return this.Name+" "+this.Age+" "+this.Score;
    }
}

class SortingMarks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.Score.equals(o2.Score))
            return o1.Name.compareTo(o2.Name);
        else {
            if ((o2.Score - o1.Score) > 0) return 1;
            else return -1;

        }
    }
}