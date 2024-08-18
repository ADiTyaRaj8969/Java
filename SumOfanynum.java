import java.util.Scanner;

public class SumOfanynum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any num");
        int num=sc.nextInt();
        int rem=0,sum=0;
        while (num!=0) {
            rem=num%10;
            sum+=rem;
            num/=10;

        }
        System.out.println(+sum);
    }
}
