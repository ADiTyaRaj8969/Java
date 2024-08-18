import java.util.Scanner;

public class GcdOfNumber {
    public static void gcd(int first,int second) {
        while (first!=second) {
            if(first>second){
                first=first-second;
            }
            else{
                second=second-first;
            }
            
        }
        System.out.println("GCD is"+second);
        
    }
    public static void main(String[] args) {
        System.out.println("enter first number ");
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        System.out.println("enter Second number ");
        int second=sc.nextInt();
        gcd(first, second);

    }
}
