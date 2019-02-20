
import java.util.Scanner;

public class Ques5 {
    static int k = 0;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of first array");
        int n1= sc.nextInt();
        String[] array1= new String[n1];
        System.out.println("enter the array elements-");
        for(int i=0;i<n1;i++)
        {
            array1[i]= sc.next();
        }


        System.out.println("\n enter size of second array");
        int n2= sc.nextInt();
        String[] array2= new String[n1];
        System.out.println("enter the array elements-");
        for(int i=0;i<n2;i++)
        {
            array2[i]= sc.next();
        }
        Ques5 obj = new Ques5();
        System.out.println("common array elements are- ");
        obj.findCommonElement(array1, array2);
    }

    public void findCommonElement(String[] a, String[] b) {

        String temp = "";

        String[] common = new String[10];
        int tempCounter = 0;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            tempCounter = 0;
            for (int j = 0; j < b.length; j++) {
                if (temp.equals(b[j])) {
                    tempCounter++;
                }
            }
            if (tempCounter >= 1) {
                common[k++] = temp;


            }
        }
                printDistinct(common,k);
    }

        static void printDistinct(String arr[], int n)
        {

            for (int i = 0; i < n; i++)
            {

                int j;
                for (j = 0; j < i; j++)
                    if (arr[i].equals(arr[j]))
                        break;

                if (i == j)
                    System.out.print( arr[i] + " ");
            }
        }
    }
