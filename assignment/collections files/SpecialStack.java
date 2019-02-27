import java.util.*;

class SpecialStack
{
    Stack<Integer> mystack=  new Stack<Integer>();
    Integer minEle;

    void getMin()
    {
        if (mystack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Minimum Element in the " +
                    " stack is: " + minEle);
    }

    void peek()
    {
        if (mystack.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer top = mystack.peek();

        System.out.print("Element is: ");

        if (top < minEle)
            System.out.println(minEle);
        else
            System.out.println(top);
    }

    void pop()
    {
        if (mystack.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }


        Integer top = mystack.pop();
        if (top < minEle)
        {
            System.out.println("Element Removed: "+minEle);
            minEle = 2*minEle - top;
        }

        else
            System.out.println("Element Removed: "+top);
    }
    void push(Integer x)
    {
        if (mystack.isEmpty())
        {
            minEle = x;
            mystack.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
        if (x < minEle)
        {
            mystack.push(2*x - minEle);
            minEle = x;
        }

        else
            mystack.push(x);

        System.out.println("Number Inserted: " + x);
    }

    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();
        stack.push(6);
        stack.push(4);
        stack.getMin();
        stack.push(2);
        stack.push(1);
        stack.peek();
        stack.push(7);
        stack.getMin();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.getMin();

    }
}

