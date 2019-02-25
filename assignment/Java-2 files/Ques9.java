import java.util.Scanner;

interface Furniture {
    public void stressTest();
    public void fireTest();
}

 abstract class Chair implements Furniture {
    public abstract String chairType();

}
 abstract class Table implements Furniture {
    public abstract String tableType();
}

class MetalChair extends Chair {
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }

    public void fireTest() {
        System.out.println("Passed Fire Test");
    }
    public String chairType() {
        String s = "This is a metal chair";
        return s;
    }
}

class MetalTable extends Table {
    public void stressTest() {

        System.out.println("Passed Stress Test");
    }

    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    public String tableType() {
        String s = "This is a metal Table";
        return s;
    }
}


class WoodenTable extends Table {
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }

    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    public String tableType() {
        String s = "This is a wooden Table";
        return s;
    }
}


class WoodenChair extends Chair {
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }

    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    public String chairType() {
        String s = "This is a wooden chair";
        return s;
    }
}

public class Ques9 {
    public static void main(String[] args){
        Table table = null;
        Chair chair=null;
        System.out.println("enter either metallic or wooden");
        Scanner input =  new Scanner(System.in);
        String str = input.next();
                if(str.equals("wooden")){
            System.out.println("Enter chair or table:- ");
            String entry= input.next();
            if(entry.equals("chair")) {
                chair = new WoodenChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();

            }
            else if(entry.equals("table")){
                table = new WoodenTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();
            }
            else {
                System.out.println("enter either chair or table");
            }


        }    if(str.equals("metallic")){
            System.out.println("Enter chair or table:- ");
            String entry= input.next();
            if(entry.equals("chair")) {
                chair = new MetalChair();
                System.out.println(chair.chairType());
                chair.stressTest();
                chair.fireTest();

            }
            else if(entry.equals("table")){
                table = new MetalTable();
                System.out.println(table.tableType());
                table.stressTest();
                table.fireTest();
            }
            else {
                System.out.println("enter either chair or table");
            }


        }



    }
}