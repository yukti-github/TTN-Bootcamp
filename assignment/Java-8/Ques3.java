public class Ques3 {

    int add(int a, int b)
    {
        return a+b;
    }

    int subt(int a,int b)
    {
        return a-b;
    }

    static int multiply(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args) {

        Sum obj= new Ques3()::add;
        System.out.println("sum of 6,7== "+obj.sum(6,7));

        Subt obj2= new Ques3()::subt;
        System.out.println("subtracting 91, and 1= "+obj2.sub(91,1));

        Mul obj3= Ques3::multiply;
        System.out.println("multiplying 40, and 4=  s"+obj3.multiply(40,4));
    }
}


interface Sum{
    int sum(int a, int b);
}

interface Subt{
    int sub(int a,int b);
}

interface Mul{
    int multiply(int x, int y);
}