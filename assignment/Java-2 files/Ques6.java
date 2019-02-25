public class Ques6 {

    public static void main(String args[]){
        try{
            int array[]=new int[2];
            array[4]=60/0;

            System.out.println("First print statement in try block");
        }

        catch(ArithmeticException e){
            System.out.println("Warning: ArithmeticException");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }

        catch(Exception e){
            System.out.println("Warning: Some Other exception");
        }

        finally {
            System.out.println("execution of finally block");
        }

        System.out.println("Out of try-catch block...");
    }
}
