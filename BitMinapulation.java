import java.util.Scanner;

public class BitMinapulation {
    public static void main(String[] args) {
        System.out.println("enter the number to Minpulate");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the posi ");
        int i=sc.nextInt();
        int Bitmask=1<<i;
        int NotBitmask=~(Bitmask);
        int result =(NotBitmask&n);
        System.out.println(result);
        int result2=(Bitmask|n);
        System.out.println(result2);
    }
}
