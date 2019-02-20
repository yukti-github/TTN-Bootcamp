 class Bank {

        double rate_of_interest;
        String branch_name;
        String Bank_name;
        public Bank(double rate_of_interest, String branch_name, String Bank_name)
        {
            this.rate_of_interest = rate_of_interest;
            this.branch_name=branch_name;
            this.Bank_name=Bank_name;
        }

        public void getDetails(){
            System.out.println("Bank name is: "+Bank_name);
            System.out.println("Branch name is "+ branch_name);
            System.out.println("Rate of interest is "+ rate_of_interest+"% per annum");
        }


}

public class Main{

    public static void main(String[] args) {
        SBI sbi= new SBI(2.7,"Noida 127","State Bank of India");
        ICICI icici= new ICICI(2.5,"Noida 43","ICICI");
        BOB bob= new BOB(2.4,"Delho 32","Bank of Baroda");
        System.out.println("Details of SBI:");
        sbi.getDetails();
        System.out.println("\nDetails of ICICI:");
        icici.getDetails();
        System.out.println("\nDetails of BOB:");
        bob.getDetails();
    }
}

class SBI extends Bank{
    public SBI(double rate_of_interest, String branch_name, String Bank_name) {
        super(rate_of_interest, branch_name, Bank_name);
    }

}

class BOB extends Bank{
    public BOB(double rate_of_interest, String branch_name, String Bank_name) {
        super(rate_of_interest, branch_name, Bank_name);
    }
}

class ICICI extends Bank{
    public ICICI(double rate_of_interest, String branch_name, String Bank_name) {
        super(rate_of_interest, branch_name, Bank_name);
    }
}