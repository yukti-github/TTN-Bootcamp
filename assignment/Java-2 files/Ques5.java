public class Ques5 {
    int a;
    int b;

    public Ques5(int a, int b){
        this.a=a;
        this.b=b;
    }

    public Ques5(Ques5 ref){
        a=ref.a;
        b=ref.b;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        AnotherClass obj = new AnotherClass();
        obj.i=1;
        obj.j=3;

        AnotherClass obj1=(AnotherClass)obj.clone();
       System.out.println("through cloneable\n "+obj.i+ " "+ obj1.i+"\n "+obj.j+ " "+ obj1.j);

        Ques5 o = new Ques5(4,6);
        Ques5 o1= new Ques5(o);
        System.out.println("\n through copy constructor\n"+o.a+" "+o.b);
        System.out.println(o1.a+" "+o1.b);
    }
}

class AnotherClass  implements Cloneable {
    int i;
    int j;
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
