import java.util.Scanner;

public class Ques4 {

    static int Uppercase=0;
    static  int Lowercase=0;
    static int digits=0;
    static int others=0;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input1= sc.nextLine();
        String input= input1.replace(" ","");
         int total_length = input.length();

        Ques4 o = new Ques4();
        o.Occurance(input);
        o.CalculatePercentage(total_length,input);
    }

    void Occurance(String input) {

        for (int i = 0; i < input.length(); i++) {
            char value = input.charAt(i);
            if (Character.isUpperCase(value)) {
                Uppercase++;
            } else if (Character.isLowerCase(value)) {
                Lowercase++;
            } else if (Character.isDigit(value)) {
                digits++;
            } else
                others++;
        }
    }

    void CalculatePercentage(int length, String input) {
        double upper_percent = ((Uppercase * 100.0) / length);
        double lower_percent = (Lowercase * 100.0) / length;
        double digits_percent = (digits * 100.0) / length;
        double other_percent = (others * 100.0) / length;
        System.out.println("The string has " + Uppercase + " Uppercase letters, i.e => " + upper_percent + "% ");
        System.out.println("The string has " + Lowercase + " Lowercase letters, i.e => " + lower_percent + "% ");
        System.out.println("The string has " + digits + " digits, i.e => " + digits_percent + "% ");
        System.out.println("The string has " + others + " special symbols, i.e => " + other_percent + "% ");
    }
}
