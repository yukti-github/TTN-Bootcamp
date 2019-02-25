class Singleton
{
    private static Singleton instance = null;

    public String s;

    private Singleton()
    {
        s = "Singleton class is running";
    }

    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}

public class Ques4
{
    public static void main(String args[])
    {
        Singleton x = Singleton.getInstance();
        System.out.println(x.s);
        }
}