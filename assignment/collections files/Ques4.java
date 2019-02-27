import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ques4 {
    public static void main(String[] args) {
        Employee e1 = new Employee(23, 99999, "yukti");
        Employee e2 = new Employee(21, 13399, "priya");
        Employee e3 = new Employee(20, 13399.2, "seema");
        Employee e4 = new Employee(30, 102299, "Reema");
        List<Employee> EmployeeList = new ArrayList<Employee>();
        EmployeeList.add(e1);
        EmployeeList.add(e2);
        EmployeeList.add(e3);
        EmployeeList.add(e4);

        for (Employee emp:EmployeeList)
            System.out.println("Name is- "+emp.name+"\tAge is- "+ emp.age+"\tSalary is- "+emp.salary);


        Collections.sort(EmployeeList,new Sorting());
        System.out.println("\nSorted Employees on basis of highest salary are-\n");

        for (Employee emp:EmployeeList)
            System.out.println("Name is- "+emp.name+"\tAge is- "+ emp.age+"\tSalary is- "+emp.salary);
    }
}


class Employee{
   double age;
   double salary;
    String name;

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.salary;
    }
}

class Sorting implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
           if((o2.salary-o1.salary)>=0) return 1;
           else return -1;
    }
}