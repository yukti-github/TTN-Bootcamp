import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        String[] input= new String[n];
        System.out.println("enter the array with all elements twice except one-");
        for(int i=0;i<n;i++)
        {
            input[i]= sc.next();
        }
        count_elements(input);
    }

    static void count_elements(String[] words)
    {
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
        if(words[i]!="0"&& wrc!=2)
            System.out.println(words[i]+" is repeated "+wrc+ " times ");
        wrc=1;
    }

    }
}
