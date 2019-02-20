import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string ");
        String input =sc.nextLine();

        System.out.println("Enter the substring to be replaced");
        String input1 =sc.nextLine();

        System.out.println("Enter the new substring");
        String input2 =sc.nextLine();

        System.out.println("The Original String was: "+input);

        System.out.println("The new string is "+input.replace(input1,input2));

    }
}
