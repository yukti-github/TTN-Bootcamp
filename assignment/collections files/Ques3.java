import java.util.HashMap;
import java.util.Scanner;

public class Ques3 {
    static void CharacterCount(String input){
        HashMap<Character,Integer> charCount= new HashMap<>();
        char[] array= input.toCharArray();
        for (char i: array){
            if(charCount.containsKey(i))
            {
                charCount.put(i,charCount.get(i)+1);
            }
            else
            {
                charCount.put(i,1);
            }
        }
        System.out.println(charCount);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String entered1= sc.nextLine();
        String entered= entered1.replace(" ","");
        CharacterCount(entered);
    }
}
