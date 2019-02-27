import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {
    static  float sum=0.0F;
    public static void main(String[] args) {

        List<Float> list= new ArrayList<Float>();
        list.add(2.4F);
        list.add(1.34F);
        list.add(93.31F);
        list.add(33.22F);
        list.add(1.2003F);

        Iterator<Float> listitr= list.iterator();

        System.out.println("elements of list are-:\n");
        while (listitr.hasNext())
        {
            float n= listitr.next();
            sum += n;
            System.out.println(n);
        }


        System.out.println("========\n"+sum+ "  <== sum of list");
    }
}
