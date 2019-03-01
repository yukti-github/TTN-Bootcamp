public class Ques2 {

    static int oneReturn(int one, int two)
    {
        return one;
    }

    public static void main(String[] args) {

        Demo demo1 = Ques2::oneReturn;
        System.out.println("returning one integer- " + demo1.demo(89, 33));
    }

}


interface Demo{
    int demo(int a, int b);
}