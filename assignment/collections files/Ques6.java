import java.util.*;

public class Ques6 {
    static void CharacterCount(String[] input){
        LinkedHashMap<String,Integer> charCount= new LinkedHashMap<>();

        for (String i: input){
            if(charCount.containsKey(i))
            {
                charCount.put(i,charCount.get(i)+1);
            }
            else
            {
                charCount.put(i,1);
            }
        }
        System.out.println("Entered inputs with occurance are- \n"+charCount);
        System.out.println("Decreasing order of occurance-");

        List<Map.Entry<String,Integer>> list = new ArrayList<>(charCount.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        for(Map.Entry<String,Integer> e : list){

            System.out.println(e.getKey());
        }
    }


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int size= sc.nextInt();
        String[] entered= new String[size];
        System.out.println("enter the array");
        for(int i=0;i<size;i++) {
             entered[i] = sc.next();
        }
        CharacterCount(entered);
    }
}
