interface inter1 {
    default void display(){
        System.out.println("inter1");
    }
}

interface child1 extends inter1{
    default void display(){
        System.out.println("child1");
    }
}

interface child2 extends inter1{
    default void display(){
        System.out.println("child2");
    }
}

public class Ques8 implements child1,child2 {
    public void display(){
        System.out.println("Ques8");
    }

    public static void main(String[] args) {
        Ques8 defaultMethods=new Ques8();
        defaultMethods.display();
    }
}
