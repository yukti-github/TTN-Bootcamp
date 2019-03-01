
interface Greater{
    boolean greater(int a,int b);
}

interface Increment{
    int increment(int a);
}
interface Concat{
    String concat(String one, String two);
}
interface UpperCase{
    String upper(String input);
}

public class Ques1 {
    public static void main(String[] args) {

        Greater object1= (a,b)->(a>b)?true: false;
        System.out.println("is 5 greater than 2? "+object1.greater(5,2));

        Increment object2 = a->a+1;
        System.out.println("increment 8 by 1= "+object2.increment(8));

        Concat object3= (a,b)->a+b;
        System.out.println("concat two strings- "+object3.concat("heyyy ","there!"));

        UpperCase object4= a->a.toUpperCase();
        System.out.println("upper case- "+object4.upper("yukti sharma"));
    }
}