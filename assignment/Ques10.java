public class Ques10 {
    public static void main(String[] args) {
        Ques10 obj= new Ques10();
        System.out.println("Adding integers 4+7= "+obj.addition(4,7));
        System.out.println("Adding double 4.0 +7.0= "+obj.addition(4.0,7.0));
        System.out.println("Multiplying float numbers 8.0, 2.5= "+obj.multiply(8.0f,2.5f));
        System.out.println("Multiplying integers 9,8= "+obj.multiply(9,8));
        System.out.println("concating two strings= "+obj.concat("heyy ","welcome!"));
        System.out.println("Concating three strings= "+obj.concat("heyy ","welcome!"," Dear"));
    }


    public double addition(double a, double b)
    {
         return a+b;
    }
    public int addition(int a,int b)
    {
        return a+b;
    }

    public double multiply(float a,float b)
    {
        return a*b;
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public String concat(String a,String b)
    {
        return a.concat(b);
    }

    public String concat(String a,String b,String c)
    {
        return a.concat(b.concat(c));
    }
}



