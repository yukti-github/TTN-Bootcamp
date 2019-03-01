
interface DefaultExample{
    default void sum()
    {  int sum=0;
        for(int i=1;i<=10;i++)
        {
             sum+=i;
        }
        System.out.println("sum of first 10 natural numbers is- "+sum);
    }

    static void display()
    {
        System.out.println("Displaying output from static method of interface");
    }
}

public class Ques6 implements DefaultExample
{
    public static void main(String[] args) {
        Ques6 obj= new Ques6();
        obj.sum();
        DefaultExample.display();
    }
}
