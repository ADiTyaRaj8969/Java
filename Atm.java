import java.util.Scanner;

public class Atm {
    public static void atmr(int n,int RealAccno,int RealPass){
        int Balance=100000;
        do{
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter 1 to check Balance\nEnter 2 to check Withdraw\nEnter 3 to deposit\nEnter 4 to exit");
            n=sc.nextInt();
            switch (n) {
                case 1:
                System.out.println("Your Balance is :"+Balance);
                break;
                case 2:
                System.out.println("Your current Balance is :"+Balance);
                System.out.println("How Many do you want to Withdraw");
                int With=sc.nextInt();
                System.out.println("enter your Password for conformation");
                int pass=sc.nextInt();
                if(pass==RealPass){
                Balance-=With;
                System.out.println("Now Your current Balance is :"+Balance);}
                else{
                    System.out.println("Your Pass is Incorrect so Account has been blocked");
                    n=4;
                    break;
                }

                break;
                case 3:
                System.out.println("Your current Balance is :"+Balance);
                System.out.println("Enter Amount you want to deposit");
                int depo=sc.nextInt();
                System.out.println("Enter your Account Number to conform");
                int Accno=sc.nextInt();
                if(Accno==RealAccno){
                    Balance+=depo;
                    System.out.println("Now your current Balance is :"+Balance);
                }
                else{
                    System.out.println("enter valid account no and try again");
                    break;
                }
                break;
                case 4:
                System.out.println("Thank You");
                n=4;
                break;
            
                
            }
            


    }while(n!=4);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Account no");
        int RealAccno=122354;
        int Accno=sc.nextInt();
        int RealPass=382005;
        System.out.println("enter your password");
        int Pass=sc.nextInt();
        int n=1;
        if(Accno==RealAccno&&Pass==RealPass){
            atmr(n,RealAccno,RealPass);

        }
        else{
            System.out.println("enter valid Account num or Password");
        }
        

    }
}
