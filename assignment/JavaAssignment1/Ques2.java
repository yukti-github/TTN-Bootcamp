import java.util.*;
public class Ques2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string");
        String input= sc.nextLine();

        String[] words=input.split(" ");
        int wrc=1;

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {

                if(words[i].equals(words[j]))
                {
                    wrc=wrc+1;
                    words[j]="0";
                }
            }
            if(words[i]!="0"&& wrc!=1)
                System.out.println(words[i]+" is repeated "+wrc+ " times ");
            wrc=1;

        }
    }
}
