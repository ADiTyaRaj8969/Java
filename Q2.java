class Bank{
    int rate;
    void interestRate(int ammount)  {
        System.out.println(" Print interest ");
    }

}

class SBI extends Bank{
    int rate = 6;
    void interestRate(int ammount)  {
        System.out.println("Interest for SBI is : ");
        System.out.println((ammount * rate) / 100);
    }

}
class ICICI extends Bank{
    int rate = 7;
    void interestRate(int ammount)  {
        System.out.println("Interest for ICICI is : ");
        System.out.println((ammount * rate) / 100);
    }

}
class HDFC extends Bank{
    int rate = 8;
    void interestRate(int ammount)  {
        System.out.println("Interest for HDFC is : ");
        System.out.println((ammount * rate) / 100);
    }

}
public class Q2 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();
        sbi.interestRate(1000);
        icici.interestRate(500);
        hdfc.interestRate(75);
    }
}