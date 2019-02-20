public class Ques7 {
    static String FirstName="Yukti";
    static String LastName="Sharma";
    static int age=20;



    public static void main(String[] args) {
        System.out.println("\n from main using static variables-");
        System.out.println(" Name is "+FirstName+" "+ LastName+" age is "+age);
        printName();
    }

    static {
        System.out.println("\n Printing in static block:-");
        System.out.println("First name: Yukti,  Last name : Sharma, Age : 20");
    }

    static void printName()
    {
        System.out.println("\n From static method-");
        System.out.println("First name: Yukti,  Last name : Sharma, Age : 20");

    }

}
