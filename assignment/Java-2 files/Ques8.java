//WAP to read words from the keyboard until the word done is entered.
//        For each word except done, report whether its first character is equal   to  its last character.
//        For the required loop, use a
//        a)while statement
//        b)do-while statement
//


import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter word");
        String word = sc.next();
              while(!word.equals("done"))
        {

                if(word.charAt(0)==(word.charAt(word.length()-1)))
            {
                System.out.println("first and last character are equal");
            }

            else {
                System.out.println("first and last character are not equal");
            }
            System.out.println("enter other word");
            word= sc.next();

            }


        }

}

