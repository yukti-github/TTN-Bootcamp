public class Ques13 {
    public static void main(String[] args) {
            try {
                Name1("YUKTI");
            }
            catch (MyException e)
            {
                System.out.println("Exception occured :"+e);
            }

    }
    public static void Name1(String name) throws MyException
    {
        if(name.equals("YUKTI"))
        {
            throw new  MyException(name);
        }
        else System.out.println("no exception");
    }
}
class MyException extends Throwable
{
    public MyException(String s)
    {
        super(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}
