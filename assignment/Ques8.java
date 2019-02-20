public class Ques8 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello, This is a String...");
        System.out.println("Original String: " + str);
        str.reverse();
        System.out.println("Reverse String: " + str);
        str.delete(4, 10);
        System.out.println("After Deleting: " + str);
    }
}
