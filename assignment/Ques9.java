public class Ques9 {
    enum Houses {
        ABC_Villa(9000), ANtilia(9999), XYZ_house(500), flat(150),flat2(129);

        private long price;

        Houses(long p) {
            price = p;
        }
        long getPrice() {
            return price;
        }
    }

        public static void main(String args[]){
            System.out.println("All houses prices:");
            for (Houses c : Houses.values())
            {
                System.out.println(c + " costs " + c.getPrice() + " lakh rupees.");
            }

    }

}


