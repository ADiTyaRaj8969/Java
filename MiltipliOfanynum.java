import java.util.Scanner;

public class MiltipliOfanynum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any num");
        int num=sc.nextInt();
        int rem=0,mul=1;
        while (num!=0) {
            rem=num%10;
            mul*=rem;
            num/=10;
        }

        System.out.println(mul);
    }
}
