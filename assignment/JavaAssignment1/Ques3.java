import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input= sc.nextLine();

        System.out.println("Enter the character : ");
        String character= sc.nextLine();

        if(character.length()>1)
            System.out.println("enter only one character");
        else
            {

            int length = input.length();
            String input2 = input.replace(character, "");
            int length_of_char = length - input2.length();

            System.out.println("occurance of character is " + length_of_char);
           }


    }
}
