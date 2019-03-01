interface DefaultDemo {
    default void display(){
        System.out.println("Display from Demo interface");
    }
}

public class Ques7 implements DefaultDemo {

    public void display(){
        System.out.println("Display from Ques7");
    }

    public static void main(String[] args) {
        Ques7 defaultMethods= new Ques7();
        defaultMethods.display();
    }
}
