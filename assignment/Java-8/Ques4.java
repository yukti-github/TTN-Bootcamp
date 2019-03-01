
public class Ques4 {

    public static void main(String[] args) {
        EmployeeInterface object= Employee::new;
        Employee emp= object.getEmployee("Yukti",20,"Noida");
        System.out.println("name is "+emp.name+" ,Age is- "+emp.age+" ,city is- "+emp.city);
    }
}

class Employee{
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

interface EmployeeInterface{
    Employee getEmployee(String name,Integer age,String city);
}