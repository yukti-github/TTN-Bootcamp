import java.util.Stack;

public class Ques7  extends Stack<Integer> {
    private Stack<Integer>minStack=new Stack<Integer>();
    public void push(int element)
    {
        if(minStack.isEmpty())
        {
            super.push(element);
            minStack.push(element);
            System.out.println("pushed- "+element);
        }
        else
        {   super.push(element);
            int minEle=minStack.peek();
            if(element<minEle)
                minStack.push(element);
            else
                minStack.push(minEle);
            System.out.println("pushed- "+element);
        }
    }
    public Integer pop()
    {
        Integer poppedElement=null;
        if(!isEmpty())
            poppedElement=super.pop();
        if(minStack.isEmpty()==false)
            minStack.pop();
        return poppedElement;
    }
    public Integer getMin()
    {
        if(isEmpty()) {
            return null;
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        Ques7 o= new Ques7();
        o.push(4);
        o.push(3);
        o.push(8);
        o.push(1);
        o.push(6);
        System.out.println("\nminimum is "+ o.getMin());
        System.out.println("Popped "+ o.pop());
        System.out.println("Popped "+ o.pop());
        System.out.println("minimum is "+ o.getMin());
        System.out.println("Popped "+ o.pop());
        System.out.println("Popped "+ o.pop());
        System.out.println("minimum is "+ o.getMin());
        System.out.println("Popped "+ o.pop());
        System.out.println("Popped "+ o.pop());
    }
}