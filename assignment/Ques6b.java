import java.util.Scanner;

public class Ques6b {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int[] arr1= new int[n];
        System.out.println("enter the array with all elements twice except one-");
        for(int i=0;i<n;i++)
        {
            arr1[i]= sc.nextInt();
        }
        int c=arr1[0];
        for (int i = 1; i < arr1.length;i++)
        {
            c=c^arr1[i];
        }

        System.out.println("The non repeated element is:"+c);
    }


}
