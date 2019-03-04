//QUES 8 - Implement proxy design for accessing Record of a student and allow the access only to Admin.
package Ques8;

class Student{
    String name;
    Integer age;
    Integer className;

    public Student(String name, Integer age, Integer className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassName() {
        return className;
    }

    public void setClassName(Integer className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className=" + className +
                '}';
    }
}

interface ValidRecord{
    void CheckValidity();
}

class CheckingData implements ValidRecord{
    protected Student student;

    public CheckingData(Student student) {
        this.student = student;
    }

    @Override
    public void CheckValidity() {
        System.out.println("checking the validity of records");
    }
}

class Admin extends CheckingData{
    public Admin(Student student) {
        super(student);
    }

    @Override
    public void CheckValidity() {
        if(student.getAge()>20||student.getClassName()>12)
            System.out.println("Invalid record found");
        else
        {
            super.CheckValidity();
            System.out.println("valid student data ");
    }
    }
}
public class Proxy {
    public static void main(String[] args) {
        Student yukti= new Student("yukti",18,11);
        System.out.println(yukti);
        ValidRecord data= new Admin(yukti);
        data.CheckValidity();

        Student varsha= new Student("varsha",21,14);
        System.out.println(varsha);
        ValidRecord data2= new Admin(varsha);
        data2.CheckValidity();
    }
}
