import java.util.Scanner;

public class Ques10 {

    private static int token_number=1001;
    private double order_amount;
    private boolean token_status;
    private  boolean payment_status;
    private int[] order_queue;
    private int[] ready_queue;
    private final int MAX_ORDER;
    private Scanner In;
    private static int o_count;


    public Ques10() {
        MAX_ORDER=10;
        token_status=false;
        payment_status=false;
        order_queue=new int[MAX_ORDER];
        ready_queue=new int[MAX_ORDER];
        In=new Scanner(System.in);
    }


    public int customer_requestService() {
        System.out.println("[Pay Bill] Enter amount: ");
        order_amount=In.nextLong();
        if(order_amount>=0) {
            order_queue[o_count]=token_number;
            o_count++;
            token_number++;
            System.out.println("Your Order id is "+token_number+" , please wait.");

            return  token_number;
        } else {
            System.out.println("Amount not paid, try again.");
            return 0;
        }
    }

    public void cashier_processOrder() {
        if(order_queue.length>0) {
            for(int i=0;i<order_queue.length;i++) {
                if(order_queue[i]==0) {
                    break;
                } else {
                    System.out.println("\n*******\nOrder id " +
                            order_queue[i] + " is being prepared.");
                    ready_queue[i] = order_queue[i];
                }
            }
            order_queue=null;
        }
    }

    public void barista_deliverService() {
        if(ready_queue.length>0) {
            for(int i=0;i<ready_queue.length;i++) {
                if(ready_queue[i]==0) {
                    break;
                } else {
                    System.out.println("\n*******\nOrder id " + ready_queue[i] + " is completed.");
                }
            }
            ready_queue=null;
        }
    }

    public static void main(String[] args) {
        Ques10 obj= new Ques10();
        obj.customer_requestService();
        obj.customer_requestService();
        obj.cashier_processOrder();
        obj.barista_deliverService();
    }

}