import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc= new Scanner(System.in);
        String input1= sc.nextLine();
        String input = input1.replace(" ","");
           int size= countUniqueChars(input);
         System.out.println("\n\nNumber of unique characters in "+input+" are ==> "+size);
    }

    public static int countUniqueChars(String input) {
        HashSet<Character> hash = new HashSet<>();
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
            hash.add(input.charAt(i));

        System.out.println("unique characters are- \n");

        Iterator iterator = hash.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next()+" \t");
               return hash.size();
    }


}
